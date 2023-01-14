
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Use constructor to establish the menu(include calories and price)
		Burger cheeseBurger = new Burger("burger", "CheeseBurger", 300, 60);
		Burger chickenBurger = new Burger("burger", "ChickenBurger", 400, 65);
		Burger fishBurger = new Burger("burger", "FishBurger", 390, 75);

		Beverage sprite = new Beverage("beverage", "Sprite", 140, 37);
		Beverage coke = new Beverage("beverage", "Coke", 150, 36);
		Beverage fanta = new Beverage("beverage", "Fanta", 150, 38);

		OrderList orders = new OrderList();
		
		//establish an example order
		Order o1 = new Order(cheeseBurger, 2);
		Order o2 = new Order(sprite, 1);
		Order o3 = new Order(fanta, 1);
		
		//add every order to the orderlist
		orders.addOrder(o1);
		orders.addOrder(o2);
		orders.addOrder(o3);
		
	
		System.out.println("*Order a hamburger with a beverage can get a discount of 10 dollars off.");//showing the discount
		System.out.println("Your order :");
		System.out.println(orders.getInfo() + "\n");//print the orders
		boolean pay = false;
		//determine whether the input cash is more than orders' cost
		while (!pay) {
			System.out.print("Cash:   ");
			double cash = sc.nextDouble();
			if (orders.change(cash) == null) {
				System.out.println("Cash is not enough.");
			}else {
				pay = true;
				System.out.println("Change: " + orders.change(cash));//if true, show the change
			}
		}
		System.out.println("Thank You");
		
		
		sc.close();
	}
}
