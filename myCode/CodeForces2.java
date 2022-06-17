import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodeForces2 {
   // import java.util.*;

    public class Codeforces{
        public static void main(String[] args){
            HashMap<String, String> hm=new HashMap<>();
            hm.put("purple","Power");
            hm.put("green","Time");
            hm.put("blue","Space");
            hm.put("orange","Soul");
            hm.put("red","Reality");
            hm.put("yellow","Mind");

            Scanner sc=new Scanner(System.in);
            int a = sc.nextInt();
            if(a==0){
                System.out.println(6);
                for (Map.Entry<String,String> entry : hm.entrySet()){
                    System.out.println(entry.getValue());
                }
            }
            else{
                System.out.println(6-a);
                sc.nextLine();
                while(a>0){
                    a--;
                    String s=sc.nextLine();
                    hm.remove(s);
                }

                for (Map.Entry<String,String> entry : hm.entrySet()){
                    System.out.println(entry.getValue());
                }
            }
        }
    }
}
