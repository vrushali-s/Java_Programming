import java.util.Scanner;

class program16_3
{
    static void pattern(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch;

        for(i = 1, ch = 'A'; i <= iRow; i++, ch++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(ch + "\t");
            }
            System.out.println("\n");
        }
    }
    public static void main(String args[])
    {
        int iValue1 = 0, iValue2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows and columns : ");
        iValue1 = scanner.nextInt();
        iValue2 = scanner.nextInt();

        System.out.println();
        pattern(iValue1, iValue2);
    }
}