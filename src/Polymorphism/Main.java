package Polimorphism;

public class Main {
    
    public static void main(String[]args){
        
        Polimorphism_Pet pet = new Polimorphism_Pet(" Darwin and Inky");
        Polimorphism_fish fish = new Polimorphism_fish(" Isda "); 
        Polimorphism_cat cat = new Polimorphism_cat(" Inky");
        
        //local methods
        pet.chill();
        fish.chill();
        cat.chill();
        
    }
}
