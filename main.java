public class main{
    
    public static class Fibonacci
    {
        public static int of(int n)
        {
            if( n <= 2 ) return 1;
            else  return of(n-1)+of(n-2);   
        } 
    }
    public static void main(String[] args) {
        int i = 1;
        while(Fibonacci.of(i)<=200)
        {
            System.out.println(Fibonacci.of(i)+" ");
            i++;
        }
    }
    

}