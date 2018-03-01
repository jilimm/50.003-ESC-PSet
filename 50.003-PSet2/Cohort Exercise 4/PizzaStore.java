import java.util.Scanner;

public class PizzaStore {

	public static void main(String[] args){
		Pizza thePizza = null;
		Scanner userinput = new Scanner(System.in);
		String pizzaOrder = "";

		System.out.println("Welcome to Pizza Store! What type of Pizza would you like?");

		if (userInput.hasNextLine()){	
			pizzaOrder = userInput.nextLine();				
		}

		PizzaFactory thePizzaFactory = new PizzaFactory();
		thePizza = thePizzaFactory.makePizzaForCustomer(pizzaOrder);
		
		if (thePizza!=null){
			prepPizza(thePizza);
			System.out.println("Here is your "+thePizza.getType);
		}else{
			System.out.println("We do not have "+pizzaOrder+" pizza");
		}
		
		
	}

	public static pizza prepPizza(Pizza pizza){
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}

// Switch Factory handles the dynamic creation of switches for different calls
// The exact implementation of switch for its local/remote counterparts are 
// hidden from the subscriber
class PizzaFactory {
	
	// sudiptac: Encapsulation of all different subsystems in the switch
	public Pizza makePizzaForCustomer(String custOrder){		
		if (custOrder.equals("cheese")) {
			return new CheesePizza();
		}
		if (custOrder.equals("greek")) {
			return new GreekPizza();
		}
		if (custOrder.equals("pepperoni")) {
			return new PepperoniPizza();
		} else{
			System.out.println("Pizza Store does not make "+custOrder+" pizza");
			return null;
		}
	}
}

abstract class Pizza {
	private String type;

	public void prepare() {
		System.out.println("preparing "+type+ " pizza");
	}

	public void box() {
		System.out.println("boxing "+type+ " pizza");
	}

	public void cut() {
		System.out.println("cutting "+type+ " pizza");
	}

	public void bake() {
		System.out.println("baking "+type+ " pizza");
	}

	public String getType(){
		return this.type;
	}

	public void setType(String newType){
		this.type = newType;
	}
}

class CheesePizza implements Pizza {
	public CheesePizza(){	
		setType("Cheese Pizza");		
	}

}
class GreekPizza implements Pizza {
	public GreekPizza(){	
		setType("Greek Pizza");		
	}

}
class PepperoniPizza implements Pizza {
	public PepperoniPizza(){	
		setType("Pepperoni Pizza");		
	}	
}

