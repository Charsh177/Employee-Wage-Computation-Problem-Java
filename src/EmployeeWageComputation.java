public class EmployeeWageComputation
{
    public static void main(String args[])
    {
        final int IS_FULL_TIME = 1;
        int empType = (int) (Math.random() * 100) % 2;
        if (empType == IS_FULL_TIME)
        {
            System.out.println("Employee is Present");

        } else
        {
            System.out.println("Employee is Absent");

        }
    }
}