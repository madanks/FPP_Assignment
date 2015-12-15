package exam;

public class ElectronicProduct extends AProduct {
	private double price;

	public ElectronicProduct(String name, String number, double price) {
		super(name,number);
		this.price=price;
	}

	@Override
	double getPrice() {
		
		return price;
	}

}
