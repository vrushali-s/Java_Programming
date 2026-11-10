import java.util.Scanner;

class Pattern
{
    void displayPattern(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i == j)
                {
                    System.out.print("$\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println("\n");
        }
    }
}

class program18_3
{
    public static void main(String[] args) 
    {
        int iValue1 = 0, iValue2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows and columns : ");
        iValue1 = scanner.nextInt();
        iValue2 = scanner.nextInt();

        Pattern pattern = new Pattern();
        pattern.displayPattern(iValue1, iValue2);

        scanner.close();

    }
}