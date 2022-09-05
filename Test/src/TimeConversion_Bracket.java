

public class TimeConversion_Bracket 
{
	public boolean brackets(String str)
	{
		System.out.printf("%f",2/(double)6);
		if(str=="(()())")
		{
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) 
	{
		String str="(()())";
		String time="12:45:54PM";
		String time1[]=time.split(":");
		char ch[]=time.toCharArray();
		char ch1=(char)(ch.length-2);
		//System.out.println(time.charAt(ch1));
		int ch3 = Integer.parseInt(time1[0]);
		//System.out.println(ch3);
		//System.out.println(Integer.parseInt());
		
		
		TimeConversion_Bracket b=new TimeConversion_Bracket();
		//System.out.print(b.brackets(str));
		System.out.println(b.timeConversion(time));
	}
	 public static String timeConversion(String s) {
		    // Write your code here
		    //String time="01:04:44PM";
		 String s1="";
	        String time1[]=s.split(":");
	        String time2=time1[2];
	        char timechar[]=time2.toCharArray();
	        char ch[]=s.toCharArray();
	        char ch1=(char)(ch.length-2);
	        char ch2=s.charAt(ch1);
	        System.out.println(s.charAt(ch1));
	        int ch3 = Integer.parseInt(time1[0]);
	        System.out.println(ch3);
	        if(ch2=='A')
	        {
	        	 if(ch3==12)
	             {
	                 s1="00"+":"+time1[1]+":"+(""+timechar[0]+timechar[1]);
	             }
	        	 else
	            s1=time1[0]+":"+time1[1]+":"+(""+timechar[0]+timechar[1]);
	        }
	        if(ch2=='P')
	        {int t1 = 12;
	        	if(ch3<12)
	        		t1=ch3+12;
	            s1=t1+":"+time1[1]+":"+(""+timechar[0]+timechar[1]);
	        }
	        return s1;
	    }
}
