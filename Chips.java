
public class Chips extends Product {
    
    private double weight;
    
    public Chips(String name, double price, double weight){
            super(name, price);
            this.weight = weight;
    }
    
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight){
        if (weight <= 0){
            throw new RuntimeException("Вес указан некорректно.");
        }
        this.weight = weight;
    }

    
    

    @Override
    String displayInfo() {
        return String.format("%s - %f - вес: %d", name, price, weight);
    }
}