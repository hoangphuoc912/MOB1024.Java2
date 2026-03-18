package entity;

public class ImportedProduct extends Product{
	private double importTaxRate;
	private double shippingfee;
	
	public ImportedProduct() {}
	public ImportedProduct(String id, String name, double basePrice, double importTaxRate, double shippingfee) {
		super(id, name, basePrice);
		this.setimportTaxRate(importTaxRate);
		this.setShippingfee(shippingfee);
	}

	public double getImportTaxRate() {
		return importTaxRate;
	}

	public boolean setimportTaxRate(double importTaxRate) {
		if(importTaxRate >=0 && importTaxRate <= 1) {
		this.importTaxRate = importTaxRate;
		return true;
		}
		return false;
	}
	public double getShippingfee() {
		return shippingfee;
	}

	public boolean setShippingfee(double shippingfee) {
		if(shippingfee >= 0) {
		this.shippingfee = shippingfee;
		return true;
		}
		return false;
	}

	@Override
	public double finalPrice() {
		// TODO Auto-generated method stub
		return super.finalPrice() + super.finalPrice() * this.importTaxRate + this.shippingfee;
	}

	@Override
	public String toString() {
		return super.toString() + " ImportedProduct [importTaxRate=" + importTaxRate + ", shippingFee=" + shippingfee +  "]";
	}
//	", finalPrice()=" + finalPrice() + xoa do chi can print cua thằng con tk cha có rồi
}
	
	