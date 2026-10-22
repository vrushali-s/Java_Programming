import java.util.Scanner;

class program5_3
{
    public static void main(String args[])
    {
        float fMarks = 0.0f;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks : ");
        fMarks = scanner.nextFloat();

        if(fMarks < 0 || fMarks > 100)
        {
            System.out.println("Invalid Marks");
            return;
        }

        Grade grade = new Grade();
        grade.displayGrade(fMarks);
    }
}

class Grade
{
    void displayGrade(float fValue)
    {
        if((fValue >= 90) && (fValue <= 100))
        {
            System.out.println("Grade A");
        }
        else if((fValue >= 75) && (fValue <= 89))
        {
            System.out.println("Grade B");
        }
        else if((fValue >= 60) && (fValue <= 74))
        {
            System.out.println("Grade C");
        }
        else if((fValue >= 40) && (fValue <= 59))
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}