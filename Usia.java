/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan11;
import java.util.Scanner;
        
/**
 *
 * @author ASUS
 */
public class Usia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Masukkan nilai awal usia = ");
        int a = input.nextInt();
        System.out.println("Masukkan usia = ");
        int i, n;
        n =input.nextInt();
        for(i=a; i<=n; i++)
            if (i >=1 && i<=20){
                System.out.println(i+ "Remaja");
            }
            else if( i>=21 && i<=40){
                System.out.println( i+ "Dewasa");
            }
            else if( i>=41 && i<=60){
                System.out.println( i+ "Orang Tua");
            }
            else if( i>=61 && i<=80 ){
                System.out.println( i+ "Lansia");
            }
            else if(i>=81 && i<=100){
                System.out.println( i+ "Sepuh");   
            }else{
                System.out.println("Immortal");   
            }
    }
    
}
