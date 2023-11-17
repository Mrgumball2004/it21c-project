package oop_basics;


public class Drug {
    
 String drug_name;
 double drug_price;
 
 
Drug(String drug_name,double drug_price){

this.drug_name = drug_name;
this.drug_price = drug_price;

}

void showDrugName(){
System.out.println(drug_name);

}

void showDrugPrice(){
System.out.println(drug_price);


}
       
}