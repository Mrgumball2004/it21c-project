package Inheritance;

public class Main {

    public static void main(String[] args) {
      
        Action action = new Action("Gumball");
        
        action.purr();
        action.blue();                     
    
        Cat meow = new Cat("Gumball");
        
        meow.whiskers(); 
        
   }      
}