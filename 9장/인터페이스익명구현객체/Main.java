public class Main{
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		anony.field.turnOn();
		
		anony.method1();
		
		anony.method2(
		    new RemoteControl(){
		        //결과에서 SmartTv를 켭니다만 나오는 이유는
		        //method2에서 turnOn()만 선언 되었기 때문에 여기서도 똑같이 
		        //turnOn에 해당하는 내용만 출력됨
		          @Override
		          public void turnOn(){
		              System.out.println("SmartTv를 켭니다");
		              
		          }
		          @Override
		          public void turnOff(){
		              System.out.println("SmartTv를 끕니다");
		              
		          }
		    }
		    );
	}
}
