import java.util.Scanner;

class program5_5
{
    public static void main(String args[])
    {
        char cInput;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter single character : ");
        cInput = scanner.next().charAt(0);

        CheckType check = new CheckType();
        check.checkCharacterType(cInput);
    }
}

class CheckType
{
    void checkCharacterType(char cValue)
    {
        int iAscii = cValue;
        if((iAscii >= 65) && (iAscii <= 90))
        {
            System.out.println("Uppercase Character");
        }
        else if((iAscii >= 97) && (iAscii <= 122))
        {
            System.out.println("Lowercase Character");
        }
        else if((iAscii >= 48) && (iAscii <= 57))
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Special Character");
        }
    }
}