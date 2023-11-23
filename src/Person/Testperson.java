public class Testperson {
    
    public static void main(String[] args) {
        // Test Student class tawagon nimo ang class nga "Student" diri ang arjie is variable na sya 
        Student arjie = new Student("Arj", 2004, "Computer Science");
        System.out.println("Student details: " + arjie);
        
        // Test Instructor class
        Instructor instructor = new Instructor("Phoebe Ruth Alithea", 1995, 50000);
        System.out.println("Instructor details: " + instructor);
        
        Pet cat = new Pet("Meggie");
        System.out.println("Students Pet:" + cat);

        
        
    }
}