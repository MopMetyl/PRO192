/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        a = sc.nextInt();
        b  =sc.nextInt();
        System.out.println("Tong:" + (a + b));
        System.out.println("Hieu:" + (a - b));
        System.out.println("Tich:" + (a*b));
        System.out.println("Thuong:" + (a / b));
    }
    
}
