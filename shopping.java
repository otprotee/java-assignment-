import javax.swing.*;
import java.util.ArrayList;

public class shopping {
    static ArrayList<String> fruits;
    ArrayList<String> canned_foods;
    ArrayList<JLabel> test;

    public shopping() {

        fruits = new ArrayList<String>();
        fruits.add("Apples");
        fruits.add("Apricots");
        fruits.add("Avocados");
        fruits.add("Bananas");
        fruits.add("Cherries");
        fruits.add("Cherries");
        fruits.add("Dates");
        fruits.add("Figs");
        fruits.add("Grapes");
        fruits.add("melons");
        fruits.add("Kiwis");
        fruits.add("Lemons");
        fruits.add("Mangoes");
        fruits.add("Olives");
        fruits.add("Oranges");
        fruits.add("Pears");
        fruits.add("Peppers");
        fruits.add("Pineapples");
        fruits.add("Pumpkins");
        fruits.add("Raisins");
        fruits.add("Tomatoes");
        fruits.add("Strawberries");
        fruits.add("plums");
        fruits.add("Watermelons");

        canned_foods = new ArrayList<String>();
        canned_foods.add("canned Peaches");
        canned_foods.add("canned pears");
        canned_foods.add("canned pineapple");
        canned_foods.add("canned Applesauce");
        canned_foods.add("canned Cherries ");
        canned_foods.add("canned Corn");
        canned_foods.add("canned mushrooms");
        canned_foods.add("canned carrots");
        canned_foods.add("canned asparagus");
        canned_foods.add("canned tomatoes");
        canned_foods.add("canned Peas");
        canned_foods.add("canned Spinach");
        canned_foods.add("canned Olives ");
        canned_foods.add("canned Tuna");
        canned_foods.add("canned salmon");
        canned_foods.add("canned sardines");
        canned_foods.add("baked beans");
        canned_foods.add("kidney beans ");
        canned_foods.add("chickpeas ");
        canned_foods.add("lentils ");
        canned_foods.add("canned Beef");
        canned_foods.add("canned pork");
        canned_foods.add("noodle soup");
        canned_foods.add("Evaporated milk");
        canned_foods.add("Coconut milk");
        canned_foods.add("canned Soups");
        canned_foods.add("canned Chili");
        canned_foods.add("canned Tomatoes");

    }

    public static void main(String[] args) {
        shopping shopping  = new shopping();

        System.out.println(shopping.canned_foods);
        System.out.println(shopping.fruits);
    }
}
