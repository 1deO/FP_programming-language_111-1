public class Beverage extends Food {
	

    public Beverage(String name, int calories, int price){
        super(name, calories, price);
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
