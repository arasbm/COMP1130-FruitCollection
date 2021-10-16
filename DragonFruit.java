package dragonfruit;

public class DragonFruit {
    
    private double weight;
    
    public String toString(){
       String toString = "This is a DragonFruit created by Ujjwal Sood";
       return toString;
    }
    
    public double getWeight(){
        return weight;  //getter method 
    }
    
    public void setWeight(double correctWeight){
        this.weight = correctWeight;   //setter method
    }
            
}
