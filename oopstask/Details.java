package oopstask;
class bank 
{
	private String name; 
	private int age; 
	private int accountnumber; 
	public String getname() 
	{ 
		return name; 
		}
	public void setname(String name) 
	{ 
		this.name = name;
		}
	public int getage()
	{ return age; 
	} public void setage(int age)
	{ this.age = age;
	} 
	public int getaccountnumber()
	{ 
		return accountnumber;
		} 
	public void setaccountnumber(int accountnumber)
	{ this.accountnumber = accountnumber;
	} // <-- Missing } was here
	public class Details 
	{ public static void main(String[] args) 
	{ 
		bank b = new bank();
		b.setname("madhu"); 
		System.out.println(b.getname()); 
		b.setage(21);
		System.out.println(b.getage());
		b.setaccountnumber(610522);
		System.out.println(b.getaccountnumber());
		System.out.println("Account created successfully"); 
		} } 

	
//	String name;
//	String course;
//	int fees;
//	void display()
//	{
//		System.out.println(name +" "+course+" "+fees);
//	}
//
//	public static void main(String[] args) {
//		
//		Details d = new Details();
//		d.name = "shamee";
//		d.course ="java";
//		d.fees = 20000;
//		d.display();
	
	
	
		

	}



