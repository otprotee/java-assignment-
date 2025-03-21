import java.util.Locale;
import java.util.Scanner;

public class questions {
    public static void main(String[] args){
        shopping.main(new String[0]);
        int loopBrsch = 0;
        int fruitLen = shopping.fruits.size();
        try {
            while(loopBrsch == 0) {
                Scanner brsrch = new Scanner(System.in);
                System.out.println("Would you like to browse or search for and item: ");
                String brsrchR =  brsrch.nextLine();
                String brsrchN =  brsrchR.toLowerCase();
                try {
                    if (brsrchN.equals("browse") || brsrchN.equals("browse ")) {
                        System.out.println("\n Fruits: \n");
                        System.out.println(shopping.fruits);
                        System.out.println("\n Canned Foods: \n");
                        System.out.println(shopping.canned_foods);
                    } else if (brsrchN.equals("search") || brsrchN.equals("search ")) {
                        Scanner srch = new Scanner(System.in);
                        System.out.println("What do you want to search fruits or canned foods: ");
                        String item = srch.nextLine();
                        String itemN = item.toLowerCase();
                        if (itemN.equals("fruits") || itemN.equals("fruits ")) {
                            System.out.println("what item do you want to search: ");
                            String srch1 = srch.nextLine();
                            for (int range1 = 0; range1 < fruitLen; range1++) {

                            }
                        }
                    }
                } catch(Exception e) {

                }
            }
        }
        catch(Exception e){
            System.out.println("An error has occurred QM001");
        }
    }
}
