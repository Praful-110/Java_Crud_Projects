package softronix.in.entity;

public class Products {
	
	
	private int productId;
	private String productName;
	private String productCode;
	private float productPrice;
	private String productCity;
	
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductCity() {
		return productCity;
	}
	public void setProductCity(String productCity) {
		this.productCity = productCity;
	}
	
	
	
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", productCode=" + productCode
				+ ", productPrice=" + productPrice + ", productCity=" + productCity + "]";
	}
	
	
	
	
	
	
	

}
