package assignment4;

import java.util.StringTokenizer;

public class StringT {
	public static void main(String[] args) {
		
		StringTokenizer st=new StringTokenizer("hello world");
		try
		{
			
		
		String token1=st.nextToken();
		System.out.println(token1);
		String token2=st.nextToken();
		System.out.println(token2);
		String token3=st.nextToken();
		System.out.println(token2);
		}
		catch(Exception e)
		{
			System.out.println("there are no addtional token");
		}
	}
}

