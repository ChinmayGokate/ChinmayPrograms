import java.io.Serializable;
public class SerializationEmp implements Serializable
{
	public int empid;
	public String name;
	SerializationEmp(int empid,String name)
	{
		empid = this.empid;
		name = this.name;
	}
	
}
