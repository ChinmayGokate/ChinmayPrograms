package store;

import java.util.Scanner;

public class OrganicStore 
{
	Scanner sc = new Scanner(System.in);
	int Fruites=1,Vegetables=2,Cosmetics=3,Masala_powder=4,no,code,ContiExit,S_no=1;
	String s="",s1;
	
	static OrganicStore os=new OrganicStore();
	
	int PotatoPrice=41;
	int BrinjalPrice=35;
	int CarrotsPrice=60;
	int BeetrootPrice=44;
	int DrumstickPrice=60;
	int MushroomPrice=50;
	
	int MangoesPrice=50;
	int ApplesPrice=100;
	int BananasPrice=25;
	int PapayaPrice=44;
	int GrapesPrice=60;
	int OrangesPrice=50;
	
	int PowderPrice=20;
	int FaceWashPrice=40;
	int CreamPrice=30;
	int LipstickPrice=35;
	int MakeupKitPrice=120;
	int HandCreamPrice=45;
	
	int SambarPowderPrice=290;
	int RasamPowderPrice=100;
	int GaramMasalaPrice=300;
	int PulaoMasalaPrice=310;
	int CurryPowderPrice=200;
	int HandBhathMasalaPrice=620;
	
	int kgPotato,kgMangoes,kgPowder,kgSambarPowder;
	int kgBrinjal,kgApples,kgFaceWash,kgRasamPowder;
	int kgCarrots,kgBananas,kgCream,kgGaramMasala;
	int kgBeetroot,kgPapaya,kgLipstick,kgPulaoMasala;
	int kgDrumstick,kgGrapes,kgMakeupKit,kgCurryPowder;
	int kgMushroom,kgOranges,kgHandCream,kgHandBhathMasala;
	
	int TotalPriceP,TotalPriceP1;
	int TotalPriceB,TotalPriceB1;
	int TotalPriceC,TotalPriceC1;
	int TotalPriceBe,TotalPriceBe1;
	int TotalPriceD,TotalPriceD1;
	int TotalPriceM,TotalPriceM1;
	
	int TotalPriceMa,TotalPriceMa1;
	int TotalPriceAp,TotalPriceAp1;
	int TotalPriceBa,TotalPriceBa1;
	int TotalPricePa,TotalPricePa1;
	int TotalPriceGr,TotalPriceGr1;
	int TotalPriceOr,TotalPriceOr1;
	
	int TotalPricePd,TotalPricePd1;
	int TotalPriceFw,TotalPriceFw1;
	int TotalPriceCm,TotalPriceCm1;
	int TotalPriceLt,TotalPriceLt1;
	int TotalPriceMk,TotalPriceMk1;
	int TotalPriceHc,TotalPriceHc1;
	
	int TotalPriceSp,TotalPriceSp1;
	int TotalPriceRp,TotalPriceRp1;
	int TotalPriceGm,TotalPriceGm1;
	int TotalPricePm,TotalPricePm1;
	int TotalPriceCp,TotalPriceCp1;
	int TotalPriceBm,TotalPriceBm1;
	
	int TotalAmountBill;
	int TotalAmount1=0,TotalAmount2=0,TotalAmount3=0,TotalAmount4=0;
	
	public void Menu()
	{
		System.out.println("=============Welcome to Organic Store==============");
		System.out.println("---------------------------------------------------");
		
		System.out.println("Available products in the store");
		System.out.println("1)Fruits");
		System.out.println("2)Vegetables");
		System.out.println("3)Cosmetics");
		System.out.println("4)Masala Powders");
		
		System.out.println("Please enter your choice? ");
		System.out.println("---------------------------------------------------");
		no=sc.nextInt();
		System.out.println("---------------------------------------------");
		os.items();
	}
	public void items()
	{
		if(no==1||no==2||no==3||no==4)
		{
			if(no==2)
			{
				 System.out.println("225---Potato---1kg is 41.");
				 System.out.println("226---Brinjal---1kg is 35.");
				 System.out.println("227---Carrots---1kg is 60.");
				 System.out.println("228---Beetroot---1kg is 44.");
				 System.out.println("229---Drumstick---1kg is 60.");
				 System.out.println("230---Mushroom---1kg is 50.");
				 
				 System.out.println("please choose your product code :");
				 System.out.println("---------------------------------------------");
					code=sc.nextInt();
				 System.out.println("---------------------------------------------");
				 
				 if(code==225||code==226||code==227||code==228||code==229||code==230)
				 {
					 switch(code)
					 {
					 case 225:
						 {
							 System.out.println("Patato and How many kgs do u need?");
							 kgPotato=sc.nextInt();
							 TotalPriceP=kgPotato*PotatoPrice;
							 s1=S_no+"    |  "+kgPotato+"    | Patato               |"+ TotalPriceP;
							 TotalPriceP1=TotalPriceP1+TotalPriceP;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 case 226:
						 {
							 System.out.println("Brinjal and How many kgs do u need?");
							 kgBrinjal=sc.nextInt();
							 TotalPriceB=kgBrinjal*BrinjalPrice;
							 s1=S_no+"    |  "+kgBrinjal+"   | Brinjal              |"+ TotalPriceB;
							 TotalPriceB1=TotalPriceB1+TotalPriceB;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 case 227:
						 {
							 System.out.println("Carrots and How many kgs do u need?");
							 kgCarrots=sc.nextInt();
							 TotalPriceC=kgCarrots*CarrotsPrice;
							 s1=S_no+"    |  "+kgCarrots+"   | Carrots              |"+ TotalPriceC;
							 TotalPriceC1=TotalPriceC1+TotalPriceC;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 case 228:
						 {
							 System.out.println("Beetroot and How many kgs do u need?");
							 kgBeetroot=sc.nextInt();
							 TotalPriceBe=kgBeetroot*BeetrootPrice;
							 s1=S_no+"    |  "+kgBeetroot+"   | Beetroot            |"+ TotalPriceBe;
							 TotalPriceBe1=TotalPriceBe1+TotalPriceBe;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 case 229:
						 {
							 System.out.println("Drumstick and How many kgs do u need?");
							 kgDrumstick=sc.nextInt();
							 TotalPriceD=kgDrumstick*DrumstickPrice;
							 s1=S_no+"    |  "+kgDrumstick+"   | Drumstick          |"+ TotalPriceD;
							 TotalPriceD1=TotalPriceD1+TotalPriceD;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 case 230:
						 {
							 System.out.println("Mushroom and How many kgs do u need?");
							 kgMushroom=sc.nextInt();
							 TotalPriceM=kgMushroom*MushroomPrice;
							 s1=S_no+"    |  "+kgMushroom+"   | Mushroom            |"+ TotalPriceM;
							 TotalPriceM1=TotalPriceM1+TotalPriceM;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 } 
				 } 
				 else
				 {
					 System.out.println("Invalid code");
					 os.items();
				 } 
			}
			else if(no==1)
			{
				 System.out.println("125---Mangoes---1kg is 50.");
				 System.out.println("126---Apples---1kg is 100.");
				 System.out.println("127---Bananas---1kg is 25.");
				 System.out.println("128---Papaya---1kg is 44.");
				 System.out.println("129---Grapes---1kg is 60.");
				 System.out.println("130---Oranges---1kg is 50.");
				 
				 System.out.println("please choose your product code :");
				 System.out.println("---------------------------------------------");
					code=sc.nextInt();
				 System.out.println("---------------------------------------------");
				 
				 if(code==125||code==126||code==127||code==128||code==129||code==130)
				 {
					 switch(code)
					 {
					 case 125:
						 {
							 System.out.println("Mangoes and How many kgs do u need?");
							 kgMangoes=sc.nextInt();
							 TotalPriceMa=kgMangoes*MangoesPrice;
							 s1=S_no+"    |  "+kgMangoes+"    | Mamgoes             |"+ TotalPriceMa;
							 TotalPriceMa1=TotalPriceMa1+TotalPriceMa;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 }
					 switch(code)
					 {
					 case 126:
						 {
							 System.out.println("Apples and How many kgs do u need?");
							 kgApples=sc.nextInt();
							 TotalPriceAp=kgApples*ApplesPrice;
							 s1=S_no+"    |  "+kgApples+"    | Apples               |"+ TotalPriceAp;
							 TotalPriceAp1=TotalPriceAp1+TotalPriceAp;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 }
					 switch(code)
					 {
					 case 127:
						 { 
							 System.out.println("Bananas and How many kgs do u need?");
							 kgBananas=sc.nextInt();
							 TotalPriceBa=kgBananas*BananasPrice;
							 s1=S_no+"    |  "+kgBananas+"   | Bananas              |"+ TotalPriceBa;
							 TotalPriceBa1=TotalPriceBa1+TotalPriceBa;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
							 //TotalAmount1=TotalPriceMa1+TotalPriceAp1+TotalPriceBa1+TotalPricePa1+TotalPriceGr1+TotalPriceOr1;	
						 }
					 }
					 switch(code)
					 {
					 case 128:
						 {
							 System.out.println("Papaya and How many kgs do u need?");
							 kgPapaya=sc.nextInt();
							 TotalPricePa=kgPapaya*PapayaPrice;
							 s1=S_no+"    |  "+kgPapaya+"    | Papaya               |"+ TotalPricePa;
							 TotalPricePa1=TotalPricePa1+TotalPricePa;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 }
					 switch(code)
					 {
					 case 129:
						 {
							 System.out.println("Grapes and How many kgs do u need?");
							 kgGrapes=sc.nextInt();
							 TotalPriceGr=kgGrapes*GrapesPrice;
							 s1=S_no+"    |  "+kgGrapes+"    | Grapes               |"+ TotalPriceGr;
							 TotalPriceGr1=TotalPriceGr1+TotalPriceGr;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 }
					 switch(code)
					 {
					 case 130:
						 {
							 System.out.println("Oranges and How many kgs do u need?");
							 kgOranges=sc.nextInt();
							 TotalPriceOr=kgOranges*OrangesPrice;
							 s1=S_no+"    |  "+kgOranges+"   | Oranges              |"+ TotalPriceOr;
							 TotalPriceOr1=TotalPriceOr1+TotalPriceOr;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 } 
				 } 
				 else
				 {
					 System.out.println("Invalid code");
					 os.items();
				 }
			}
			else if(no==3)
			{
				 System.out.println("325---Powder---1kg is 50.");
				 System.out.println("326---FaceWash---1kg is 100.");
				 System.out.println("327---Lipstick---1kg is 25.");
				 System.out.println("328---MakeupKit---1kg is 44.");
				 System.out.println("329---Cream---1kg is 60.");
				 System.out.println("330---HandCream---1kg is 50.");
				 
				 System.out.println("please choose your product code :");
				 System.out.println("---------------------------------------------");
					code=sc.nextInt();
				 System.out.println("---------------------------------------------");
				 
				 if(code==325||code==326||code==327||code==328||code==329||code==330)
				 {
					 switch(code)
					 {
					 case 325:
						 {
							 System.out.println("Powder and How many kgs do u need?");
							 kgPowder=sc.nextInt();
							 TotalPricePd=kgPowder*PowderPrice;
							 s1=S_no+"    |  "+kgPowder+"    | Powder                 |"+ TotalPricePd;
							 TotalPricePd1=TotalPricePd1+TotalPricePd;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 case 326:
						 {
							 System.out.println("FaceWash and How many kgs do u need?");
							 kgFaceWash=sc.nextInt();
							 TotalPriceFw=kgFaceWash*FaceWashPrice;
							 s1=S_no+"    |  "+kgFaceWash+"   | FaceWash              |"+ TotalPriceFw;
							 TotalPriceFw1=TotalPriceFw1+TotalPriceFw;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 case 327:
						 { 
							 System.out.println("Lipstick and How many kgs do u need?");
							 kgLipstick=sc.nextInt();
							 TotalPriceLt=kgLipstick*LipstickPrice;
							 s1=S_no+"    |  "+kgLipstick+"   | Lipstick               |"+ TotalPriceLt;
							 TotalPriceLt1=TotalPriceLt1+TotalPriceLt;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 case 328:
						 {
							 System.out.println("MakeupKit and How many kgs do u need?");
							 kgMakeupKit=sc.nextInt();
							 TotalPriceMk=kgMakeupKit*MakeupKitPrice;
							 s1=S_no+"    |  "+kgMakeupKit+"   | MakeupKit             |"+ TotalPriceMk;
							 TotalPriceMk1=TotalPriceMk1+TotalPriceMk;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 case 329:
						 {
							 System.out.println("Cream and How many kgs do u need?");
							 kgCream=sc.nextInt();
							 TotalPriceCm=kgCream*CreamPrice;
							 s1=S_no+"    |  "+kgCream+"   | Cream                |"+ TotalPriceCm;
							 TotalPriceCm1=TotalPriceCm1+TotalPriceCm;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 case 330:
						 {
							 System.out.println("HandCream and How many kgs do u need?");
							 kgHandCream=sc.nextInt();
							 TotalPriceHc=kgHandCream*HandCreamPrice;
							 s1=S_no+"    |  "+kgHandCream+"   | HandCream             |"+ TotalPriceHc;
							 TotalPriceHc1=TotalPriceHc1+TotalPriceHc;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 } 
				 } 
				 else
				 {
					 System.out.println("Invalid code");
					 os.items();
				 }
			}
			else if(no==4)
			{
				 System.out.println("425---Sambar Powder---1kg is 290.");
				 System.out.println("426---Rasam Powder---1kg is 100.");
				 System.out.println("427---Garam Masala---1kg is 400.");
				 System.out.println("428---Pulao Masala---1kg is 310.");
				 System.out.println("429---Curry Powder---1kg is 220");
				 System.out.println("430---Bisibele Bhath Masala---1kg is 650");
				 
				 System.out.println("please choose your product code :");
				 System.out.println("---------------------------------------------");
					code=sc.nextInt();
				 System.out.println("---------------------------------------------");
				 
				 if(code==425||code==426||code==427||code==428||code==429||code==430)
				 {
					 switch(code)
					 {
					 case 425:
						 {
							 System.out.println("Sambar Powder and How many kgs do u need?");
							 kgSambarPowder=sc.nextInt();
							 TotalPriceSp=kgSambarPowder*SambarPowderPrice;
							 s1=S_no+"    |  "+kgSambarPowder+"    | SambarPowder            |"+ TotalPriceSp;
							 TotalPriceSp1=TotalPriceSp1+TotalPriceSp;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 case 426:
						 {
							 System.out.println("Rasam Powder and How many kgs do u need?");
							 kgRasamPowder=sc.nextInt();
							 TotalPriceRp=kgRasamPowder*RasamPowderPrice;
							 s1=S_no+"    |  "+kgRasamPowder+"   | RasamPowder            |"+ TotalPriceRp;
							 TotalPriceRp1=TotalPriceRp1+TotalPriceRp;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 case 427:
						 { 
							 System.out.println("Garam Masala and How many kgs do u need?");
							 kgGaramMasala=sc.nextInt();
							 TotalPriceGm=kgGaramMasala*GaramMasalaPrice;
							 s1=S_no+"    |  "+kgGaramMasala+"   | GaramMasala               |"+ TotalPriceGm;
							 TotalPriceGm1=TotalPriceGm1+TotalPriceGm;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 case 428:
						 {
							 System.out.println("Pulao Masala and How many kgs do u need?");
							 kgPulaoMasala=sc.nextInt();
							 TotalPricePm=kgPulaoMasala*PulaoMasalaPrice;
							 s1=S_no+"    |  "+kgPulaoMasala+"   | PulaoMasala            |"+ TotalPricePm;
							 TotalPricePm1=TotalPricePm1+TotalPricePm;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 case 429:
						 {
							 System.out.println("Curry Powder and How many kgs do u need?");
							 kgCurryPowder=sc.nextInt();
							 TotalPriceCp=kgCurryPowder*CurryPowderPrice;
							 s1=S_no+"    |  "+kgCurryPowder+"   | CurryPowder           |"+ TotalPriceCp;
							 TotalPriceCp1=TotalPriceCp1+TotalPriceCp;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 case 430:
						 {
							 System.out.println("Bisibele Bhath Masala and How many kgs do u need?");
							 kgHandBhathMasala=sc.nextInt();
							 TotalPriceBm=kgHandBhathMasala*HandBhathMasalaPrice;
							 s1=S_no+"    |  "+kgHandBhathMasala+"   | Bisibele Bhath Masala   |"+ TotalPriceBm;
							 TotalPriceBm1=TotalPriceBm1+TotalPriceBm;
							 s=s+s1+"\n";
							 os.invalid();
							 break;
						 }
					 } 
				 } 
				 else
				 {
					 System.out.println("Invalid code");
					 os.items();
				 }
			}			 		 
		}
		else
		{
			System.out.println("invalid Choice");
			os.Menu();
		}	
	}
	public void invalid()
	{
		System.out.println("PRESS 1 to continue shopping");
		 System.out.println("  PRESS 2 to exit");
		 ContiExit =sc.nextInt();
		 
		if(ContiExit==1||ContiExit==2)
		{
			if(ContiExit==1)
				{
				S_no++;
				os.Menu(); 
				return;
				}
			if(ContiExit==2)
			{
			os.bill(); 
			}
		}
		else
		{
			System.out.println("Invalid Choice ");
			os.invalid();
		}
	}
	public void bill()
	{
		System.out.print("Enter your name:");
		sc.nextLine();
		String name=sc.nextLine();
		
		System.out.print("Enter your Address:");
		String address=sc.nextLine();
		
		System.out.print("Enter your Contact no:");
		long phoneno=sc.nextLong();
		System.out.println();
		System.out.println("===Welcome to Organic Store===");
		
		System.out.println("-------------------------------------------------------");
		System.out.println("S.no | Qty  | Name                 | price");
		System.out.println("-------------------------------------------------------");
	
		System.out.println(s);
		System.out.println("-----------------------------------------------------");
		
		System.out.print("Your name:"+name+"\n");
		System.out.print("Your address:"+address+"\n");
		System.out.print("your contact no:"+phoneno);
		System.out.println();
		System.out.println("-----------------------------------------------------");
		
		TotalAmount2=TotalPriceP1+TotalPriceB1+TotalPriceC1+TotalPriceBe1+TotalPriceD1+TotalPriceM1;
		TotalAmount1=TotalPriceMa1+TotalPriceAp1+TotalPriceBa1+TotalPricePa1+TotalPriceGr1+TotalPriceOr1;
		TotalAmount3=TotalPricePd1+TotalPriceFw1+TotalPriceCm1+TotalPriceLt1+TotalPriceMk1+TotalPriceHc1;
		TotalAmount4=TotalPriceSp1+TotalPriceRp1+TotalPriceGm1+TotalPricePm1+TotalPriceCp1+TotalPriceBm1;
		
		TotalAmountBill=TotalAmount1+TotalAmount2+TotalAmount3+TotalAmount4;
		System.out.println("Total bill of your purchased items:"+TotalAmountBill);
		
		float discount =(float)(TotalAmountBill*0.05);
		System.out.println("you received a discount of 5% : "+discount);
		
		float finalbill=TotalAmountBill-discount;
		System.out.println("Final bill is: "+finalbill);
		System.out.println("======Thankyou for Shopping you saved "+ discount+"Rs======");
		System.out.println("----------------------------------------------------------");
		sc.close();
		//System.exit(0);	
	}
	public static void main(String[] args) 
	{
		os.Menu();	
	}
}
