import java.util.ArrayList;
import java.util.Scanner;

public class questions {
    static ArrayList<String> basket;

    public static void main(String[] args){
        basket = new ArrayList<>();

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
                            Scanner srch = new Scanner(System.in);
                            System.out.println("What do you want to search fruits or canned foods: ");
                            String item = srch.nextLine();
                            String itemN = item.toLowerCase();
                            if (itemN.equals("fruits") || itemN.equals("fruits ")) {
                                System.out.println("what item do you want to search: ");
                                String srch1 = srch.nextLine().toLowerCase();
                                for (String range1 : shopping.fruits) {
                                    if (range1.equals(srch1)) {
                                        System.out.println(srch1 + " is in the list");
                                        System.out.println("Do you want to add this to basket yes or no:");
                                        String bsktsrch = basketS.nextLine().toLowerCase();
                                        if (bsktsrch.equals("yes")) {
                                            System.out.println("how many do you want to add: ");
                                            try {
                                                int bsktnum = basketS.nextInt();
                                                for (int range2 = 0; range2 < bsktnum; range2++){
                                                    basket.add(srch1);
                                                }
                                            }
                                            catch(Exception e) {
                                                System.out.println("Error QM003");
                                            }
                                        } else System.out.println("We dont sell " + srch1);
                                    }
                                }
                            }
                            if (itemN.equals("canned foods") || itemN.equals("canned foods ")) {
                                System.out.println("what item do you want to search: ");
                                String srch2 = srch.nextLine().toLowerCase();
                                for (String range4 : shopping.fruits) {
                                    if (range4.equals(srch2)) {
                                        System.out.println(srch2 + " is in the list");
                                        System.out.println("Do you want to add this to basket yes or no:");
                                        String bsktsrch2 = basketS.nextLine().toLowerCase();
                                        if (bsktsrch2.equals("yes")) {
                                            System.out.println("how many do you want to add: ");
                                            try {
                                                int bsktnum = basketS.nextInt();
                                                for (int range3 = 0; range3 < bsktnum; range3++){
                                                    basket.add(srch2);
                                                }
                                            }
                                            catch(Exception e) {
                                                System.out.println("Error QM004");
                                            }
                                        } else System.out.println("We dont sell " + srch2);
                                    }
                                }
                            }
                                }
                        } catch(Exception e) {
                            System.out.println("Error QM002");
                        }
                    }

        } catch(Exception e){
            System.out.println("Error QM001");
        }
    }
}
