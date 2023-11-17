package oop_basics;


public class Main {

   
    public static void main(String[] args) {
 
     Drug drug1 = new Drug("Robust:",30.00);
     
     Drug drug2 = new Drug("Biogesic:",20.00);
     
     drug1.showDrugName();   
     drug1.showDrugPrice();
     
     drug2.showDrugName();   
     drug2.showDrugPrice();
    }
    
}
