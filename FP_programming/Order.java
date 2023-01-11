

public class Order{

    private int number;
    private Food food;
    
    public Order(Food food, int number) {
    	this.food = food;
    	this.number = number;
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
    
}
