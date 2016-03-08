import java.lang.System;
import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args){
        Scanner bucky = new Scanner(System.in);
        System.out.println("Hey, whats your name? ");
        System.out.println(bucky.nextLine());
    }
}