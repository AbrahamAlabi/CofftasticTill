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
public class  CofftasticManager extends Cofftastic  {
    
    int transID;
    String managerType;
    
    public CofftasticManager(){    
       super();
        
       transID = 0;
       managerType = "";
   }

    public CofftasticManager(String managerType,int transID, String Customer, String Beverage, String CupSize, String Comment) {
        super(Customer, Beverage, CupSize,Comment);
        this.transID=transID;
        this.managerType=managerType;
    }
   

   

    public int getTransID() {
        return transID;
    }

    public void setTransID(int transID) {
        this.transID = transID;
    }
    
    public String getManagerType(){
    return managerType;
    }
    
    public void setManagerType(String managerType){
    this.managerType = managerType;
    }
   
    @Override
   public String printDetails(){
        return super.printDetails()+ "\nTransaction ID : " + transID + "\nManager Type : " +managerType; 
   }
    
}
