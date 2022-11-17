import java.util.ArrayList;

public class ShoppingCart {
    private int cartSize;
    private ArrayList<Items> shoppingCart;

    //Contructor
    public ShoppingCart(int cartSize){
        this.cartSize = cartSize;
        shoppingCart = new ArrayList<>();
        }

    public void addToCart(Items item){
        // add individual items to cart
        if (!shoppingCart.contains(item)) {
            boolean added = shoppingCart.add(item);
            if (added){
                System.out.println("Item has been added.");
            }
        }
    }
    public int getCartSize(){
        // give a number of how many items are in the cart
        cartSize = shoppingCart.size();
        return cartSize;
    }
    public void removeFromCart(Items item){
        // remove an individual item from cart
        boolean result = shoppingCart.remove(item);
        if (!result) {
            System.out.println("Item was not in the cart.");
        } else {
            System.out.println("Item removed from cart.");
        }
    }
    // public String toString(){
    //     // display the contents of the cart.
    //     String result = "Current Shopping Cart: ";
    //     for (Items i : shoppingCart){
    //         result += i.getItem() + ", ";
    //     }
    //     if (shoppingCart[getCartSize() - 1] == ","){
    //         result.remove(result[getCartSize()]);
    //         result.remove(result[getCartSize()-1]);
    //     }
    //     return result;
    //}
    public void displayCart(){
        String display = shoppingCart.toString();
        System.out.println(display);
    }
}