class A{
    A() {System.out.println("A 객체가 생성됨");}
    
    //인스턴스 멤버클래스
    class B{
        B(){System.out.println("B 객체가 생성됨");}
        int field1;
        // static int field2; 인스턴스 멤버클래스라서 static변수 선언 불가
        void method1(){}
    }
    
    
//정적 멤버 클래스    
    static class C{
        C(){System.out.println("객체C가 생성됨");}
        int field1;
        static int field2;
        void method1(){}
        static void method2(){}
    }
    
    void method(){
        class D{
            D() {System.out.println("D 객체가 생성됨");}
            int field1;
            //static변수, 메서드 선언 불가능
            void method1(){}
        }
        D d = new D();
        d.field1 = 3;
        d.method1();
    }
}
