import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Burger cheeseBurger = new Burger("burger", "CheeseBurger", 300, 60);
		Burger chickenBurger = new Burger("burger", "ChickenBurger", 400, 65);
		Burger fishBurger = new Burger("burger", "FishBurger", 390, 75);

		Beverage sprite_S = new Beverage("beverage", "Sprite", 140, 37);
		Beverage sprite_M = new Beverage("beverage", "Sprite", 200, 42);//choose 1
		Beverage coke_S = new Beverage("beverage", "Coke", 150, 36);
		Beverage coke_M = new Beverage("beverage", "Coke", 210, 41);//choose 1
		
		System.out.println("Order a hamburger with beverage can get a discount of 10 dollars off.");
		
		Scanner sc = new Scanner(System.in);
		
		sc.close();
		
		System.out.println("Your order :");
		System.out.println(order.getInfo());
	}
}
