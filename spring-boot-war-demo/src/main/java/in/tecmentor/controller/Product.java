package in.tecmentor.controller;

public class Product {

	public Product(Long productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	private Long productId;
	private String productName;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}
