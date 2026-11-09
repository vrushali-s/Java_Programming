import java.util.Scanner;

class Pattern
{
    void displayPattern(int iRow, int iCol)
    {
        int iCount = 0,i = 0, j = 0;

        iCount = 1;
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(iCount > 9)
                {
                    iCount = 1;
                }
                System.out.print(iCount + "\t");
                iCount++;
            }
            System.out.println("\n");
        }
    }
}

class program17_1
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter number of rows and columns : ");
        iValue1 = scanner.nextInt();
        iValue2 = scanner.nextInt();

        Pattern pattern = new Pattern();
        pattern.displayPattern(iValue1, iValue2);
    }
}