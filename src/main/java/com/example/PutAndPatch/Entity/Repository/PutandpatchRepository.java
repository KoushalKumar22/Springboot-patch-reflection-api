package com.example.PutAndPatch.Entity.Repository;

import com.example.PutAndPatch.Entity.Putandpatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PutandpatchRepository extends JpaRepository<Putandpatch,Integer> {
}
