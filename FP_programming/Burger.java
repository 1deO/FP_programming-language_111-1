public class Burger extends Food {
	
	private String type;

    public Burger(String type, String name, int calories, int price){
        super(type, name, calories, price);
    }
	
    public String getType() {
    	return this.type;
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
