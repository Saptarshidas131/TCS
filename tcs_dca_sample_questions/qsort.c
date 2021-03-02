#include <stdio.h>
#include <stdlib.h>
    
    int arr[] = { 33, 12, 6, 2, 76 };
    
    // compare function, compares two elements
    int compare (const void * num1, const void * num2) {
       if(*(int*)num1 > *(int*)num2)
        return 1;
       else
        return -1;
    }
    
    int main () {
       int i;
    
       printf("Before sorting the array: \n");
       for( i = 0 ; i < 5; i++ ) {
          printf("%d ", arr[i]);
       }
       // calling qsort
       qsort(arr, 5, sizeof(int), compare);
    
       printf("\nAfter sorting the array: \n");
       for( i = 0 ; i < 5; i++ ) {   
          printf("%d ", arr[i]);
       }
      
       return 0;
    }
