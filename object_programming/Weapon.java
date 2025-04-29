package object_programming;

public class Weapon extends Item {
	private int damage;
	private String type;
	
	public Weapon(String name, int quantity, int damage, String type) {
		super(name, quantity);
		this.type = type;
		this.damage = damage;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public String getType() {
		return type;
	}
		
	@Override //polymorphism
	public String toString() {
		return "Weapon: " + getName() + ", Quantity: " + getQuantity() + " Damage: " + getDamage()+ ", Type: " + getType();
	}
	
}
