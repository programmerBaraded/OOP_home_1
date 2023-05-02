
public class BottleOfMilk extends Product {

    private double volume;
    private double fat;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume){
        if (volume <= 0){
            throw new RuntimeException("Объем указан некорректно.");
        }
        this.volume = volume;
    }

    public double getFat() {
        return fat;
    }


    public BottleOfMilk(String name, double price, double volume, double fat){
        super(name, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %f - объем: %f", brand, name, price, volume);

    }
}
