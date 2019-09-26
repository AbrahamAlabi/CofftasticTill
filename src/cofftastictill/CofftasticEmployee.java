/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cofftastictill;

/**
 *
 * @author x17366481
 */
public class CofftasticEmployee extends Cofftastic {
    
    String registeredBy;
    
      public CofftasticEmployee(){    
       super();
   }

    public CofftasticEmployee(String registeredBy, String Customer, String Beverage, String CupSize, String Comment) {
        super(Customer, Beverage, CupSize,Comment);
        this.registeredBy = registeredBy;
    }
    

    public String getRegisteredBy() {
        return registeredBy;
    }

    public void setRegisteredBy(String registeredBy) {
        this.registeredBy = registeredBy;
    }
    
    @Override
    public String printDetails(){
        return super.printDetails() + "\n Till Operator :  "+registeredBy;  
    }
    
   
    
}
