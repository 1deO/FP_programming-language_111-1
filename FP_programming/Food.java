
public class Food {
	
    private int calories;
    private int price;
	
    public Food(int calories, int price){
        this.calories = calories;
        this.price = price;
    }
    
    public int getPrice() {
    	return price;
    }
    
    public int getCalories() {
    	return calories;
    }
    
    public String getInfo() {
    	return "Your order:";
    }
}
