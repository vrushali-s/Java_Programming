import java.util.Scanner;

class Area
{
    double circleArea(float fRadius)
    {
        double dAns = 0.0;

        dAns = 3.14 * fRadius * fRadius;

        return dAns;
    }
}

class program10_1
{
    public static void main(String args[])
    {
        float fValue = 0.0f;
        double dRet = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius : ");
        fValue = scanner.nextFloat();

        Area area = new Area();

        dRet = area.circleArea(fValue);

        System.out.println("Area of circle is : " + dRet);
    }
}