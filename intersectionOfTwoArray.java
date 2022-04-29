package Arrays;

public class intersectionOfTwoArray {
    static void intersection(int a[],int b[] ,int m,int n){
        int i=0,j=0;
        while(i<m && j<n ){
            if(a[i] < b[j]){ // if element in the array a is less the array of b increment the i
                i++;
            }
            else if ( b[j] < a[i]){ //if element in the array b is less the array of a increment the j
                j++;
            }
            else {
                System.out.print(b[j] +" "); // when both the array contain same element
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {1,3,4,5,7};
        int b[] = {2,3,5,6};
        int m= a.length;
        int n= b.length;

        intersection(a,b,m,n);
    }
}
