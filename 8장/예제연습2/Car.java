public class Car{
    Tire frontTire = new HanKookTire();
    Tire backTire = new KumhoTire();
    
    public void run(){
        frontTire.roll();
        backTire.roll();
    }
}
    
    
    
