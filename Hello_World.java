package our_coding;


public class Hello_World {
    public static void main(String[]args){
    
    System.out.println("Hello World");
   float a,b;
    a=13;
    b=6;
    float sum=a%b;
    
    float avg=sum/2;
    System.out.println("Modulus is "+sum);
    System.out.println("The Average is "+avg);
   
    String x="John";
    String y="Kirwa";
    System.out.println(x + " "+ y);
    int z=x.length();
    System.out.println("The length is "+ z);
    System.out.println(Math.max( a, b));
    System.out.println(Math.min(a, b));
    System.out.println(y.toUpperCase());
    
    
    int c = 1234; 
    int d = -1234; 
    String w="John";
    String str1 = Integer.toString(c); 
    String str2 = Integer.toString(d); 
    System.out.println(w + str1);  
    System.out.println("String str2 = " + str2); 

    
    
}
}