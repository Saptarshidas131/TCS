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

 import java.util.*;

 class Q1_nth_smallest
 {
    public static void main(String[] args)
    {
        // variable declaration
        int X, N;

        // input array size
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();

        // input N
        N = sc.nextInt();

        // arraylist declaration
        ArrayList<Integer> A = new ArrayList<Integer>();

        // input array elements
        for(int i=0; i<X; i++)
        {
            A.add(sc.nextInt());
        }

        // sort the list
        Collections.sort(A);

        // print the nth smallest element
        System.out.println(A.get(N-1));
    }
 }
