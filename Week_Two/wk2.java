package Week_Two;

public class wk2 {
    public static void main(String[] args) {
        //loops 

        //for-loop
        for(int i=0; i<5; i++)
        {
            System.out.println("Hello "+i);
        }
            System.out.println();
        
        //for-each
        int[] array = {1,2,3,4,5};
        for(int n : array)
        {
            System.out.println(n);
        }

            System.out.println();

        // while
        int i=0;
        while(i<3)
        {
            System.out.println("AJ: "+i);
            //if(i==1) break; can stop the loop at a specific point 
            i++;
        }
    }
}
