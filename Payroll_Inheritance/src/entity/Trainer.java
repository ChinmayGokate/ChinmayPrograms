package entity;

public class Trainer extends Employee 
{
	
	int batchCount;
	double perkPerBatch;
	
	
	public Trainer(int id, String name, double basicSalary, double hRAPer, double dAPer, int batchCount,
			double perkPerBatch) {
		
									super(id,name,basicSalary,hRAPer,dAPer);
									this.batchCount = batchCount;
									this.perkPerBatch = perkPerBatch;
								 }
	
	public double calculateGrossSalary()
	{
		return super.calculateGrossSalary()+(batchCount * perkPerBatch);	
	}
	
	
}
