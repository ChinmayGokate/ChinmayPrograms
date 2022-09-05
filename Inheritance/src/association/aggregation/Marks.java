package association.aggregation;

public class Marks 
{
	int m1,m2,m3;
	Marks(int m1,int m2,int m3)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;	
	}
	@Override
	public String toString() {
		return "Marks [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
}
