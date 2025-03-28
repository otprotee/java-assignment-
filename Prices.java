import java.util.HashMap;

public class Prices {
    static HashMap<String, Double> Pfruits = new HashMap<String, Double>();

    Prices(){
        Pfruits.put("apples", 2.50);
        Pfruits.put("apricots",3.76);
        Pfruits.put("avocados", 3.23);
        Pfruits.put("bananas", 12.40);
        Pfruits.put("cherries", 1.21);
        Pfruits.put("dates", 15.60);
        Pfruits.put("figs", 7.98);
        Pfruits.put("grapes", 6.80);
        Pfruits.put("melons", 9.50);
        Pfruits.put("kiwis", 6.96);
        Pfruits.put("lemons", 5.99);
        Pfruits.put("mangoes", 12.50);
        Pfruits.put("olives", 8.75);
        Pfruits.put("oranges", 19.99);
        Pfruits.put("pears", 3.49);
        Pfruits.put("peppers", 25.00);
        Pfruits.put("pineapples", 7.30);
        Pfruits.put("pumpkins", 14.20);
        Pfruits.put("raisins", 9.99);
        Pfruits.put("tomatoes", 2.99);
        Pfruits.put("strawberries", 6.60);
        Pfruits.put("plums", 4.50);
        Pfruits.put("watermelons", 1.99);

    }


    public  double price(String item){
        return Pfruits.get(item);
    }
}
