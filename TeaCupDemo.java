import java.util.*;
class TeaCup {
    private String teaType;
    private static int totalCups;
    
    TeaCup (String teaType){
        this.teaType=teaType;
        this.totalCups++;
    }
    
    String getTeatype(){
        return teaType;
    }
    
    static void showTotalCups(){
       System.out.println("Total Cups made: "+totalCups);
    }
}
class TeaCupDemo {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int cupNumber=1;
     while (true) {
            System.out.print("Do you want to add a tea cup yes or no: ");
            String option = sc.nextLine().toLowerCase();
            if (option.equals("no")) {
                break; 
            }

            System.out.print("Cup" + cupNumber + ": tesType=");
            String teaType = sc.nextLine();

            TeaCup cup = new TeaCup(teaType);
            System.out.println("Cup" + cupNumber + " type: " + cup.getTeatype());

            cupNumber++;
        }
           TeaCup.showTotalCups(); 
      
      
    }
}

/*

OUTPUT

PS F:\java\OOP Module\Assignment 2> javac TeaCupDemo.java
PS F:\java\OOP Module\Assignment 2> java TeaCupDemo
Do you want to add a tea cup yes or no: yes
Cup1: tesType=Masala Tea
Cup1 type: Masala Tea
Do you want to add a tea cup yes or no: yes
Cup2: tesType=Green Tea
Cup2 type: Green Tea
Do you want to add a tea cup yes or no: ginger Tea
Cup3: tesType=Ginger Tea
Cup3 type: Ginger Tea
Do you want to add a tea cup yes or no: no
Total Cups made: 3