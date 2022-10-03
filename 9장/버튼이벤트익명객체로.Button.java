public class Button {
    OnClickListener listener;

    void SetOnClickListener(OnClickListener listener){
        this.listener = listener;
    }

    void touch(){
        listener.onClick();
    }
    
    //중첩인터페이스
    interface OnClickListener{
        void onClick();
    }
}
