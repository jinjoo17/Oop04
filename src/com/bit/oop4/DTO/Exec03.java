package com.bit.oop4.DTO;

import com.bit.oop4.vo.BookVO;

public class Exec03 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;

		System.out.println("num1:" +num1);
		System.out.println("num2:" +num2);
		
		num2=num1;
		num2 = 100;
		
		System.out.println("num1:"+num1);
		
		
		BookVO vo1 =new BookVO();
		vo1.setStrTitle("자바만세");
		vo1.setStrAuthor("홍길동");
		vo1.setIntprice(20000);
		
	   System.out.println("vo1:"+ vo1.toString());

	   
		
		BookVO vo2 = new BookVO();
		vo2=vo1;// 객체를 복사하면 같은 객체가 되버림, 주소를 복사하기때문
		System.out.println("vo2:"+ vo2.toString());

		
		vo2.setStrTitle("윈도우만세");
		
		System.out.println("vo1:"+ vo1.toString());
		System.out.println("vo2:"+ vo2.toString());//

		
	}

}
