package sparrowww.al;

public class Animal {
    public Animal (){
        System.out.println("The Animal was born!!!");
    }
    protected void printTypeAnimal (){
        System.out.println("The Animal type is " + typeAnimal);
    }
    protected void eatFood(){
        System.out.println("The " + typeAnimal + " eats food!!!");
    }
    protected void setTypeAnimal (String typeAnimal){
        this.typeAnimal = typeAnimal;
    }
    private String typeAnimal = "Unknown";

}
