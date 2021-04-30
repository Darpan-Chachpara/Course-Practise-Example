import java.util.Scanner;
 
public class JavaBeanGetterSetter
{
	private int id;
	public int getEmpid()
	{
		return id;
	}
	public void setEmpid(int id)
	{
		this.id=id;
	}
	
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	private double basicsalary;
	public double getBasicSalary()
	{
		return basicsalary;
	}
	public void setBasicSalary(double basicsalary)
	{
		this.basicsalary=basicsalary;
	}
	
	private double hra;
	public double getHRA()
	{
		return hra=0.50*basicsalary;
	}
	public void setHRA(double hra)
	{
		this.hra=hra;
	}
	
	private double pf;
	public double getPF()
	{
		return pf=0.12*basicsalary;
	}
	public void setPF(double pf)
	{
		this.pf=pf;
	}
	
	private double medical;
	public double getMedical()
	{
		return medical;
	}
	public void setMedical(double medical)
	{
		this.medical=medical;
	}
	
	private double gross;
	public double getGrossSalary()
	{
		return gross=basicsalary+hra+medical;
	}
	public void setGrossSalary(double gross)
	{
		this.gross=gross;
	}
	
	private double pt;
	public double getPT()
	{
		return pt;
	}
	public void setPT(double pt)
	{
		this.pt=pt;
	}
	
	private double netsalary;
	public double getnetsalary()
	{
		netsalary=gross-(pt+pf);
		return netsalary;
	}
	public void setnetsalary(double netsalaary)
	{
		this.netsalary=netsalary;
	}
	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ID NUMBER OF THE EMPLOYEE : ");
		int id=sc.nextInt();
		System.out.println("ENTER NAME OF THE EMPLOYEE : ");
		String name=sc.next();
		System.out.println("ENTER BASIC SALARY OF THE EMPLOYEE : ");
		double basicsalary=sc.nextDouble();
		System.out.println("ENTER HRA OF THE EMPLOYEE : ");
		double hra=sc.nextDouble();
		System.out.println("ENTER PF OF THE EMPLOYEE : ");
		double pf=sc.nextDouble();
		System.out.println("ENTER MEDICAL STATUS OF THE EMPLOYEE : ");
		double medical=sc.nextDouble();
		System.out.println("ENTER GROSS STATUS OF THE EMPLOYEE : ");
		double gross=sc.nextDouble();
		//System.out.println("ENTER PT OF THE EMPLOYEE : ");
		//double pt=sc.nextDouble();
		System.out.println("ENTER NET SALARY OF THE EMPLOYEE : ");
		double netsalary=sc.nextDouble();
		sc.close();
		
		
		JavaBeanGetterSetter emp=new JavaBeanGetterSetter();
		emp.setEmpid(id);
		System.out.println("EMPLOYEE ID IS "+emp.getEmpid());
		emp.setName(name);
		System.out.println("EMPLOYEE NAME IS "+emp.getName());
		emp.setBasicSalary(basicsalary);
		System.out.println("EMPLOYEE BASIC SALARY IS "+emp.getBasicSalary());
		emp.setHRA(hra);
		System.out.println("EMPLOYEE HRA(HOUSE RENT ALLOWANCE) IS "+emp.getHRA());
		emp.setPF(pf);
		System.out.println("EMPLOLYEE PF(PROVIDENT FUND) IS "+emp.getPF());
		emp.setMedical(medical);
		System.out.println("EMPLOYEE MEDI CLAIM IS "+emp.getMedical());
		emp.setGrossSalary(gross);
		System.out.println("EMPLOYEE GROSS SALARY IS "+emp.getGrossSalary());
		emp.setPT(200);
		System.out.println("EMPLOYEE PT(PROFESSIONAL TAX) IS "+emp.getPT());
		emp.setnetsalary(netsalary);
		System.out.println("EMPLOYEE NET SALARY IS "+emp.getnetsalary());
		
		
	}

	
}
