// Author: Saptarshi Das
// Date: 19/02/2021

/*
    Take as number as input and if the square of the number end with the number itself, then output "Correct Number", else output
    "Incorrect Number", if the user enters negative integer the result should display "Wrong Input".

    Input Format:
    Contains an integer 'N' denoting the number

    Output Format:
    
 */

 #include<stdio.h>
 #include<math.h>

 void check_square_end(int n)
 {
     int n_square, count_digit = 0, temp = n,ten_pow;

    // find the number of digits in n
    while(temp>0)
    {
        temp = temp/10;
        count_digit++;
    }
    
    n_square = pow(n,2);
    // raise 10 to the power of the digits in n
    ten_pow = pow(10,count_digit);

    if(n<0)
        printf("Wrong Input");
    // divide by the number obtained by raising the 10th power of the count_digits
    else if(n_square%ten_pow == n)
        printf("Correct Number");
    else
        printf("Incorrect Number");
        
 }

 int main()
 {
    int n;

    scanf("%d",&n);

    check_square_end(n);
    
    return 0;
 }
