package object_programming;

public class main {

	public static void main(String[] args) {
		
		Inventory inventory = new Inventory(); //Creating an inventory object called inventory
		
		Item item1 = new Item("Generic Item", 10);
		Fruit fruit = new Fruit("Apple", 20,"Fuji");
		Weapon weapon = new Weapon("Sword", 2, 75, "Melee");
		
		
		inventory.addItem(item1);
		inventory.addItem(fruit);
		inventory.addItem(weapon);
		
		inventory.displayInventory();
	}
}
