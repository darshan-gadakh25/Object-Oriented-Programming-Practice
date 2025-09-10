import java.util.Scanner;

public class ExamScore {
    
    public static void getMarks(int [] arr, int n){
        try{
            if (arr.length < n){
                System.out.println("The Marks of "+n+ " is "+arr[n]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index accessed");
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Student Marks enter in list: ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter the marks of student: ");
        for(int a : arr){
            arr[a]=sc.nextInt();
        }

        System.out.println("Enter the no to geet that student Marks");
        int n=sc.nextInt();

        getMarks(arr, n);

    }
}

/*
 * PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java ExamScore
How many Student Marks enter in list: 
3
Enter the marks of student: 
78 90 85
Enter the no to geet that student Marks
5
Invalid index accessed
 * 
 */