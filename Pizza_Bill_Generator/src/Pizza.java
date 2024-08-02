import java.util.Scanner;

public class Pizza {
    protected boolean veg;
    public int pizzaPrice;
    protected int extraToppingPrice = 150;
    protected int extraCheesePrice = 100;
    protected int takeAwayPrice = 20;
    public boolean extraTopping;
    public boolean extraCheese;

    public int totalAmount=0;
    Pizza(){}
    Pizza(boolean isVeg){
        this.veg=isVeg;
        this.pizzaPrice= isVeg?300:400;
    }



    public void addSomeExtra(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\nYou Want :-");

//        For Extra Topping
        System.out.print("ExtraTopping (y/n)? => ");
        char et=sc.next().charAt(0);
        this.extraTopping=(et=='y'|| et=='Y');
        totalAmount += this.extraTopping?extraToppingPrice:0;

//        For Extra Cheese
        System.out.print("ExtraCheese (y/n)? => ");
        char ec=sc.next().charAt(0);
        this.extraCheese=(ec=='y'|| ec=='Y');
        totalAmount +=this.extraCheese?extraCheesePrice:0;
    }

    public void displayBill(){
        System.out.println("\n------------- Your Bill -------------\n");
        System.out.println("Pizza          : "+this.pizzaPrice);
        if(extraTopping) System.out.println("Extra Topping  : "+this.extraToppingPrice);
        if(extraCheese) System.out.println("Extra Cheese   : "+this.extraCheesePrice);
        System.out.println("Take Away      : "+this.takeAwayPrice);
        System.out.println("-------------------------------------");
        int total = this.pizzaPrice+this.takeAwayPrice+totalAmount;
        System.out.println("Total Amount     : "+total);
        System.out.println("-------------------------------------");
        System.out.print("\n\nThank You !  Visit Again\n\n");
    }

}
