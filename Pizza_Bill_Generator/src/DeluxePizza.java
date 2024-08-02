public class DeluxePizza extends Pizza {

    DeluxePizza(boolean isVeg){
        this.veg=isVeg;
        this.pizzaPrice= isVeg?550:650;
    }

}
