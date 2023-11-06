public class recursion {

    static void even(int n)
    {
        if (n<0)
            return;
        if (n%2!=0)
            n--;
        even(n-2);
        System.out.print(n+" ");

    } 
    public static void main(String[] args) {
        even(50);
    }
}