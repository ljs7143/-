//멀티 catch예제

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1+value2;
            System.out.println(result);
            
        }catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("try again");
            // TODO: handle exception
        }catch(Exception e){
            System.out.println("CANNOT FIND OUT EXCEPTION");

        }finally{
            System.out.println("BE ambitious!");


        }
    }
}
