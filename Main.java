public class Main {
    public static void main(String[] args){
        Items item1 = new Items("Butter");
        Items item2 = new Items("Oreos");
        Items item3 = new Items("Steak");
        Items item4 = new Items("Turkey");
        Items item5 = new Items("Pringles");
        Items item6 = new Items("Cheerios");
        Items item7 = new Items("Milk");
        Items item8 = new Items("Eggs");

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

        System.out.println(sc);
        System.out.println("---------------------------");

        sc.removeFromCart(item3);
        System.out.println("---------------------------");
        System.out.println(sc);
        System.out.println("---------------------------");
        sc.removeFromCart(item3);
        System.out.println("---------------------------");
    }
    
}