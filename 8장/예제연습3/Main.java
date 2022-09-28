public class Main{
    public static void main(String[] args){
        Driver driver = new Driver();
        //Driver 인스턴스 생성
        Bus bus = new Bus();
        //Bus 인스턴스 생성
        Taxi taxi = new Taxi();
        //Taxi 인스턴스 생성
        
        driver.drive(bus); 
        //버스가 달립니다 출력
        // Vehicle vehicle = bus; 자동타입변환이 이루어짐 
        driver.drive(taxi);
        //택시가 달립니다 출력
        //Vehicle Vehicle = taxi; 자동타입변환이 이루어짐 
        
        //*다양한 구현객체를 매개변수로 넣어서 다형성 극대화*
        
        //하지만 구현객체가 인터페이스 타입으로 자동 변환되면
        //인터페이스에 선언된 메소드만 사용가능하다는 단점이 생김 
        
        Vehicle vehicle = new Bus();
        vehicle.run();
        //버스가 달립니다
        
        Bus bus1 = (Bus) vehicle;
        bus1.run();
        bus1.checkFare();
    }
}
