package jp.co.internous.sunny.model.domain.dto;

public class PurchaseHistoryDto {

	private long productCount;
	private long price;
	private String purchasedAt;
	private String familyName;
	private String firstName;
	private String address;
	private String productName;
	
	public long getProductCount() {
		return productCount;
	}
	
	public void setProductCount(long productCount) {
		this.productCount = productCount;
	}
	
	public long getPrice() {
		return price;
	}
	
	public void setPrice(long price) {
		this.price = price;
	}
	
	public String getPurchasedAt() {
		return purchasedAt;
	}
	
	public void setPurchasedAt(String purchasedAt) {
		this.purchasedAt = purchasedAt;
	}
	
	public String getFamilyName() {
		return familyName;
	}
	
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
}
	

