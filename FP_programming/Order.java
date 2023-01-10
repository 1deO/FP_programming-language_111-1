
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
}
