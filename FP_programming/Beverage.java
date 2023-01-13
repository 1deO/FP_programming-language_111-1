public class Beverage extends Food {
	
	private String type;

    public Beverage(String type, String name, int calories, int price){
        super(type, name, calories, price);
    }
    
    public String getType() {
    	return this.type;
    }
    
    public int getPrice() {
    	return super.getPrice();
    }
    
    public int getCalories() {
    	return super.getCalories();
    }
    
    public String getName() {
    	return super.getName();
    }
  
}
