package Inheritance;



public class Cat extends Action{
    
    Cat(String name){
        super(name);
    }
    
    void whiskers(){
        System.out.println( name + " has a whiskers");
    } 
}