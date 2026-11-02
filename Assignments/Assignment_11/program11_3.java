import java.util.Scanner;

class Display
{
    int rangeSum(int iStart, int iEnd)
    {
        int iCnt = 0, iSum = 0;

        if((iStart > iEnd) || (iStart < 0) || (iEnd < 0))
        {
            return -1;
        }

        for(iCnt = iStart; iCnt <= iEnd; iCnt++)
        {
            iSum = iSum + iCnt;
        }

        return iSum;
    }
}

class program11_3
{
    public static void main(String[] args) 
    {
        int iValue1 = 0, iValue2 = 0, iRet = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter starting point : ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter ending point : ");
        iValue2 = scanner.nextInt();

        Display display = new Display();

        iRet = display.rangeSum(iValue1,iValue2);

        if(iRet < 0)
        {
            System.out.println("Invalid Range");
        }
        else
        {
            System.out.println("Addition is : " + iRet);
        }
    }
}