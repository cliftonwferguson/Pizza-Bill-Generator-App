package pizza;

public class Pizza {
	private int price;
	private Boolean veg;

	public Pizza(Boolean veg) {
		super();
		this.veg = veg;
		if (this.veg) {
			this.price = 300;
		} else {
			this.price = 400;
		}
	};

	public void addExtraCheese() {
		
	}
	
	public void addExtraToppings () {
		
	}
	
	public void takeAway() {
		
	}
	
	public void getBill () {
		
	}
}
