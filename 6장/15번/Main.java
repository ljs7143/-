public class Main{
    public static void main(String[] args){
        Member member = new Member();
        boolean result = member.login("hong", "12345");
        if(result = true){
            System.out.println("로그인되었습니다");
            member.logout("hong");
        }
        else{
            System.out.println("다시 입력해주시기 바랍니다");
        }
    }
}
