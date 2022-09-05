package creditCard;

import java.util.Scanner;

/*A class called Customer is given to you. 
The task is to find the Applicable Credit card Type and create CardType object based on the Credit Points of 
a customer.

Define the following for the class.

Attributes : 
	customerName : String,private
	creditPoints: int,private

Constructor :
	parameterizedConstructor: for both cusotmerName & creditPoints in that order.

Methods :
	Name of the method : getCreditPoints
	Return Type : int
	Modifier   : public 
	Task : This must return creditPoints
	
	Name of the method : toString -OverRide it, 
	Return type : String 
	Task :  return only customerName from this.

Create another class called CardType. Define the following for the class

Attributes :
	customer : Customer, private
	cardType : String, private
Constructor :
	parameterizedConstructor: for customer and cardType attributes in that order

Methods :
	Name of the method : toString  Override this.  
	Return type : String
	Modifier : private
	Task :  Return the string in the following format.
		The Customer 'Rajeev' Is Eligible For 'Gold' Card.


Create One more class by name CardsOnOffer and define the following for the class.

Method : 
	Name Of the method : getOfferedCard 
	Return type : CardType
	Modifiers: public,static
	Arguments: Customer object
	Task : 	Create and return a CardType object after logically finding Grade from creditPoints as per
    the below rules.
		Marks	 	Grade
		100  - 500   -   Silver
		501  - 1000  -   Gold
		1001 >       -   Platinum
		< 100        -   EMI
		
Code a Main class with main() method to test the working of the above.*/

	class Customer
	{
		private String customerName ;
		private int creditPoints;
		
		Customer(String customerName,int creditpoints)
		{
			this.customerName=customerName;
			this.creditPoints=creditpoints;
		}
		public int getCreditPoints()
		{
			return creditPoints;	
		}	
		public String toString()
		{
			return customerName;
			
		}
	}
	class CardType
	{
		private Customer customer ;
		private String cardType ;
		
		public CardType(Customer customer, String cardType) 
		{
			this.customer = customer;
			this.cardType = cardType;
		}
		
		public String toString()
		{
			return "The Customer '"+customer+"' Is Eligible For '"+cardType+"' Card.";
		}
	}
	
	class CardsOnOffer
	{
		public static CardType getOfferedCard (Customer ob)
		{
			if(ob.getCreditPoints()>=100 && ob.getCreditPoints()<500)
			{
				CardType ct=new CardType(ob, "silver");
				return ct;
			}
			else if(ob.getCreditPoints()>=500 && ob.getCreditPoints()<1000)
			{
				CardType ct=new CardType(ob, "Gold");
				return ct;
			}
			else if(ob.getCreditPoints()>=1000 )
			{
				CardType ct=new CardType(ob, "Platinum");
				return ct;
			}
			else
			{
				CardType ct=new CardType(ob, "EMI");
				return ct;
			}
		}	
	}
	
	public class CreditCard 
	{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter Customer name :");
			String s=sc.nextLine();
			System.out.print("Enter Customer Credit Points :");
			int cp=sc.nextInt();
			Customer c=new Customer(s,cp);
			//CardsOnOffer co=new CardsOnOffer();
			CardType c1=CardsOnOffer.getOfferedCard(c);
			System.out.println(c1);
		}
	}
