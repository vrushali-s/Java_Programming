import java.util.Scanner;

class Converter
{
    double FhtoCs(float fTemp)
    {
        double dAns = 0.0;

        dAns = (double)(fTemp - 32) * 0.55555;

        return dAns;
    }
}

class program10_4
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        float fValue = 0.0f; 
        double dRet = 0.0;

        System.out.println("Enter temperature in Fahrenheit : ");
        fValue = scanner.nextFloat();

        dRet = converter.FhtoCs(fValue);

        System.out.println("Temperature in celcius is : "+ dRet);

    }
}