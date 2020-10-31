package collections;

public class CheckNumber {


    public boolean test;

    public boolean checkNumber(int arr[], int b){
        for(int i = 0;i<arr.length;i++){
            if (arr[i] == b){
                 test = true;
                 break;
            }
            else
                test = false;
        }
     return test;
    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
         int bb = 1;
         boolean ts ;
        CheckNumber cn = new CheckNumber();
         ts=cn.checkNumber(a,bb);
        System.out.println(ts);
    }
}
