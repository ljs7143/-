

//why is there a compile error? that is question.

public class Chatting {
    void startChat(String chatID){
        // String nickName = null;
        //아래와 같이 final 특성을 가지게 강제하면 컴파일 오류가 발생하지 않는다
        final String nickName = chatID;
        Chat chat = new Chat(){
            @Override
            public void start(){
                while(true){
                    String inputData = "안녕하세요";
                    String message = "["+nickName +"] " + inputData;
                    sendMessage(message);
                }

            }
        };
        chat.start();
    } 
    class Chat{
        void start(){}
        void sendMessage(String message){}
    }
    
}

//local variables in inner class must be final. 
