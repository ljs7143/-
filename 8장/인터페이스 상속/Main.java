public class Main{
	public static void main(String[] args) {
		ImplementationC imp = new ImplementationC();
		
		InterfaceA ia = imp;
		ia.methodA();
		System.out.println();
		//A메소드만 실행가능
		
		InterfaceB ib = imp;
		ib.methodB();
		System.out.println();
		//B메소드만 실행가능 
		
		InterfaceC ic = imp;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		//C는 A,B 상속받아서 A,B,C 메소드 호출가능 
	}
}
