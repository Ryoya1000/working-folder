package com.internousdev.ecsite.dto;

public class BuyItemDTO {

	public int id ;

	public String itemName;

	public String itemPrice;

	public String makerName;

	public String image_file_path;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice(){
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id=id;
	}

	public String getMakerName() {

		return makerName;
	}

	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}

	public String getImage_file_path() {

		return image_file_path;
	}

	public void setImage_file_path(String image_file_path) {
		this.image_file_path = image_file_path;
	}

}
