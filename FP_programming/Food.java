
public class Food {
	
	private String type;
    private int calories;
    private int price;
    private String name;
	
    public Food(String type, String name, int calories, int price){
    	this.type = type;
    	this.name = name;
        this.calories = calories;
        this.price = price;
    }
    
    public String getType() {
    	return type;
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
