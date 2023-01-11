import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Burger cheeseBurger = new Burger("CheeseBurger", 300, 60);
		Burger chickenBurger = new Burger("ChickenBurger", 400, 65);
		Burger fishBurger = new Burger("FishBurger", 390, 75);

		Beverage sprite = new Beverage("Sprite", 140, 37);
		Beverage coke = new Beverage("Coke", 150, 36);
		Beverage fanta = new Beverage("Fanta", 150, 38);
		
		OrderList orders = new OrderList();
		Order o1 = new Order(cheeseBurger, 2);
		Order o2 = new Order(sprite, 1);
		Order o3 = new Order(fanta, 1);
		orders.addOrder(o1);
		orders.addOrder(o2);
		orders.addOrder(o3);
		
		Scanner sc = new Scanner(System.in);
		
		sc.close();
		
		System.out.println("Your order :");
		System.out.println(order.getInfo());
	}
}
