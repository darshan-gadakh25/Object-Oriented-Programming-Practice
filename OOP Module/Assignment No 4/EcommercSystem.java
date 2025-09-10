import java.util.Scanner;

public class EcommercSystem {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();

        StringBuilder sb=new StringBuilder(str);

        System.out.println("Reverse String");
        System.out.println(sb.reverse());
    }
}

/*
 * PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java EcommercSystem
Enter the string: 
INV2025
Reverse String
5202VNI
PS F:\j
 */