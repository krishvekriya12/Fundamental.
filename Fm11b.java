public class Fm11b {

    public static void main(String args[]) 
    {
        int n = 5; 

        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n - i; j++) 
            {
                System.out.println(" ");
            }
            for (int k = 1; k <= i; k++) 
            {
                System.out.println("* ");
            }
            System.out.println();
        }
    }
};

