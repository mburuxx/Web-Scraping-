import java.util.Arrays;

public class Sort {
public static void sort(Comparable[] arr) {

    for(int i = 0; i < arr.length-1; i++) {
    
    int minIndex = i;
    
    for(int j = i+1; j < arr.length; j++) {
    
    if(arr[j].compareTo(arr[minIndex]) < 0) {
    
    minIndex = j;
    
    }
    
    }
    
    Comparable temp = arr[i];
    
    arr[i] = arr[minIndex];
    
    arr[minIndex] = temp;
    
    }
    
    }

    // test the function:
    
    public static void main(String[] args) {
    
    Integer[] arr = {5,4,2,1,3};
    
    sort(arr);
    
    System.out.println(Arrays.toString(arr));
    
    }
    }
