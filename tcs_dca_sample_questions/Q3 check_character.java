// take a input string and check if the first character is Uppercase letter, lowercase letter, number or symbol and print it.

import java.util.Scanner;

class check_character
{
    public static void main(String[] args)
    {
        String s;
        char firstLetter;

        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        firstLetter = s.charAt(0);

        if(Character.isLetterOrDigit(firstLetter))
        {
            if(Character.isLetter(firstLetter))
            {
                if(Character.isUpperCase(firstLetter))
                {
                    System.out.println("UPPERCASE LETTER");
                }
                else if(Character.isLowerCase(firstLetter))
                {
                    System.out.println("lowercase letter");
                }
            }
            else
            {
                System.out.println("Number");
            }
        }
        else
            {
                System.out.println("Symbol");
            }
    }
}
