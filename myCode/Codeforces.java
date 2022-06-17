import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codeforces{
    public static void main(String[] args){
        Map<String, String> hm=new HashMap<>();
        hm.put("purple","Power");
        hm.put("green","Time");
        hm.put("blue","Space");
        hm.put("orange","Soul");
        hm.put("red","Reality");
        hm.put("yellow","Mind");

        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b=6-a;
        //sc.nextLine();
        while(a>0){
            a--;
            String s=sc.nextLine();
            hm.remove(s);
        }
        System.out.println(b);
        for (Map.Entry<String,String> entry : hm.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
/*public class Codeforces{
    public static void main(String[] args) {

    }
    public static void intialCode (String[] args){
        String [] sa=new String[6];
        sa[0]="Power";
        sa[1]="Time";
        sa[2]="Space";
        sa[3]="Soul";
        sa[4]="Reality";
        sa[5]="Mind";
        boolean[] ba=new boolean[6];
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b=6-a;
        sc.nextLine();
        while(a>0){
            a--;
            String s=sc.nextLine();
            if(s.equals("purple")){
                ba[0]=true;
            }
            else if(s.equals("green")){
                ba[1]=true;
            }
            else if(s.equals("blue")){
                ba[2]=true;
            }
            else if(s.equals("orange")){
                ba[3]=true;
            }
            else if(s.equals("red")){
                ba[4]=true;
            }
            else if(s.equals("yellow")){
                ba[5]=true;
            }
        }
        System.out.println(b);
        for(int i=0;i<6;i++){
            if(!ba[i]){
                System.out.println(sa[i]);
            }
        }
    }
}



class InfinityStones {
    String name;
    boolean isPresent;

    public InfinityStones (){


    }
    public InfinityStones (String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public String getName() {
        return name;
    }
    public boolean getIsPresent(){
        return isPresent;
    }
}


