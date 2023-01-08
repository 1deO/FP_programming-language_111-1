
public class Beverage extends Food {
	
	private char size;

    public Beverage(int calories, int price, char size){
        super(calories, price);
        this.size = size;
    }

}
