

public class LoginExample {
    public static void main(String[] args) {
        try{
            login("White", "12345");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            login("Blue", "54321");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void login(String id, String password) throws WrongPasswordException, NotExistIDException{

        if(!id.equals("Blue")){
            throw new NotExistIDException("아이디가 일치하지 않습니다");
        }
        if(!id.equals("12345")){
            throw new WrongPasswordException("비밀번호가 틀립니다");
        }

    }
    
}
