package tostring;

public class Char01 {

	public static void main(String[] args) {
		
		char ch = 'A';
		System.out.println(ch);
		//문자(char)는 덧셈 뺄셈이 가능
		int num = ch - 'A';
		System.out.println(num);
		System.out.printf("%d\n",ch-0);
		
		System.out.printf("%d\n",'0'-0);
		System.out.printf("%d\n",'a'-0);
		//A부터Z가지 ASCII코드 
		for(int i= 'A'; i<'Z';i++){
			System.out.println(i);
		}//A부터 Z까지 문자열을보여줌
		for(char i='A'; i <='Z';i++){
			System.out.println(i);
		}
	}

}
