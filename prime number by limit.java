import java.util.*;
public class primenumsequnce {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your limit : ");
    int limit=sc.nextInt();
       int count=0;
       System.out.print("Your prime number sequance is like :");
       for(int i=1;i<=limit;i++)
       {
           for(int j=1;j<=i;j++)
           {
               if(i%j==0)
               {
                   count++;
                }
            }
            if(count==2)
            {
                System.out.print(" "+i);
            }
            
            count=0;
       } 
    }
}
