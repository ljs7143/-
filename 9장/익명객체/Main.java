public class Main {
    public static void main(String[] args){
        Anonymous anony = new Anonymous();
        anony.field.wake();
        
        anony.method1();
        
        //익명객체를 메소드의 매개값으로 넣어주기 
        anony.method2(
            new Person(){
                void study(){
                System.out.println("공부합니다.");
                }
                @Override
                void wake(){
                System.out.println("8시에 일어납니다");
                study();
                }
            }
            );
    }
}
