
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        
        BottleOfWater bottleOfWater1 = new BottleOfWater("Набеглави", 140, 2);
        BottleOfWater bottleOfWater2 = new BottleOfWater("Святой источник", 100, 2);
        BottleOfWater bottleOfWater3 = new BottleOfWater("Дарида-Аква", 110, 1);
        BottleOfWater bottleOfWater4 = new BottleOfWater("Вода3", 130, 3);
        BottleOfWater bottleOfWater5 = new BottleOfWater("Вода4", 100, 1);

        Product bottleOfMilk1 = new BottleOfMilk("Молоко", 70, 2, 3);
        Product bottleOfMilk2 = new BottleOfMilk("Молочный мир", 80, 1.5, 2);
        Product bottleOfMilk3 = new BottleOfMilk("Молочный мир", 100, 1.5, 4);

        Product pailChips1 = new Chips("Chitos", 345, 150);
        Chips pailChips2 = new Chips("Lay's", 360, 150);
        Chips pailChips3 = new Chips("Pringles", 645, 100);


        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater2);
        products.add(bottleOfWater1);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);
        products.add(bottleOfWater5);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);
        products.add(pailChips1);
        products.add(pailChips2);
        products.add(pailChips3);

        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine(products);

        BottleOfWater bottleOfWaterRes =  machine.getBottleOfWater("Вода3", 3);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }

        BottleOfMilk bottleOfMilkRes =  machine.getBottleOfMilk("Молочный мир", 1.5, 4);
        if (bottleOfMilkRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfMilkRes.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с молоком нет в автомате.");
        }

    }


}