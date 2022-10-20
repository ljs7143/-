public class Account {
    private long balance;
    public Account(){}
    public long getBalance(){
        return balance;
    }
    public void deposit(int money){
        balance = balance + money;
    }
    //사용자 정의 예외 떠넘기기 
    //대부분 자신을 호출한 곳에서 예외를 처리하도록 throws 키워드로 예외를 떠넘긴다 
    public void withdraw(int money) throws BalanceInsufficientException{
    
        if(balance < money){
            throw new BalanceInsufficientException("잔고부족:"+(money-balance)+" 모자람");
        }
        balance = balance - money;
    }
}
