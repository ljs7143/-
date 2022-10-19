//리소스 객체는 java.lang.AutoCloseable 인터페이스를 구현하고 있어야한다 
public class FileInputStream implements AutoCloseable{
    private String file;

    public FileInputStream(String file){
        this.file = file;
    }
    public void read(){
        System.out.println("을 읽습니다");
    }
    //close메소드를 오버라이딩함 
    @Override
    public void close() throws Exception{
        System.out.println("을 닫습니다 ");
    }
}
