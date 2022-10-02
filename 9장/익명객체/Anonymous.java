public class Anonymous{
    //필드값 자체에 익명자식 객체를 생성해서 대입 
    Person field = new Person(){
        //익명자식 객체가 지니고 있는 method 
        void work(){
            System.out.println("출근합니다");
        }
        @Override
        //부모클래스를 재정의함 
        void wake(){
            System.out.println("6시에 일어납니다");
            work();
            
        }
    };
    //;를 통해 익명자식객체를 생성했다는 것을 알 수 있음 
    
    void method1(){
        //메소드안에 로컬 변수로 익명자식객체 선언 
        Person localVar = new Person(){
            void walk(){
                System.out.println("산책합니다");
            }
            @Override
            void wake(){
                System.out.println("7시에 일어납니다");
                walk();
            }
        };
        
        localVar.wake();
    }
    void method2(Person person){
        person.wake();
    }
}
