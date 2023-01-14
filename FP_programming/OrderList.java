import java.util.ArrayList;

public class OrderList {
	
	ArrayList<Order> orders = new ArrayList<Order>();
	
	
	public void addOrder(Order order) {
		orders.add(order);
	}
	
	//Calculate the sum of cost for all orders.
	public double getOrderCost() {
    	int sumPrice = 0;
    	int totalBurger = 0;
    	int totalBeverage = 0;
    	for(Order order : orders) {
    		sumPrice += order.getTotalPrice();
    		
    		if(order.getFood().getType().equals("burger")) {
    			totalBurger += order.getNumber();
        	}
    		if(order.getFood().getType().equals("beverage")) {
    			totalBeverage += order.getNumber();
    		}
    	}
    	//sales discount
    	if(totalBurger >= totalBeverage) {
    		sumPrice = sumPrice - totalBeverage * 10;
    	}else {
    		sumPrice = sumPrice - totalBurger * 10;
    	}

    	return sumPrice;
    }
	
	public double getSalesTax() {
		double tax = getOrderCost()*0.0868;
		return tax;
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
    	double total = getOrderCost() + getSalesTax();
    	String count1 = String.format("Sub Total: $ %.2f\nSales Tax: $ %.2f\n", getOrderCost(), getSalesTax());
    	String count2 = String.format("Total:     $ %.2f\nCalories:  %d kcal", total, getOrderCalories());
    	
    	for(Order order : orders) {
    		s += String.format(formatInfo, order.getFood().getName(), order.getNumber(), order.getTotalPrice(), order.getTotalCalories());
    	}
    	s += "-".repeat(40) + "\n" + count1 + "-".repeat(40) + "\n" + count2;
    	return s;
    }
    
    public String change(double cash) {
    	double total2 = getOrderCost() + getSalesTax();
    	if (cash >= total2) {
    		double change = cash - (getOrderCost() + getSalesTax());
        	String c =  String.format("%.2f", change);
        	return c;
    	}else {
    		return null;
    	}
    }
}
