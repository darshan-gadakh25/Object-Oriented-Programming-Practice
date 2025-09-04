public class GoodMorning {
    public static void main(String[] args) {
       

        System.out.print("Enter the hour (0-23): ");
        int hour = Integer.parseInt(args[0]);

        if (hour >= 5 && hour < 12) {
            System.out.println("Good Morning");
        } else {
            System.out.println("Not Morning");
        }
    }
}