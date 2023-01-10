import java.util.ArrayList;
public class Order{

    private int number;
    private Food food;
    private ArrayList<Order> orders;
    
    public Order(Food food, int number) {
    	this.food = food;
    	this.number = number;
    	this.orders = new ArrayList<Order>();
    }
    
    public Food getFood() {
    	return this.food;
    }
    
    public int getNumber() {
    	return this.number;
    }
    
    public int getTotalPrice() {
    	return food.getPrice() * number;
    }
    
    public int getTotalCalories() {
    	return food.getCalories() * number;
    }
    
    public void addOrder(Order order) {
    	orders.add(order);
    }
    
    public int getOrderCost() {
    	int sumPrice = 0;
    	for(Order order : orders) {
    		sumPrice += order.getTotalPrice();
    	}
    	return sumPrice;
    }
    
    public int getOrderCalories() {
    	int sumCalories = 0;
    	for(Order order : orders) {
    		sumCalories += order.getTotalCalories();
    	}
    	return sumCalories;
    }
    
    public String getInfo() {
    	String totalOrder = "";
    	for(Order order : orders) {
    		totalOrder = totalOrder + order.getFood().getName() + " X " + order.getNumber() 
    		+ " $ " + order.getTotalPrice() + " " + order.getTotalCalories() + "cal" + "\n";
    	}
    	totalOrder = totalOrder + "\n" + "TotalCost: " + getOrderCost() + "\n" + "TotalCalories" + getOrderCalories();
    	return totalOrder;
    }
}
