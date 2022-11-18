package org.code_with_abdullah;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name="students")
public class Student {
    @Id
    @Column(name = "id")
    private int rollNo;
    @Column(name = "student_name")
    private String name;

    @OneToMany
    private List<Laptop> laptop = new ArrayList<>();

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
