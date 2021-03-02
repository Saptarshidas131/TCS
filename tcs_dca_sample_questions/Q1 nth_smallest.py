"""
Write a program to find the nth smallest element from a collection.

    Input format:
        * The first input contains the input X ,used to define the size of the array
        * The second input contains X unsorted integers seperated by a newline , i.e. A[i]
        * The third input contains the value of N, to find the Nth smallest element

    Output format:
        * The output should be a integer value, the Nth smallest element in the array
        * Constriants: 1 <= X <= 10  1 <= A[i] <= 1000  1<= N <= X
"""

X = int(input())
A = [int(A) for A in input().split()]
N = int(input())
# sort array A and output Nth element from beginning
A.sort()
print(A[N-1])   # N-1 as array index starts from 0
