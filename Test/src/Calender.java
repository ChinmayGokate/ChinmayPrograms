//	package test;
	import java.util.Scanner;
	public class Calender {
		int feb;
		public int getRemainder(int y,int m,int d)
		{
			int count=0;
			for(int i=1;i<=y;i++)
			{
				if(i%400==0||(i%4==0&&i%100!=0))
					count+=2;
				else
					count++;
			}
			count=count%7;

			switch(m-1)
			{
			case 0: count+=0; break;
			case 1: count+=3; break;
			case 2: count+=3+feb; break;
			case 3: count+=6+feb; break;
			case 4: count+=8+feb; break;
			case 5: count+=11+feb; break;
			case 6: count+=13+feb; break;
			case 7: count+=16+feb; break;
			case 8: count+=19+feb; break;
			case 9: count+=21+feb; break;
			case 10: count+=24+feb; break;
			case 11: count+=26+feb; break;
			case 12: count+=29+feb; break;
			}	
			return (count+d)%7;
		}
		public void setFeb(int y,int m,int d)
		{
			if(y%400==0||(y%4==0&&y%100!=0))
			{
				if(m<=2&&d<=28)
					feb=0;
				else
					feb=1;
			}else feb=0;

		}
		public static void main(String[] args) {
			Calender ob = new Calender();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Year: ");
			int year =sc.nextInt();
			System.out.println("Enter Month: ");
			int month=sc.nextInt();
			System.out.println("Enter Date: ");
			int day = sc.nextInt();
			sc.close();
			ob.setFeb(year,month,day);
			int rem = ob.getRemainder(year-1,month,day);
			switch(rem)
			{
			case 0: System.out.println("Sunday");  break;
			case 1: System.out.println("Monday");  break;
			case 2: System.out.println("Tuesday");  break;
			case 3: System.out.println("Wednesday");  break;
			case 4: System.out.println("Thursday");  break;
			case 5: System.out.println("Friday");  break;
			case 6: System.out.println("Saturday");  break;
			}
		}

	}


	
	

