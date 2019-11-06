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
        String name,cname;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr n");
        n = sc.nextInt();
        if(n == 1){
        	  System.out.println("Enter name");
        	  name = sc.nextLine();
        	  stud.setName(name);
        	  System.out.println("Enter cname");
        	  cname = sc.nextLine();
              stud.setCname(cname);
              session.beginTransaction();
              session.save(stud);
        }
        else if(n == 2){
        	stud.setId(71);
        	System.out.println("Enter name");
      	  name = sc.nextLine();
      	  stud.setName(name);
      	  System.out.println("Enter cname");
      	  cname = sc.nextLine();
            stud.setCname(cname);
              
              session.beginTransaction();
              session.update(stud);
        }
        
      
      
        session.getTransaction().commit();
    }
}
