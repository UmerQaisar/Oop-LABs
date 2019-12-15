

public class Account
{
    String accountno;
   
     long accountbalance;
     String accountname;
     
    public Account(String accountno,  long accountbalance, String accountname ){
        
        this.accountno=accountno;
        this.accountbalance=accountbalance;
        this.accountname=accountname;
        
    }
    
    
        public long deposit(long depositamount){
            accountbalance=accountbalance+ depositamount;
            return accountbalance;
        }
        
        public long withdraw(long withdrawamount){
            accountbalance= accountbalance - withdrawamount;
            return accountbalance;
        }
        
        
        
        
        
        public void display(){
            System.out.println("account no: " +accountno);
            System.out.println("account name: " + accountname);
            System.out.println("account balance: " + accountbalance);
           
        }
        
    
    
        
}
