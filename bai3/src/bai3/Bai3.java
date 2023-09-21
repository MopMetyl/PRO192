/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diemchuyencan;
        double diemgiuaky;
        double diemcuoiky;
        double diemhocphan;
        diemchuyencan = sc.nextDouble();
        diemgiuaky = sc.nextDouble();
        diemcuoiky = sc.nextDouble();
        System.out.println("diem hoc phan:" +(diemchuyencan*0.1 + diemgiuaky*0.2 + diemcuoiky*0.7));
        
        
    }
    
}
