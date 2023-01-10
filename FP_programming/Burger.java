public class Burger extends Food {


    public Burger(String name, int calories, int price){
        super(name, calories, price);
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
