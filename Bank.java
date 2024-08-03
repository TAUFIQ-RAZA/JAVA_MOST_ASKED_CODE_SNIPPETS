/* Create a class Bank
-> achieve Encapsulation
-> Write a method to accept the bank account number, check if bank account
contains 10 digits, then display the Account holder name and bank name
-> write a method to accept the AadharCard number, 
check if AadharCard number contains extactly 10 digit or not
-> declare a properties for the class bank,
-> write a method to accept the bank_balance, bankname, accountholder name
1. if bank_balance <500, display please maintain bank balance
2. if bank_balance>500 and <10,000, add the 10% interest and display the total account balance to the user
3. if bank_balance>10,000 and <50000 add 20% interest and display the total account balance
-> if user wants to withdraw 1000rs from his account,
1. if user bankbalance is less then that then display the message
"Account balance is low, you can't withdraw amount"
2. if user bank balance is more then that then display the remaining balance
*/

class Bank{
	private String bankHolderName;
	private String bankName;
	private long accountNumber;
	private int bank_balance;
	private long adharCardNumber;
	
	public void setBankHolderName(String bankHolderName){
		this.bankHolderName=bankHolderName;
	}
	
	public String getBankHolderName(){
		return this.bankHolderName;
	}
	
	public void setBankName(String bankName){
		this.bankName=bankName;
	}
	
	public String getBankName(){
		return this.bankName;
	}
	
	public void setAccountNumber(long accountNumber){
		this.accountNumber=accountNumber;
	}
	
	public long getAccountNumber(){
		return this.accountNumber;
	}
	
	public void setBankBalance(int bank_balance){
		this.bank_balance=bank_balance;
	}
	
	public int getBankBalance(){
		return this.bank_balance;
	}
	
	public void setAdharCard(long adharCardNumber){
		this.adharCardNumber=adharCardNumber;
	}
	
	public long getAdharCard(){
		return this.adharCardNumber;
	}
	
	//method 1: Account Length
	public long accountNumberCheck(long accountNumber){
		int length=0;
		while(accountNumber>0){
			length++;
			accountNumber=accountNumber/10;
		}
		
		if(length==10){
			System.out.println("Account Holder Name:"+bankHolderName);
			System.out.println("Bank Name:"+bankName);
		}else{
			System.out.println("Account Number Not Matched");
		}
		return length;
	}
	
	//method 2:Adhar Card check
	public long adharNumberCheck(long adharCardNumber){
		int length=0;
		while(adharCardNumber>0){
			length++;
			adharCardNumber=adharCardNumber/10;
		}
		return length;
	}
	
	//method 3:bank balance check
	public void bankBalanceCheck(double bank_balance, String bankHolderName, String bankName){
		double GST=0;
		if(bank_balance < 5000){
			System.out.println("please maintain bank balance");
		}else if(bank_balance > 5000 && bank_balance < 10000){
			// adding 10% of GST
			GST= bank_balance * 0.10;
			bank_balance= bank_balance + GST;
			System.out.println("Bank Balance:"+bank_balance);
		}else if(bank_balance > 10000 && bank_balance < 20000){
			//adding 20% of GST
			GST= bank_balance * 0.20;
			bank_balance= bank_balance + GST;
			System.out.println("Bank Balance:"+bank_balance);
		}else{
			System.out.println("You Doesn't have an account");
		}
		
	}

	//method 4: withdrawl Amount
	
	public void withdrawAmount(int amount){
		if(this.bank_balance < amount ){
			System.out.println("Account balance is low, you can't withdraw amount");
			System.out.println("You Have remmaining amount:"+bank_balance);
		}else if(this.bank_balance >amount){
			bank_balance =bank_balance-amount;
			System.out.println("remaining balance:"+bank_balance);
		}
	}
	
	public static void main(String args[]){
		Bank bank = new Bank();
		
		bank.setBankHolderName("Taufiq Raza");
		String BankHolderName=bank.getBankHolderName();
		
		bank.setBankName("Karnataka Bank");
		String BankName=bank.getBankName();
		
		bank.setAccountNumber(6072581145L);
		long AccountNumber=bank.getAccountNumber();
		
		bank.setBankBalance(10000);
		int Balance= bank.getBankBalance();
		
		bank.setAdharCard(4912086466L);
		long AdharCard=bank.getAdharCard();
		
		//method 1
		System.out.println("======Method1=======");
		bank.accountNumberCheck(6541236548L);
		
		//method 2
		System.out.println("======Method2=======");
		long AdharLength=bank.adharNumberCheck(4912086466L);
		System.out.println("AdharLength:"+AdharLength);
		
		//method 3
		System.out.println("======Method3=======");
		bank.bankBalanceCheck(15000,"Raza","RBI");
		
		//method 4
		System.out.println("======Method4=======");
		bank.withdrawAmount(20000);
	}

		
}