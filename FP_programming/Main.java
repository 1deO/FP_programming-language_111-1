import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Burger cheeseBurger = new Burger("CheeseBurger", 300, 60);
		Burger chickenBurger = new Burger("ChickenBurger", 400, 65);
		Burger fishBurger = new Burger("FishBurger", 390, 75);

		Beverage sprite_S = new Beverage("Sprite", 140, 37);
		Beverage sprite_M = new Beverage("Sprite", 200, 42);//choose 1
		Beverage coke_S = new Beverage("Coke", 150, 36);
		Beverage coke_M = new Beverage("Coke", 210, 41);//choose 1
		
		Scanner sc = new Scanner(System.in);
		
		sc.close();
		
		System.out.println("Your order :");
		System.out.println(order.getInfo());
	}
}
