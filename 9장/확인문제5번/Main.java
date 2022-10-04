
public class Main {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();
        //익명객체필드사용 
        anony.field.run();
        //익명객체 로컬변수
        anony.method1();
        //익명객체 매개값
        anony.method2(
            new Vehicle() {
                @Override
                public void run(){
                    System.out.println("트럭이 달립니다");
                }
            }
        );
    }
}
