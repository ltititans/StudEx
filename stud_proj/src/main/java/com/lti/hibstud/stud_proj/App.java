package com.lti.hibstud.stud_proj;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration conf = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
        SessionFactory factory = conf.buildSessionFactory(builder.build());
        Session session = factory.openSession();
        Student stud=new Student();
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n == 1){
        	  stud.setName("Sush");
              stud.setCname("Java");
              session.beginTransaction();
              session.save(stud);
        }
        else if(n == 2){
        	  stud.setName("Ak");
              stud.setCname("Java");
              stud.setId(11);
              session.beginTransaction();
              session.update(stud);
        }
        
      
      
        session.getTransaction().commit();
    }
}
