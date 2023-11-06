public class prime_num {
    static void prime(int n)
    {
        if(n<=1)
            return;
        prime(n-1);
        int f=1;
        for(int i=2;i*i<=n;i++){
            if (n%i==0){
                f=0;
                break;
            }
        }
        if(f==1)
            System.out.print(n+" ");
    }
    public static void main(String[] args) {
        prime(10);
    }
}