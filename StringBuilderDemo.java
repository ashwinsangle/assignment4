package assignment4;

public class StringBuilderDemo {

	public static void main(String[] args) {
	
			StringBuilder sb =new StringBuilder("ashwini");
			StringBuilder sb1=new StringBuilder("sangle");
			StringBuilder s=(new StringBuilder()).append(sb).append(sb1);
			System.out.println("String 1"+sb);
			System.out.println("String 2 :"+sb1);
			System.out.println("After String Concatenation :"+s);

			}
}


