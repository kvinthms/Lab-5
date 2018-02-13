import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        System.out.print("Enter a hexadecimal number: ");
        Scanner scnr = new Scanner(System.in);
        String input = scnr.nextLine();

        String inputModify = input.substring(0,2);

        if (inputModify.equals("0x"))
        {
            input = input.substring(2);
        }

        inputModify = input.toUpperCase();

        int counter = 0;
        long value = 0;

        while (counter < input.length())
        {
            long number = 0;

            if (inputModify.charAt(counter) == '0')
            {
            number = 0;
            }

            else if (inputModify.charAt(counter) == '1')
            {
                number = 1;
            }

            else if (inputModify.charAt(counter) == '2')
            {
                number = 2;
            }

            else if (inputModify.charAt(counter) == '3')
            {
                number = 3;
            }

            else if (inputModify.charAt(counter) == '4')
            {
                number = 4;
            }

            else if (inputModify.charAt(counter) == '5')
            {
                number = 5;
            }

            else if (inputModify.charAt(counter) == '6')
            {
                number = 6;
            }

            else if (inputModify.charAt(counter) == '7')
            {
                number = 7;
            }

            else if (inputModify.charAt(counter) == '8')
            {
                number = 8;
            }

            else if (inputModify.charAt(counter) == '9')
            {
                number = 9;
            }

            else if (inputModify.charAt(counter) == 'A')
            {
                number = 10;
            }

            else if (inputModify.charAt(counter) == 'B')
            {
                number = 11;
            }

            else if (inputModify.charAt(counter) == 'C')
            {
                number = 12;
            }

            else if (inputModify.charAt(counter) == 'D')
            {
                number = 13;
            }

            else if (inputModify.charAt(counter) == 'E')
            {
                number = 14;
            }

            else if (inputModify.charAt(counter) == 'F')
            {
                number = 15;
            }

            else
            {
                number = 0;
            }

            int position = input.length() - counter - 1;

            long calcNumber = number;
            double calcPosition = position;

            double calcValue = calcNumber * Math.pow(16,calcPosition);
            calcValue = Math.round(calcValue);

            number = (long)calcValue;

            value = number + value;

            counter++;
        }

        System.out.println("Your number is " + value + " in decimal");

        //Wow is git confusing. WHo the hell decided how this damn thing would run.
        //Duuuuuude wtf

    }
}
