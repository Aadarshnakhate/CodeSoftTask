package atminterface;



import java.util.*;
import java.util.Random;


public class selectMethod {
public double Balance=56435.254;;
    public int Pin=2055;
    public int otp=0;


    Scanner Kb = new Scanner(System.in);
   public void balance(){
        System.out.println("Available Balance "+Balance);
    }

  public void Dabit(){
        System.out.println("Enter Amount ");
       double Amount= Kb.nextDouble();
       Balance=Balance-Amount;
      System.out.println(Balance);
    }
    public void credit(){
        System.out.println("Plese Enter Amount ");
        double crd= Kb.nextDouble();
        Balance=Balance+crd;
        System.out.println(Balance);

    }






}
