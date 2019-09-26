/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cofftastictill;

import java.io.Serializable;

/**
 *
 * @author x17366481
 */
public class Cofftastic implements Serializable {
     protected String Customer;
     protected String Beverage;
     protected String cupSize;
     protected String Comment;
    
    
    public Cofftastic() {
        String Customer = "";
        String Beverage = "";
        String cupSize = "";
        String Comment = "";
       

    }
    
     public Cofftastic(String Customer, String Beverage, String CupSize, String Comment) {
        this.Customer = Customer;
        this.Beverage = Beverage;
        this.cupSize = CupSize;
        this.Comment = Comment;
        
        
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String Customer) {
        this.Customer = Customer;
    }

    public String getBeverage() {
        return Beverage;
    }

    public void setBeverage(String Beverage) {
        this.Beverage = Beverage;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Commnet) {
        this.Comment = Commnet;
    }
    
    
      public String printDetails(){
        return  "Customer : " + Customer + "\n Beverage : " + Beverage + "\n Cupsize : " +cupSize; 
    }
  
    
}
