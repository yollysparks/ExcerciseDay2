/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Enum.Address;
import Enum.Customer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author felesiah
 */
public class Testing {
    
    public static void main(String[] args) {
       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_ExcerciseDay2_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        
        Customer customer = new Customer();
        customer.setFirstname("you");
        customer.setLastname("them");
        Address address = new Address();
        address.setCity("Lyngby");
        address.setStreet("Lyngbyvej");
        
         
        try{ 
        em.getTransaction().begin();
        em.persist(customer);
         
        em.getTransaction().commit();
        }finally{
            em.close();
        }
        
        
        
        
        
        
    }
}
