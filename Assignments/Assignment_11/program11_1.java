import java.util.Scanner;

class Display
{
    void rangeDisplay(int iStart, int iEnd)
    {
        int iCnt = 0;

        if(iStart > iEnd)
        {
            System.out.println("Invalid Range");
            return;
        }

        for(iCnt = iStart; iCnt <= iEnd; iCnt++)
        {
            System.out.print(iCnt + "  ");
        }
    }
}

class program11_1
{
    public static void main(String args[])
    {
        int iValue1 = 0, iValue2 = 0;
        Scanner scanner = new Scanner(System.in);
        Display display = new Display();

        System.out.println("Enter starting point : ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter ending point : ");
        iValue2 = scanner.nextInt();

        display.rangeDisplay(iValue1,iValue2);
    }

}