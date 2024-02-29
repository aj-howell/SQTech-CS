package Week_One; //file structure ignore for now

public class wk1 //class
{
    //global variables 
    String week = "week 1";

    //main 
    public static void main(String[] args) {
     
        //local variables
        int a=10;
        int b=10;

        addNumbers(a, b); // how to use a function
    }

    //functions
    public static void addNumbers(int num1, int num2) 
    /*general function structure: access type name (parameters){}*/
    {
        System.out.println("wrong ans: "+num1+num2); 
        
        int sum=num1+num2;
        System.out.println("right answer: "+sum);
       
        return; // needed to break out of void but is optional
    }
}