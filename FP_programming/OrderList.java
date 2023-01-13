import java.util.ArrayList;

public class OrderList {
	
	ArrayList<Order> orders = new ArrayList<Order>();
	
	
	public void addOrder(Order order) {
		orders.add(order);
	}
	
	//Calculate the sum of cost for all orders.
	public int getOrderCost() {
    	int sumPrice = 0;
    	int totalHamburger = 0;
    	int totalBeverage = 0;
    	for(Order order : orders) {
    		sumPrice += order.getTotalPrice();
    		if(order.getFood().getType().equals("burger")) {
    			totalHamburger++;
        	}
    		if(order.getFood().getType().equals("beverage")) {
    			totalBeverage++;
    		}
    	}
    	
    	if(totalHamburger >= totalBeverage) {
    		sumPrice = sumPrice - totalBeverage * 10;
    	}else {
    		sumPrice = sumPrice - totalHamburger * 10;
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
    	String s = "";
    	String foodNameFormat = "%13.15s";
    	String totalPriceFormat = "%4d";
    	String formatInfo = foodNameFormat + " x%d  $" + totalPriceFormat + "  %d kcal\n";
    	
    	for(Order order : orders) {
    		s += String.format(formatInfo, order.getFood().getName(), order.getNumber(), order.getTotalPrice(), order.getTotalCalories());
    	}
    	s += "-".repeat(40);
    	s += "\n" + "TotalCost: $ " + getOrderCost() + "\n" + "TotalCalories: " + getOrderCalories() + " kcal";
    	return s;
    }
}
