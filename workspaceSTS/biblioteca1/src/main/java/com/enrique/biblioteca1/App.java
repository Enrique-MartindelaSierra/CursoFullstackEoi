package com.enrique.biblioteca1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session= sessionFactory.openSession();
        if(session!=null) {
        	System.out.println("sesion abierta");
        }else {
        	System.out.println("fallo al abrir la sesion");
        }
        
    
    
    }
}
