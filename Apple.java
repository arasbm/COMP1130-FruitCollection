package Assignment_toString;

public class Apple {
    private double weight; //variable created.
    
    public String toString() {
        String toString = "Apple made by Anthony";
        return toString;
    }
    
    public double getWeight() { //getter method
        return weight;
    }
    
    public void setWeight(double variable) { //setter method
        this.weight = variable;
    }
}
