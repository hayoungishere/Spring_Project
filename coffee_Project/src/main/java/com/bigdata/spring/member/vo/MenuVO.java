package com.bigdata.spring.member.vo;

public class MenuVO {
	int idx;
	String menu_name;
	String ingredient_idxs;
	String ingredient_amounts;
	String price;
	String categories;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public String getIngredient_idxs() {
		return ingredient_idxs;
	}
	public void setIngredient_idxs(String ingredient_idxs) {
		this.ingredient_idxs = ingredient_idxs;
	}
	public String getIngredient_amounts() {
		return ingredient_amounts;
	}
	public void setIngredient_amounts(String ingredient_amounts) {
		this.ingredient_amounts = ingredient_amounts;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	
	
}
