import java.util.Scanner;

class program5_1
{
    public static void main(String args[])
    {
        int iValue1 = 0, iValue2 = 0, iValue3 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number : ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = scanner.nextInt();

        System.out.println("Enter third number : ");
        iValue3 = scanner.nextInt();

        FindGreater findgreater = new FindGreater();
        findgreater.findGreatest(iValue1, iValue2, iValue3);
    }
}

class FindGreater
{
    void findGreatest(int iNo1, int iNo2, int iNo3)
    {
        if((iNo1 > iNo2) && (iNo1 > iNo3))
        {
            System.out.println(iNo1 + " is greatest.");
        }
        else if((iNo2 >= iNo1 ) && (iNo2 >= iNo3 ))
        {
            System.out.println(iNo2 + " is greatest.");
        }
        else if((iNo3 >= iNo1 ) && (iNo3 >= iNo2 ))
        {
            System.out.println(iNo3 + " is greatest.");
        }
    }
}