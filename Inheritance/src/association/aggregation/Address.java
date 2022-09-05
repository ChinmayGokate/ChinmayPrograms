package association.aggregation;

public class Address 
{
	int dno;
	String street;

	Address(int dno,String street)
	{
		this.dno=dno;
		this.street=street;
	}

	@Override
	public String toString() {
		return "Address [dno=" + dno + ", street=" + street + "]";
	}
	
}
