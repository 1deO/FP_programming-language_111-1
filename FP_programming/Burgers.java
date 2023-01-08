
public class Burgers extends Food {
	
	private String type;

    public Burgers(int calories, int price, String type){
        super(calories, price);
        this.type = type;
    }
	
}
