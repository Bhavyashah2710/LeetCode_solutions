import java.util.*;
class Solution {
    public static int vb(int[] arr , int find ){
        int i = 0 ;
        int j = arr.length-1;
        while(i <= j){
            int mid = i + (j-i)/2 ;
            if(arr[mid]==find) return mid;
            else if(arr[mid] > find) j = mid-1;
            else i = mid+1;
        }
        return -1;
    }
    public int[] arrayRankTransform(int[] a) {
        int[] b = a.clone();
        Arrays.sort(b);
        int m = 0 ;
        for(int n : b ){
            if(m==0 || b[m-1] != n){
                b[m] = n ;
                m++;
            }
        }
        int[] v = Arrays.copyOf(b,m);
        for(int i = 0 ; i < a.length ; i++){
            a[i] = vb(v,a[i])+1;
        } 
        return a;
    }
}