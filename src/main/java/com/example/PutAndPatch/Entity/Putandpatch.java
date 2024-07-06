package com.example.PutAndPatch.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "PatchDemo")
public class Putandpatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    int id;
    @Column(name = "Name")
    String name;
    @Column(name = "Roll No")
    int rollno;

    public Putandpatch() {
    }

    public Putandpatch(int id, String name, int rollno) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}
