
public class Pet {
    
  private String Pet;
  
  public Pet(String Pet) {   
   this.Pet = Pet;   
}
  
public String getPet(){
return Pet;
}

public void setPet(String Pet) {
this.Pet = Pet;
}

public String toString(){
  return "[Name: " +  Pet + "]";     
}
}