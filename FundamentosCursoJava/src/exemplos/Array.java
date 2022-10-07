package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double a[] = new double[6];
        
        a[0] = 5.0;
        a[1] = 4.0;
        a[2] = 3.0;
        a[3] = 52.0;
        a[4] = 5.0;
        a[5] = 7.0;
        
        //ou 
        
        double b[] = {1,2,3,4,5,6};
        
        

        
        sc.close();
    }

}
