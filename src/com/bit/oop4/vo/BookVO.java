package com.bit.oop4.vo;

public class BookVO extends Object {
  
	
	
	private String strTitle;
	private String strAuthor;
	private int intPrice;
	public String getStrTitle() {
		return strTitle;
	}
	public void setStrTitle(String strTitle) {
		this.strTitle = strTitle;
	}
	public String getStrAuthor() {
		return strAuthor;
	}
	public void setStrAuthor(String strAuthor) {
		this.strAuthor = strAuthor;
	}
	public int getIntprice() {
		return intPrice;
	}
	public void setIntprice(int intprice) {
		this.intPrice = intprice;
	}
	@Override
	public String toString() {
		return "BookVO [strTitle=" + strTitle + ", strAuthor=" + strAuthor + ", intPrice=" + intPrice + "]";
	}
	
	
	
}
