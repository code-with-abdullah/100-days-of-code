package org.code_with_abdullah;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Main {
    public static void main(String[] args) {
        Alien alien = null;

        Configuration cfg = new Configuration().configure().addAnnotatedClass(Alien.class);
        ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
        SessionFactory sf = cfg.buildSessionFactory(sr);

        Session session = sf.openSession();

        Transaction t = session.beginTransaction();

        alien = (Alien) session.get(Alien.class, 1);

        t.commit();

        System.out.println(alien);
    }
}