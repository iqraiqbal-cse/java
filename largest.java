public class largest {

int[] arr = {3, 9, 2, 5, 7}; 
int max = arr[0]; 
 
for (int i = 1; i < arr.length; i++) { 
    if (arr[i] > max) { 
        max = arr[i]; 
    } 
} 
System.out.println("Maximum: " + max);
}
