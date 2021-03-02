/*
    Write a program to find the nth smallest element from a collection.

    Input format:
        * The first input contains the input X ,used to define the size of the array
        * The second input contains X unsorted integers seperated by a newline , i.e. A[i]
        * The third input contains the value of N, to find the Nth smallest element

    Output format:
        * The output should be a integer value, the Nth smallest element in the array
        * Constriants: 1 <= X <= 10  1 <= A[i] <= 1000  1<= N <= X
 */

#include<stdio.h>
#include<stdlib.h>

// declaring nth_smallest function to find the nth smalles element
void nth_smallest(int, int *,int);

int main()
{
    // X: size of the array,A: pointer to an array, N: Nth smallest element
    int X, *A, N;

    // input size of array
    scanf("%d",&X);
    
    // dynmically allocating memory for array
    A = (int*)malloc(X * sizeof(int));

    // input X unsorted integers
    for(int i=0; i<X; i++)
        scanf("%d",&A[i]);

    // input N
    scanf("%d",&N);

    nth_smallest(X,A,N);

    return 0;
}

// compare function, compares two elements
int compare (const void * num1, const void * num2) {
    if(*(int*)num1 > *(int*)num2)
        return 1;
    else
        return -1;
    }

// function definition for nth_smallest
/*
    Strategy: sort the array and output the Nth element from the beginning of the array
 */
void nth_smallest(int X, int A[], int N)
{
    // sorting using inbuilt quicksort, qsort function
    qsort(A,X,sizeof(int),compare);

    printf("%d",A[N-1]); 
}
