package Somanna;

import java.util.Scanner;

public class printArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ar[]=new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i]=scan.nextInt();
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
        scan.close();
    }
}
