
import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine {

    private final List<Product> products;

    public BottleOfWaterVendingMachine(List<Product> products){
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, int volume){

        for (Product product : products){
            if (product instanceof BottleOfWater){
                if (product.getName() == name && ((BottleOfWater)product).getVolume() == volume){
                    return (BottleOfWater)product;
                }
            }
       }
        return null;
    }

    //TODO: Разработать метод получения бутылки с молоком самостоятельно

    public BottleOfMilk getBottleOfMilk(String name, double volume, double fat){
        for (Product product : products) {
            if (product instanceof BottleOfMilk) {
                if (product.getName() == name && ((BottleOfMilk)product).getFat() == fat) {
                    return (BottleOfMilk)product;
                }
            }
        }
        return null;
    }

    public Chips getChips(String name, double volume, double weight){
        for (Product product : products) {
            if (product instanceof Chips) {
                if (product.getName() == name && ((Chips)product).getWeight() == weight) {
                    return (Chips)product;
                }
            }
        }
        return null;
    }

}
