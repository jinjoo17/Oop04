package com.bit.oop4.DTO;

import com.bit.oop4.vo.BookVO;

public class Exec04 {

	public static void main(String[] args) {
		
		int num1 = 30;
		System.out.println("num1:"+num1);
		setInt(num1);
		
		
		BookVO vo = new BookVO();
		vo.setStrTitle("자바야 놀자");
	    vo.setStrAuthor("남궁성");
	    vo.setIntprice(3000);
	    
	    System.out.println("첫번째:"+vo.toString());
	    setRef(vo);
	    System.out.println("두번째:"+vo.toString());
	    
	    
	    
	    
		
	}
	
	static void setRef(BookVO vo1){
		vo1.setStrTitle("윈도우세상");
		
	}
    static void setInt(int num){
    	num=100;
    }
}
