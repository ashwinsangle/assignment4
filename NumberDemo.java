package assignment4;

import java.util.Scanner;

public class NumberDemo {
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		try
		{
			String input=sc.next();
			int num=Integer.parseInt(input);
			int square=num*num;
			System.out.println("square value of given number"+square);
		}
		catch(Exception e)
		{
			System.out.println("valid integer");
			System.out.println(e.getMessage());
		}
		finally
		{
			sc.close();
		}
			}
		}

