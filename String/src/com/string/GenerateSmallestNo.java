package com.string;
/* input-7136 output-13
   input-9887 output-78  */

// wrong program
public class GenerateSmallestNo 
{
	public int generateSmallest(int input)
	{
		int a,b,c,d,e;
		a=input%100;
		b=input/100;
		c=(input/10)%100;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		if(a<b && a<c)
		{
			System.out.println(a);
		}
		else if(b<c)
			System.out.println(b);
		else
			System.out.println(c);
		return 0;
	}
	public static void main(String[] args) 
	{
		int input=1136;
		GenerateSmallestNo gsn=new GenerateSmallestNo();
		gsn.generateSmallest(input);
	}
}
