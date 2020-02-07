
package our_coding;


public class Diamond {
    
    public static void main(String[]args){
       for(int i=0;i<=10;i++)
    {
        if(i<=5)
        {
        for(int k=1;k<=5-i;k++)
        {
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++)
        {
            System.out.print(" *");
        }
        }
        if(i>5)
        {
        for(int k=0;k<=i-6;k++)
        {
            System.out.print(" ");
        }
        for(int j=0;j<=10-i;j++)
        {
            System.out.print(" *");
        }
        }
        System.out.println();
        }
               
    }
            
}
    
    

