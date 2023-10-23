
public class invoice {
	String partNumber;
	String partDesc;
	int quantity;
	Double price;
	
	public invoice(String partNumber, String partDesc, int quantity, Double price) {
		
		this.partNumber = partNumber;
		this.partDesc = partDesc;
		this.quantity = quantity;
		this.price = price;
	}

	public String getPartNumber() {
		return partNumber;
	}

    public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

    public String getPartDesc() {
		return partDesc;
	}

    public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

    public int getQuantity() {
		return quantity;
	}
    
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}





	public static void main(String[] args) {
		

	}

}
