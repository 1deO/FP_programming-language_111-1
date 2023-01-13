
public class Beverage extends Food {
	

    public Beverage(String type, String name, int calories, int price){
        super(type, name, calories, price);
    }
    
    public String getType() {
    	return super.getType();
    }
    
    public String getName() {
    	return super.getName();
    }
	
    public int getPrice() {
    	return super.getPrice();
    }
    
    public int getCalories() {
    	return super.getCalories();
    }
    
}
