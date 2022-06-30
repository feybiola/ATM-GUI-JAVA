package view;




public class Account {
    
    private String accountNumber;
    private String accountMolder;
    private String opanDate;
    private double balance;
    
    public Account (String accNumber, String accMolder,String date, double accBalance) {
        this.accountNumber = accNumber;
        this.accountMolder = accMolder;
        this.opanDate = date;
        this.balance = accBalance;
}
    public void withdraw(double m){
        this.balance = this.balance - m;
        
    }
    public void deposit(double amount){
        this.balance = this.balance + amount;
    }    
    
    public void transfer (Account a,double amount){
        this.withdraw(amount);
        a.deposit(amount);
    }
    public String getAccountMolder(){
        return this.accountMolder;
    }
    public String getOpenDate(){
        return this.opanDate;
    }
    public double getBalance(){
        return this.balance;
    }
    
    @Override
    public String toString(){
        return this.accountNumber;
        
    }

}
