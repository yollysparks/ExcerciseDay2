/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


/**
 *
 * @author felesiah
 */
@Entity
public class Address implements Serializable {


/**
 *when i choose many to one bidirectional you choose the owning side(entity)
 * and in the other entity it will automaticaly generate 
 * a list of address in Customer class.
 * 
 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @ManyToOne
    private  Customer customer;
    private String Street;
    private String city;

    /**
     * @return the Street
     */
    public String getStreet() {
        return Street;
    }

    /**
     * @param Street the Street to set
     */
    public void setStreet(String Street) {
        this.Street = Street;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    
    
    
}
