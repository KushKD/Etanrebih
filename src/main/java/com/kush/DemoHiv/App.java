package com.kush.DemoHiv;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Alien alien = new Alien();
        alien.setId(7);
        alien.setAid("sds");
        alien.setColor("Pink");
        alien.setName(new Name("Kush","Kumar","Dhawan","Khubba"));
        
        
        Configuration conf = new Configuration().configure().addAnnotatedClass(Alien.class); 
        
        ServiceRegistry srv = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
        SessionFactory sf = conf.buildSessionFactory(srv);
        
        Session session = sf.openSession();
       Transaction tx =  session.beginTransaction();
        session.save(alien);
       alien = (Alien)session.get(Alien.class,7);
        tx.commit();
        System.out.println(alien);
    }
}
