import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SchoolManagementSystem {

    public static void checkFile(File f){
        try {
            FileReader read= new FileReader(f);
            System.out.println("file is found: ");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String file=sc.next();
        File f1=new File(file);

        checkFile(f1);
    }
}

/*
 * PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java SchoolManagementSystem
sample.txt
File Not Found
PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java SchoolManagementSystem
SalarySplit.java
file is found: 
 */