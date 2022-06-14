package dsaQuestion;

public class linearSearchInArray {
    public static void main(String args[]){
        int arr[] ={10,20,11,52,36,22};
        int s = 11;  // the element that we have to find

        for(int i=0;i<arr.length;i++){  // iterate through array
            if(arr[i] == s){
                System.out.println("the element is present on index :" +i);
            }
        }
    }
    
}
