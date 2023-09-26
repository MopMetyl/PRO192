import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so");
        
        try {
            int n = sc.nextInt();
            System.out.println("So ban nhap la: " + n);
        } catch (InputMismatchException ime) { 
            System.out.println("Khong hop le. Hay nhap so");
        }
        System.out.println("Ket thuc chuong trinh");
    }
}
