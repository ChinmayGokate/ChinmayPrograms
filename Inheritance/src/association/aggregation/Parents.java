package association.aggregation;

public class Parents 
{
	String fname,mname;
	
	Parents(String fname, String mname)
	{
		this.fname=fname;
		this.mname=mname;
	}

	@Override
	public String toString() {
		return "Parents [fname=" + fname + ", mname=" + mname + "]";
	}
	
	public void parents()
	{
		System.out.println("I am your parents");
	}
}
