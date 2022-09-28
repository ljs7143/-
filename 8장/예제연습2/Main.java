
public class Main
{
	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.run();
		mycar.frontTire = new KumhoTire();
		mycar.backTire = new HanKookTire();
		mycar.run();
	}
}
