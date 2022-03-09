package hesap;
import java.util.Scanner;
public class CinZodyagiHesaplama {
    public static void main(String args[]){
        int dogumyili;
        Scanner input=new Scanner(System.in);
        System.out.println("Doğum yılınızı girin:");
        dogumyili= input.nextInt();
        int kalan=dogumyili%12;
        switch (kalan){
            case 0:
                System.out.println("Çin zoydağı burcunuz:Maymun");
             break;
            case 1:
                System.out.println("Çin zoydağı burcunuz:horoz");
                break;
            case 2:
                System.out.println("Çin zoydağı burcunuz:köpek");
                break;
            case 3:
                System.out.println("Çin zoydağı burcunuz:domuz");
                break;
            case 4:
                System.out.println("Çin zoydağı burcunuz:fare");
                break;
            case 5:
                System.out.println("Çin zoydağı burcunuz:öküz");
                break;
            case 6:
                System.out.println("Çin zoydağı burcunuz:kaplan");
                break;
            case 7:
                System.out.println("Çin zoydağı burcunuz:tavşan");
                break;
            case 8:
                System.out.println("Çin zoydağı burcunuz:ejderha");
                break;
            case 9:
                System.out.println("Çin zoydağı burcunuz:yılan");
                break;
            case 10:
                System.out.println("Çin zoydağı burcunuz:at");
                break;
            case 11:
                System.out.println("Çin zoydağı burcunuz:koyun");
                break;

            default:System.out.println("geçersiz giriş yaptınız");
        }


    }
}
