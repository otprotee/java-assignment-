import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;

public class questions {
    static ArrayList<String> basket;
    static Double total = 0.00;
    static Scanner srch = new Scanner(System.in);
    static String srch1 = "NO ITEM";
    static String srch2 = "NO ITEM";




    public static void main(String[] args){
        basket = new ArrayList<>();
        Prices prices = new Prices();
        shopping.main(new String[0]);
        int loopBrsch = 0;
        try {
            while(loopBrsch == 0) {
                Scanner brsrch = new Scanner(System.in);
                System.out.println("Would you like to browse or search for and item: ");
                String brsrchR =  brsrch.nextLine();
                String brsrchN =  brsrchR.toLowerCase();
                Scanner basketS = new Scanner(System.in);
                try {
                    if (brsrchN.equals("browse") || brsrchN.equals("browse ")) {
                        System.out.println("\n Fruits: \n");
                        System.out.println(shopping.fruits);
                        System.out.println("\n Canned Foods: \n");
                        System.out.println(shopping.canned_foods);
                    }
                    else if (brsrchN.equals("search") || brsrchN.equals("search ")) {
                        System.out.println("What do you want to search fruits or canned foods: ");
                        String item = srch.nextLine();
                        String itemN = item.toLowerCase();
                        if (itemN.equals("fruits") || itemN.equals("fruits ")) {
                            System.out.println("what item do you want to search: ");
                            srch1 = srch.nextLine().toLowerCase();
                            for (String range1 : shopping.fruits) {
                                if (range1.equals(srch1)) {
                                    System.out.println(srch1 + " is in the list");
                                    System.out.println("Do you want to add this to basket yes or no:");
                                    String bsktsrch = basketS.nextLine().toLowerCase();
                                    if (bsktsrch.equals("yes")) {
                                        System.out.println("how many do you want to add: ");
                                        try {
                                            int bsktnum = basketS.nextInt();
                                            for (int range2 = 0; range2 < bsktnum; range2++) {
                                                basket.add(srch1);
                                                total += prices.price(srch1);

                                            }
                                        } catch (Exception e) {
                                            System.out.println("Error QM003" + e);
                                        }
                                    }
                                    System.out.println("We dont sell " + srch1);
                                }
                            }
                        } else if (itemN.equals("canned foods") || itemN.equals("canned foods ")) {
                            System.out.println("what item do you want to search: ");
                            srch2 = srch.nextLine().toLowerCase();
                            for (String range1 : shopping.canned_foods) {
                                if (range1.equals(srch2)) {
                                    System.out.println(srch2 + " is in the list");
                                    System.out.println("Do you want to add this to basket yes or no:");
                                    String bsktsrch = basketS.nextLine().toLowerCase();
                                    if (bsktsrch.equals("yes")) {
                                        System.out.println("how many do you want to add: ");
                                        try {
                                            int bsktnum = basketS.nextInt();
                                            for (int range4 = 0; range4 < bsktnum; range4++) {
                                                basket.add(srch2);
                                                total += prices.price(srch2);

                                            }
                                        } catch (Exception e) {
                                            System.out.println("Error QM004" + e);
                                        }
                                    }
                                    else if (bsktsrch.equals("no")){
                                        System.out.println(" ");
                                    }
                                    System.out.println("We don't sell " + srch2);
                                }
                            }
                        }
                        else {
                            System.out.println("incorrect input");
                        }
                    }
                } catch(Exception e) {
                    System.out.println("Error QM002");
                }
                Scanner checkout = new Scanner (System.in);
                System.out.println("do you want to go to checkout yes or no: ");
                String check = checkout.nextLine();
                if (check.equals("yes") || check.equals("yes ")) {
                    System.out.println("Your basket:");
                    for (int range3 = basket.size()-1; range3 > -1; range3--) {
                        System.out.println(basket.get(range3));
                    }

                    System.out.println("Your total is" );
                    String totalOutput = System.out.printf("£" + "%.2f", total.floatValue()).toString();
                    loopBrsch = 1;
                }

            }
        } catch(Exception e){
            System.out.println("Error QM001");
        }
    }
}
