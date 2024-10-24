public class Nomor1{
    public static void main(String[] args){
    import java.util.Scanner;
        int honor = 10000;
        int Honor = 15000;
        int minLmb = 16;
        Scanner scanner = new Scanner(System.in)
         System.out.print("Total jam lembur  :  ");
         int totalJamLembur = input.nextInt();

          if (totalJamLembur <= 16){
            honor = honor*totalJamLembur;
            System.out.println(honor);
        }
        else if (totalJamLembur >= 16){
            honor = honor*minLmb+totalJamLembur-minLmb;
            System.out.println(honor);
        }
 
    }
}
