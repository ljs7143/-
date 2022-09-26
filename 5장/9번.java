/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main{
  public static void main (String[]args){
    
    int studentnum = 0;
    int[] scorearray = null;
    boolean run = true;
    Scanner sc = new Scanner(System.in);
    while(run){
        System.out.println("-----------------------------------------------");
        System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
        System.out.println("-----------------------------------------------");
        System.out.print("선택>:");
        int selectnum =sc.nextInt();
        
        if(selectnum == 1){
            System.out.print("학생수>");
            studentnum = sc.nextInt();
            scorearray = new int[studentnum];
            System.out.println("------------------------------------------------");
            
        }else if(selectnum ==2){
            for(int i=0; i<scorearray.length; i++){
                System.out.print("scores["+i+"]>");
                int realscore = sc.nextInt();
                scorearray[i] = realscore;
            }
            System.out.println("---------------------");
        }else if(selectnum==3){
            for(int i=0; i<scorearray.length; i++){
                System.out.println("scores["+i+"]:"+scorearray[i]);
            }
            System.out.println("-------------------");
        }else if(selectnum==4){
            int max =0;
            int sum =0;
            for(int i=0; i<scorearray.length; i++){
                if(scorearray[i]>max){
                    max = scorearray[i];
                }
                sum = sum+ scorearray[i];
            }
            double avg = sum/scorearray.length;
            System.out.println("최고점수:"+max);
            System.out.println("평균점수:"+avg);
            
            
            
        }else if(selectnum == 5){
            System.out.println("프로그램종료");
            break;
        }
 
    }
   
  }
}
