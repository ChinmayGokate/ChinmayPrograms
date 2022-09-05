package thisKeyword;



class Emp
{
	 protected int empId,empSal;
	String empName;
}
class Manager extends Emp
{
	protected String deptNo,designation;

	public Manager(int empId,int empSal,String empName,String deptNo, String designation) 
	{
		super.empId=empId;
		this.empSal=empSal;
		this.empName=empName;
		this.deptNo = deptNo;
		this.designation = designation;
	}
	public void Show()
	{
		System.out.println(empId+" "+empSal+" "+empName+" "+deptNo+" "+designation);
	}
}
public class ThisDemo 
{
	public static void main(String[] args) 
	{
		Manager m= new Manager(1, 2000, "chinmay", "102","developer");
		m.Show();
		
	}
}
