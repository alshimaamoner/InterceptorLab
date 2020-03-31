/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_one;

import entity.Account;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author DELL
 */
public class Lab_one {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
       SessionFactory factory = cfg.buildSessionFactory();
      Session session = factory.openSession(new  AccountInterceptor());
      Account account = new Account();
        account.setUserName("doaa");
        account.setFullName("doaaAhmed");
        account.setPhone("0235355637");
        account.setPassword("1223");
        account.setBirthday(new Date());
        session.beginTransaction();
        session.save(account);
        session.getTransaction().commit();
    
    }
    
}
