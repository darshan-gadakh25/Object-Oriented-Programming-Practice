import java.util.Scanner;

public class Employee {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
            this.age = age;
    }


    public static void main(String[] args) {
        Employee e1=new Employee();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age=sc.nextInt();

        
        if(age >= 18){
            e1.setAge(age);
            System.out.println("Empleyee Age: "+e1.getAge());
        }
        else{
            System.out.println("Invalid Age");
        }

    }
    
}
