public class TryCatchFinallyExample {
    public static void main(String[] args) {
        String[] strArray = {"10","2a"};
        int value = 0;

        for(int i =0; i<=2; i++){
            try{
                value = Integer.parseInt(strArray[i]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("인덱스 초과");
            }catch(NumberFormatException e){
                System.out.println("숫자 변환X");
            }finally{
                System.out.println(value);
            }
        }
    }
}
//실행결과
//10 > 숫자변환X > 10 > 인덱스 초과 > 10
//과정 : value에 10저장 > 10출력 > value에 index[1] 저장 불가 > 숫자 변환X 출력 > value는 10임으로 10출력 > index[2]오류 > 인덱스초과 출력 > value는 10임으로 10출력
