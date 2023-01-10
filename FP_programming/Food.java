
public class Food {
	
    private int calories;
    private int price;
    private String name;
	
    public Food(String name, int calories, int price){
    	this.name = name;
        this.calories = calories;
        this.price = price;
    }
    
    public String getName() {
    	return name;
    }
    
    public int getPrice() {
    	return price;
    }
    
    public int getCalories() {
    	return calories;
    }
    
}
