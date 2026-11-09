import java.util.Scanner;

class Pattern
{
    void displayPattern(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch;

        for(i = 1; i <= iRow; i++)
        {
            if((i % 2) == 1)
            {
                for(j = 1; j <= iCol; j++)
                {
                    System.out.print(j + "\t");
                }
            }
            else
            {
                for(j = -1; j >= -iCol; j--)
                {
                    System.out.print(j + "\t");
                }
            }
            
            System.out.println("\n");
        }
    }
}

class program17_4
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