public class multiple_catch_example {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1+value2;
            System.out.println(result);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("오류가 발생하였습니다");
        }finally{
            System.out.println("다시 실행하세요 ");

        }
    }
    
}
