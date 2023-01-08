
public class Burger extends Food {
	
	private String type;

    public Burger(int calories, int price, String type){
        super(calories, price);
        this.type = type;
    }
	
}
