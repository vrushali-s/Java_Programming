import java.util.Scanner;

class Converter
{
    double squareMeter(int iValue)
    {
        double dAns = 0.0;

        dAns = iValue * 0.0929;

        return dAns;
    }
}

class program10_5
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        int iValue = 0; 
        double dRet = 0.0;

        System.out.println("Enter area in square feet : ");
        iValue = scanner.nextInt();

        dRet = converter.squareMeter(iValue);

        System.out.println(String.format("Area in square meter is : %.6f", dRet));

    }
}