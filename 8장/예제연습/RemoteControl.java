interface RemoteControl{
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
    
    //public abstract생략가능하며, 리턴타입, 매개변수만을 알려주고 구체적인 메소드실현부는 작성하지 않는다
    public abstract void turnOn();
    void turnOff();
    void setVolume(int volume);
    //디폴트 메소드는 구체적인 구현부까지 작성해준다
    default void setMute(boolean mute){
        if(mute ==true){
            System.out.println("무음처리합니다");
        }
        else{
            System.out.println("무음해제합니다");
        }
        
    }
    static void changeBattery(){
        System.out.println("건전지 교환합니다");
        
    }
}
