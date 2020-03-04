
import java.util.*;
 class UserIp{
    static int ipValid(String a[]){
        int s = 0;
        for( int i = 0; i < a.length; i++ ){
            if( Integer.valueOf(a[i]) > 0 && Integer.valueOf(a[i]) < 255 ){
             s ++;
            }
            else{
                s = 0;
                break;
            }
        }
        if( s== a.length)
        return 1;
        else
        return (-1);
    }
}
public class ipmain{
    public static void main(String [] args){
        int v=0;
        System.out.println("Enter IP address");
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        String[] ar = s.split("\\.");
        v = UserIp.ipValid(ar);
        if(v==1)
           System.out.println("Valid");
        else if(v==-1)
           System.out.println("Invalid");
    }
}
