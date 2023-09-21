/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;
 import java.util.Scanner;

/**
 *
 * @author DELL
 */

 
public class Bai2 {
    public static void main(String[] args) {  
        String[] danhSachTen = new String[5];
        danhSachTen[0] = "tien";
        danhSachTen[1] = "bach";
        danhSachTen[2] = "khai";
        danhSachTen[3] = "toan";
        danhSachTen[4] = "khang";
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tebn: ");
        String tenNhapVao = sc.nextLine();

        boolean tonTai = false;
        for (String ten : danhSachTen) {
            if (ten.equalsIgnoreCase(tenNhapVao)) {
                tonTai = true;
                break;
            }
        }

    
        if (tonTai) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

    }
    
}
