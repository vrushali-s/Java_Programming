import java.util.Scanner;

class Display
{
    void rangeDisplayEven(int iStart, int iEnd)
    {
        int iCnt = 0;

        if(iStart > iEnd)
        {
            System.out.println("Invalid Range");
            return;
        }

        for(iCnt = iStart; iCnt <= iEnd; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                System.out.print(iCnt + "   ");
            }
        }
    }
}

class program11_2
{
    public static void main(String[] args) 
    {
        int iValue1 = 0, iValue2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter starting point : ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter ending point : ");
        iValue2 = scanner.nextInt();

        Display display = new Display();

        display.rangeDisplayEven(iValue1,iValue2);

    }
}