import java.util.*;

public class Count{
    static int sz = 26;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        while(a>0){
            a--;
            String s=sc.nextLine();
            int m=0, n=s.length();

            boolean[] ba=new boolean[26];

            for(int i=0;i<s.length();i++){
                if(ba[s.charAt(i)-'a']){
                    m+=2;
                    for(int j = 0; j < sz; j++) ba[j] = false;
                }
                else{
                    ba[s.charAt(i)-'a']=true;
                }
            }
            System.out.println(n-m);
        }
    }

    //first iteration
//   i =0, s.char - a, ba[0]=false => true, m=0
//   i=1  s.char -a, ba[0]= true => false,  m=2
}// i=2 s.char -b , ba[1]= false =>true, m=2
// i=3 s.char -c, ba[2]= false =>true, m=2
// i=4 s.char -b, ba[1]= true =>false, ba[2]=false , m=4
//i=5 s.char -d, ba[3]= false => true, m=4
// i =6 s.char -c ba[2] = false => true, m=4

