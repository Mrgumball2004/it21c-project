package Inheritance;





public class Action {
    String name;
    
    Action (String name){
        this.name = name;
    }
    
    void blue(){
        System.out.println(name  +" is blue");
    }
    
    void purr(){
        System.out.println(name + " is purring");
    }
    
}