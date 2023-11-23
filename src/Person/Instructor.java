class Instructor extends Person {
    
    private double salary;

    public Instructor(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth);
        this.salary = salary;
    }

    // Getter and setter methods for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method
    public String toString() {
        return "Instructor [name=" + getName() + ", yearOfBirth=" + getYearOfBirth() + ", salary=" + salary + "]";
    }
}