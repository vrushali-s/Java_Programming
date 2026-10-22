import java.util.Scanner;

class program5_2
{
    public static void main(String args[])
    {
        int iYear= 0;
        boolean iRet = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year : ");
        iYear = scanner.nextInt();

        if(iYear < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        Check check = new Check();
        iRet = check.checkLeapYear(iYear);

        if(iRet == true)
        {
            System.out.println(iYear + " is a leap year");
        }
        else
        {
            System.out.println(iYear + " is not a leap year");
        }
    }
}

class Check
{
    boolean checkLeapYear(int iValue)
    {
        if(((iValue % 400) == 0) || (((iValue % 4) == 0) && (iValue % 100) != 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

/*
    condition 1 : 2024 (A standard leap year)
                  2024 % 400 = false 
                  or
                  2024 % 4 = true && 2024 % 100 = true ---> FINAL TRUE
                  
    condition 2 : 1900 (A centuary year which is not leap year)
                  1900 % 400 = false 
                  or
                  1900 % 4 = true && 1900 % 100 = false ---> FINAL FALSE

    condition 3 : 2000 (A centuary year which is leap year)
                  2000 % 400 = true (short circuit) ---> FINAL TRUE 
                  or
                  2000 % 4 = true && 2000 % 100 = true

*/