public class Audio implements RemoteControl{
    private int volume;
    
    //구현클래스에서 실체메소드를 작성할 때 public보다 낮은 접근제한자를 설정할 수 없다 
    
    //만약에 인터페이스의 추상메소드에 대응하는 실체메소드에 구현부를 작성하지 않으려면 class 자체를 abstract클래스로 만들어야한다 
    public void turnOn(){
        System.out.println("Audio를 켭니다");
        
    }
    public void turnOff(){
        System.out.println("Audio를 끕니다");
    }
    
    
    public void setVolume(int volume){
        if(volume>RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }
        else if(volume<RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }
        else{
            this.volume = volume;
        }
        System.out.println("현재 Audio볼륨: " + this.volume);
        
    }
}
    
