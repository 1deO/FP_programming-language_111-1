
public class Burger extends Food {

    public Burger(String type, String name, int calories, int price){
        super(type, name, calories, price);
    }
	
    public String getType() {
    	return super.getType();
    }
    public String getName() {
    	return super.getName();
    }
    
    public int getCalories() {
    	return super.getCalories();
    }
    
    public int getPrice() {
    	return super.getPrice();
    }
    
}
