package oopstask;
abstract class bankaccount
{
	double balance = 0;
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
}
class savingaccount extends bankaccount
{
	void deposit(double amount)
	{
		balance = balance + amount; 
		System.out.println(amount);
		System.out.println(balance);
		}
		
	@Override
	void withdraw(double amount) 
	{
		balance = balance - amount;
		System.out.println(amount);
		System.out.println(balance);
	}
}
class checkingaccount extends bankaccount
{
	void deposit(double amount)
	{
		balance = balance + amount;
		System.out.println(amount);
		System.out.println(balance);
				
	}

	@Override
	void withdraw(double amount) {
		balance = balance - amount;
		System.out.println(amount);
		System.out.println(balance);
		
	}
}
		


 class Mainbank {
	

	public static void main(String[] args) {
		savingaccount s = new savingaccount();
		s.deposit(3000);
		s.withdraw(500);
		System.out.println();
		checkingaccount c = new checkingaccount();
		c.deposit(5000);
		c.withdraw(2000);
		System.out.println();

	}

 }
