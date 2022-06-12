public class BirthMonth
{

    public static void main(String[] args)
    {
        //num birthMonth
        //num MINIMUM_BIRTH_MONTH_RANGE = 1
        //num MAXIMUM_BIRTH_MONTH_RANGE = 12
        //output "Enter your birth month [1 – 12]"
        //input birthMonth
        //If birthMonth >= 1 and birthMonth <= 12 then
        //output "Your birth month is: N"
        //Else
        //output "You entered an incorrect month value: N"
        //endIf

        int firstMonth = 1;
        int lastMonth = 12;
        int birthMonth = 13;

        if(birthMonth >= 1 && birthMonth <= 12)
        {
            System.out.println("Your birth month is " + birthMonth);
        }
        else
        {
            System.out.println("You entered incorrect month value: " + birthMonth);
        }
    }

}