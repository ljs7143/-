//메소드를 호출한 곳으로 예외를 떠넘길 수 있음. 이때 사용하는 keyword가 throws 
//메소드 선언부 끝에 작성함 
//throws 키워드가 붙어있는 메소드는 반드시 try블록 내에서 호출해야한다 
public class ThrowsExample{
    public static void main(String[] args) {
        try{
            findClass();

        }catch(ClassNotFoundException e){
            System.out.println("클래스가 존재하지 않는다 ");
        }
    }
//메소드를 호출한 곳으로 예외를 떠넘김 
    public static void findClass() throws  ClassNotFoundException{
        Class clazz = Class.forName("Java.lanv.Stirng");
    }

    
}
