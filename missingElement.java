package Arrays;
public class missingElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2;

        int sum =0;
        for(int i=0;i<arr.length;i++){
            int currsum =0;
            for(int j=i;j<i+1;j++){
                currsum += arr[j];
            }
            if(currsum > sum){
                sum = currsum;

            }

        }
        System.out.println(sum);


    }

}


