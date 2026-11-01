import java.util.Scanner;

class Area
{
    double RectArea(float fWidth, float fHeight)
    {
        double dArea = 0.0;

        dArea = fWidth * fHeight;

        return dArea;
    }
}

class program10_2
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Area area = new Area();

        float fValue1 = 0.0f, fValue2 = 0.0f;
        double dRet = 0.0;

        System.out.println("Enter width : ");
        fValue1 = scanner.nextFloat();

        System.out.println("Enter height : ");
        fValue2 = scanner.nextFloat();

        dRet = area.RectArea(fValue1, fValue2);

        System.out.println(String.format("Area of rectangle is : %.4f",dRet));

    }
}