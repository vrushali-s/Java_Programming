import java.util.Scanner;

class program5_4
{
    public static void main(String args[])
    {
        int iNum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNum = scanner.nextInt();

        Divisibility divisibility = new Divisibility();
        divisibility.checkMultipleDivisibility(iNum);
    }
}

class Divisibility
{
    void checkMultipleDivisibility(int iValue)
    {
        if(((iValue % 5) == 0) && ((iValue % 3) == 0))
        {
            System.out.println("Divisible by both 3 and 5");
        }
        else if((iValue % 5) == 0)
        {
            System.out.println("Divisible by 5 only");
        }
        else if((iValue % 3) == 0)
        {
            System.out.println("Divisible by 3 only");
        }
        else
        {
            System.out.println("Not divisible by either");
        }
    }
}