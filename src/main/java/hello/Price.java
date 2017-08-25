package hello;

public class Price {

    private Double totalPrice = new Double(0);

    public Price(Double totalPrice) {
    	this.totalPrice = totalPrice;
    }
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
    
}
