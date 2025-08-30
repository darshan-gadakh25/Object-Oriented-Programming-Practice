import java.util.*;
import java.util.*;
class Mobile {
    String model;
    static int totalMobile;
    
    Mobile(String model){
        this.model=model;
        this.totalMobile++;
    }
    
    String getModel(){
        return model;
    }
    
    static void showTotalMobiles(){
        System.out.println("Total mobiles in stock: "+totalMobile);
    }


public static void main(String [] args){
        Mobile m1=new Mobile(" Samsung Galaxy M32");
        Mobile m2=new Mobile("Mobile2: model = Redmi Note 12");
        
      System.out.println("Mobile1: model = "+m1.getModel());
        System.out.println("Mobile2: model = "+m2.getModel());
        
      showTotalMobiles();
        
    
    }
}
/*

OUTPUT

Mobile1: model =  Samsung Galaxy M32
Mobile2: model = Mobile2: model = Redmi Note 12
Total mobiles in stock: 2

*/