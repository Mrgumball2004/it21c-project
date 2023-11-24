package Abstract;

public class Main {
    
    public static void main(String[] args) {       
        
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        System.out.println("My dog is color " + myDog.Color() );
        System.out.println("My cat is color " + myCat.Color() );
    }
}