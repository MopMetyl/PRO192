import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so");
        
        try {
            int n = sc.nextInt();
            System.out.println("So ban vua nhap la: " + n);
            int error = n / 0;
        } catch (ArithmeticException ae) {
            System.out.println("Khong chia het cho 0");
        }
        
        System.out.println("Ket thuc chuong trinh");
    }
}
