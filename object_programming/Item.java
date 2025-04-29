package object_programming;

// The class "Item is a BluePrint

public class Item {

	private String name;		//
	private int quantity; 
			
	// this. will reference the private name and quantity. in the class "Item"
	
	public Item(String name, int quantity) { //Constructor
		this.name = name;
		this.quantity = quantity;
	}
	// Encapsulation
	//getter method is a way of grabbing the private variables in the Public class "Item"
	
	public String getName() {
		return name;
	}
	
	public int getQuantity() {
		return quantity;
		
	}
	@Override //polymorphism
	public String toString() {
		return "Items: " + name+ ", Quantity: " + quantity;

	}
}
