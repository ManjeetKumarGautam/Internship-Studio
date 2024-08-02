import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("########################## WELCOME TO PIZZATOON  #################################");

        System.out.println("\n Which Pizza do you want...?\n");

        System.out.print("1. Veg Pizza\n2. Non-Veg Pizza\n3. Deluxe Veg Pizza\n4. Deluxe Non-Veg Pizza\n");

        System.out.print("\nEnter a number -> ");
        int selectNum = sc.nextInt();
        switch (selectNum){
//            for veg pizza
            case 1:
                Pizza veg_pizza=new Pizza(true);
                veg_pizza.addSomeExtra();
                veg_pizza.displayBill();
                break;
//                for non-veg pizza
            case 2:
                Pizza non_veg_pizza=new Pizza(false);
                non_veg_pizza.addSomeExtra();
                non_veg_pizza.displayBill();
                break;
//                for deluxe veg pizza
            case 3:
                DeluxePizza vegDeluxePizza =new DeluxePizza(true);
                vegDeluxePizza.displayBill();
                break;
//                for deluxe non-veg pizza
            case 4:
                DeluxePizza nonVegDeluxePizza=new DeluxePizza(false);
                nonVegDeluxePizza.displayBill();
                break;
//                it is use for when user not enter a number between 1 and 4
            default:
                System.out.print("Please enter a number between 1 and 4");
        }
    }
}