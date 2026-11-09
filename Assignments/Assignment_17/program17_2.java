import java.util.Scanner;

class Pattern
{
    void displayPattern(int iRow, int iCol)
    {
        int i = 0, j = 0;
        int evenCount = 0, oddCount = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 0, evenCount = 2, oddCount = 1; j <= iCol; j++)
            {
                if((i % 2) == 1)
                {
                    System.out.print(evenCount + "\t");
                    evenCount += 2;
                }
                else
                {
                    System.out.print(oddCount + "\t");
                    oddCount += 2;
                }
            }
            System.out.println("\n");
        }
    }
}

class program17_2
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