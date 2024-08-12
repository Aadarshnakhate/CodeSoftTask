package atminterface;
import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.exit;

public class Atm extends selectMethod {

   public int count=0;




    Scanner sc= new Scanner (System.in);

    public void checkpin(){
        System.out.println("Enter Your PIN ");

        if(Pin ==sc.nextInt()){
            System.out.print("Allow For Enterance");
            select();
        }
        else {
            System.out.println("Invalid Pin Plese Enter Again !");
            count++;
            if(count==3){
                System.out.println("Your Enter Invalid Pin Meri Time");

            }
            else
            {
               checkpin();
            }
        }

    }
    public  void select() {
        int A,B,C;
        A=1;
        B=2;
        C=3;

        System.out.println();
        System.out.println(A+" Balance Enquiry");
        System.out.println(B+" Deposit");
        System.out.println(C+" Credit");


      int inp= sc.nextInt();
        if(inp==A)
        {
            super.balance() ;
        }
        else if(inp==B){
         super.Dabit();
    }
        else if(inp==C){
            super.credit();
        }

        else {
            System.out.println("Pls Enter valid Input");
            exit(0);
        }

    }
}
