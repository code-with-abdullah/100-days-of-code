package org.code_with_abdullah;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setRollNo(1);
        student1.setName("Test");

        Student student2 = new Student();
        student2.setRollNo(2);
        student2.setName("Test2");

        Laptop dell = new Laptop();
        dell.setLid(1);
        dell.setName("DELL");

        Laptop hp = new Laptop();
        hp.setLid(2);
        hp.setName("hp");

        student1.getLaptop().add(dell);
        student2.getLaptop().add(hp);

        Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
        SessionFactory sf = cfg.buildSessionFactory(sr);

        Session session = sf.openSession();

        Transaction t = session.beginTransaction();

        session.save(dell);
        session.save(hp);
        session.save(student1);
        session.save(student2);

        t.commit();


    }
}