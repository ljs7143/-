public class Account{
    //계좌번호
    private String ano;
    //계좌주
    private String owner;
    //잔액
    private int balance;
    
    public Account(String ano, String owner, int balance){
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }
    //계좌번호를 알려줌
    public String getAno() {return ano;}
    //계좌번호 생성 
    public void setAno(String ano){this.ano = ano;}
    //계좌주 알려줌
    public String getOwner(){return owner;}
    //계좌주 설정
    public void setOwner(String owner){this.owner = owner;}
    //잔액 알려줌
    public int getBalance() {return balance;}
    public void setBalance(int balance){this.balance=balance;}
}
