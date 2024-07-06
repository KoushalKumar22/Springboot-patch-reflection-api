package com.example.PutAndPatch.Controller;

import com.example.PutAndPatch.Entity.Putandpatch;
import com.example.PutAndPatch.Repository.PutandpatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class PutandpatchController {

    @Autowired
    PutandpatchRepository prepo;

    @GetMapping("/test")
    public String test(){
        return "This Is  Test Run";
    }

    @PostMapping("/save")
    public String save(@RequestBody Putandpatch putandpatch){
        prepo.save(putandpatch);
        return "'Data Saved";
    }

    @GetMapping("/all")
    public List<Putandpatch> findAll(){
        return prepo.findAll();
    }

    @PutMapping("upds/{id}")
    public Putandpatch update(@PathVariable int id, @RequestBody Putandpatch putandpatch){

        Putandpatch a=prepo.findById(id).get();
        a.setName(putandpatch.getName());
        a.setRollno(putandpatch.getRollno());
        return prepo.save(a);
    }

    @PatchMapping("upd/{id}")
    public Putandpatch patchup(@PathVariable int id, @RequestBody Putandpatch putandpatch){

        Putandpatch a=prepo.findById(id).get();
        a.setName(putandpatch.getName());
//        a.setRollno(putandpatch.getRollno());  //enable if u want to update both;
        return prepo.save(a);
    }


    @RequestMapping("/update/{id}")
    public Putandpatch upById(@PathVariable int id, @RequestBody Map<String,Object> fields){

        Optional<Putandpatch> p=prepo.findById(id);

        fields.forEach((key,value) ->
        {
            Field field= ReflectionUtils.findField(Putandpatch.class, key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, p.get(), value);
        });
        return prepo.save(p.get());
    }
}
