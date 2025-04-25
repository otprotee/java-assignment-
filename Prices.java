import java.util.HashMap;

public class Prices {
    static HashMap<String, Double> Pfruits = new HashMap<String, Double>();
    static HashMap<String, Double> Pcanned = new HashMap<String, Double>();


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

        Pcanned.put("canned peaches", 0.80);
        Pcanned.put("canned pears", 0.70);
        Pcanned.put("canned pineapple", 0.75);
        Pcanned.put("canned applesauce", 0.60);
        Pcanned.put("canned Cherries", 0.65);
        Pcanned.put("canned Corn", 0.70);
        Pcanned.put("canned mushrooms", 1.20);
        Pcanned.put("canned carrots", 2.50);
        Pcanned.put("canned asparagus", 1.80);
        Pcanned.put("canned tomatoes", 2.00);
        Pcanned.put("canned peas", 1.00);
        Pcanned.put("canned spinach", 0.90);
        Pcanned.put("canned olives", 1.10);
        Pcanned.put("canned tuna", 1.50);
        Pcanned.put("canned salmon", 0.85);
        Pcanned.put("canned sardines", 1.00);
        Pcanned.put("baked beans", 1.00);
        Pcanned.put("kidney beans", 1.20);
        Pcanned.put("chickpeas", 1.10);
        Pcanned.put("lentils", 1.50);
        Pcanned.put("canned beef", 0.90);
        Pcanned.put("canned pork", 1.30);
        Pcanned.put("noodle soup", 1.20);
        Pcanned.put("evaporated milk", 1.50);
        Pcanned.put("canned soups", 1.00);
        Pcanned.put("canned chili", 2.00);

    }



    public double price(String item){
        if(Pcanned.containsKey(item)){
            return Pcanned.get(item);

        }
        else return Pfruits.get(item);

    }
}
