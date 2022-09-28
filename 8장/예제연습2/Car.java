public class Car{
    // Tire frontTire = new HanKookTire();
    // Tire backTire = new KumhoTire();
    Tire[] tires = {
        new HanKookTire(),
        new HanKookTire()
    };
    //타이어필드를 인터페이스 배열로 관리해줘도 된다 
    
  
    
    
    public void run(){
        // frontTire.roll();
        // backTire.roll();
        for(Tire tire : tires){
            tire.roll();
        }
    }
}
    
