import java.util.Scanner;

class Converter
{
    int KMToMeter(int iNo)
    {
        int iAns = 0;

        iAns = iNo * 1000;

        return iAns;
    }
}

class program10_3
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        int iValue1 = 0, iRet = 0;

        System.out.println("Enter distance in KM : ");
        iValue1 = scanner.nextInt();

        iRet = converter.KMToMeter(iValue1);

        System.out.println("Meters : "+ iRet);

    }
}