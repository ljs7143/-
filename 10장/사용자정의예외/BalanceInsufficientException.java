public class BalanceInsufficientException extends Exception {
    public BalanceInsufficientException(){ }
    //오류메시지를 출력하기 위한 인자 받음
    public BalanceInsufficientException(String message){
        super(message);
    }
}

