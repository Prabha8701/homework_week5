package homework;

/**
 * Write a Java program to reverse an array of integer values.
 */

public class ReverseArray {
    public static void reverse(int a[] , int n){
        int[] b = new int[n] ;
        int j=n;
        for(int i=0; i<n;i++){
           b[j-1]=a[i];
           j=j-1;
        }
        System.out.println("Reversed array is : ");
        for(int k=0;k<n;k++){
            System.out.print(+b[k]+ ",");
        }
    }
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        reverse(a,a.length);
        }
    }
