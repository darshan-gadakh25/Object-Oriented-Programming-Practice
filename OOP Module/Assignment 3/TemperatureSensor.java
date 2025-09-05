import java.util.Scanner;

public class TemperatureSensor {
    private int temparature;

    public int getTemparature() {
        return temparature;
    }

    public void setTemparature(int temparature) {
       if(temparature > 0 && temparature < 100){
         this.temparature = temparature;
         System.out.println("The temparature: "+this.temparature);
       }
       else{
        System.out.println("The temparature are not in range.");
       }
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        TemperatureSensor ts= new TemperatureSensor();
        System.out.println("Enter Temparature: ");
        int temp=sc.nextInt();
        ts.setTemparature(temp);

        ts.getTemparature();
    }
    
}
