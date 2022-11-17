

public class Main {
    public static void main(String[] args){
        Items item1 = new Items("Butter");
        Items item2 = new Items("Butter");
        Items item3 = new Items("Butter");
        Items item4 = new Items("Butter");
        Items item5 = new Items("Butter");
        Items item6 = new Items("Butter");
        Items item7 = new Items("Butter");
        Items item8 = new Items("Butter");

        ShoppingCart sc = new ShoppingCart(0);
        sc.addToCart(item1);
        System.out.println("---------------------------");
        sc.addToCart(item2);
        System.out.println("---------------------------");
        sc.addToCart(item3);
        System.out.println("---------------------------");
        sc.addToCart(item4);
        System.out.println("---------------------------");
        sc.addToCart(item5);
        System.out.println("---------------------------");
        sc.addToCart(item6);
        System.out.println("---------------------------");
        sc.addToCart(item7);
        System.out.println("---------------------------");
        sc.addToCart(item8);
        System.out.println("---------------------------");

        sc.displayCart();
        System.out.println("---------------------------");

        sc.removeFromCart(item3);
        System.out.println("---------------------------");
        sc.displayCart();
        System.out.println("---------------------------");
        sc.removeFromCart(item3);
        System.out.println("---------------------------");
    }
    
}