package pizza;

public class Pizza {
	private int price;
	private Boolean veg;
	private int extraCheesePrice = 100;
	private int extraToppingsAdded = 150;
	private int backPackPrice = 20;
	private int basePizzaPrice;
	private int pizzaBill;
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingsAdded = false;
	private boolean isOptedForTakeaway = false;
	

	public Pizza(Boolean veg) {
		super();
		this.veg = veg;
		if (this.veg) {
			this.price = 300;
		} else {
			this.price = 400;
		}
		basePizzaPrice = this.price;
	};

	public void addExtraCheese() {
		isExtraCheeseAdded = true;
		this.price += extraCheesePrice;
	}
	
	public void addExtraToppings () {
		isExtraToppingsAdded = true;
		this.price += extraToppingsAdded;
	}
	
	public void takeAway() {
		isOptedForTakeaway=true;
		this.price += backPackPrice;
	}
	
	public void addOptions () {
		System.out.println("base pizza price: "+basePizzaPrice);
		String options = "";	
		if(isExtraCheeseAdded) {
			options += "Extra cheese added: "+extraCheesePrice+ "\n";
			pizzaBill += extraCheesePrice;
		}
		if(isExtraToppingsAdded) {
			options += "Extra toppings added: "+extraToppingsAdded+ "\n";
			pizzaBill += extraToppingsAdded;
		}
		if(isOptedForTakeaway) {
			options += "Opted for takeaway: "+backPackPrice+ "\n";
			pizzaBill += backPackPrice;
		}
		System.out.println("Pizza: options"+options);
	}
	
	public void totalBill() { 
		System.out.println("Total Pizza Cost: "+(basePizzaPrice+pizzaBill));
	}
}

//  Base pizza: 300
//  Toppings: 150
//  Cheese: 100
//  Take away: 20