package string;
/*You are asked to create an application for registering the details of jobseeker. The requirement is: Username
 *  should always end with _job and there should be atleast minimum of 8 characters to the left of _job.
 Write a function to validate the same. Return true in case the validation is passed. In case of validation
  failure return false.
  
Method Name 	validateUserName 
Method Description 	Checks if the username is valid 
Argument 	String userName 
Return Type 	boolean 
Logic 	Checks if the username ends with _job and contains at least 8 characters to the left of _job.
 If valid return true. Else return false. 


*/
public class JobSeekerDetails 
{
	public boolean validateUserName(String userName)
	{
		char ch[] =new char[userName.length()];
		
		for(int i=0;i<userName.length();i++)
		{
			ch[i]=userName.charAt(i);
		}
				
		if(ch.length>=12)
		{
			String s1=new String(ch,ch.length-4,4);
			//System.out.println(s1);

			if(s1.equals("_job"))
			{
				return true;
			}
		}
		
		
		
		
		return false;
		
	}
	public static void main(String[] args) {
		JobSeekerDetails js=new JobSeekerDetails();
		String s="chinmayJ_job";
		System.out.println(js.validateUserName(s));
	}
}
