public class Functions {
    //function for checking something is in the fruits list
    static void fsRange(String item1){
        for (String range7 : shopping.fruits) {
            if (range7.equals(item1)) {
                System.out.println(item1 + " is in the list");
                System.out.println("Do you want to add this to basket yes or no:");
            }
        }
    }

    //function for output the fruits list
    static void fRange(){
        int range1 = 0;
        System.out.println("\nFruits: \n");
        for (;range1 <= shopping.fruits.size()-1; range1++) {
            System.out.println(shopping.fruits.get(range1));
        }
    }


    //function for output the canned foods list
    static void cRange(){
        int range2 = 0;
        System.out.println("\nCanned Foods:\n");
        for (;range2 <= shopping.canned_foods.size()-1; range2++) {
            System.out.println(shopping.canned_foods.get(range2));
        }
    }

}
