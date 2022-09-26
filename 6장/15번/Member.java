public class Member{
   
    
    public static boolean login(String id, String password){
        if(id.equals("hong")&&password.equals("12345")){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void logout(String id){
        if(id.equals("hong")){
            System.out.println("로그아웃 되었습니다");
        }
    }
}
