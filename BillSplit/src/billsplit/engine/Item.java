package billsplit.engine;

public class Item {
	private String name;
	private double cost;
	private String category;
	private String details;
	
	public Item(String name, float cost) {
		this.name = name;
		this.cost = cost;
	}
	
	public double getCost() {
		return this.cost;
	}
	
	public void setCost(double cost) {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		throw new UnsupportedOperationException("Not implemented yet.");
	}
	
	public String getCategory() {
		throw new UnsupportedOperationException("Not implemented yet.");
	}
	
	public void setCategory(String category) {
		throw new UnsupportedOperationException("Not implemented yet.");
	}
	
	public String getDetails() {
		throw new UnsupportedOperationException("Not implemented yet.");
	}
	
	public void setDetails(String details) {
		throw new UnsupportedOperationException("Not implemented yet.");
	}
		
}
