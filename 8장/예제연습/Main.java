public class Main{
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
		rc.turnOn();
		//익명구현객체구현. interface메소드가 재사용될 필요없을 떄 일회용으로 사용하기 위함.
		//모든 메소드의 구현부를 정의해야함.
		RemoteControl test = new RemoteControl(){
		    public void turnOn(){
		        System.out.println("익명구현객체");
		    }
		    public void turnOff(){
		        System.out.println("익명구현객체2");
		    }
		    public void setVolume(int volume){
		        System.out.println("3");
		    }
		};
		test.turnOn();
		
	}
}
