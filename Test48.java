import java.util.Arrays;
public class Test48{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        trangsform(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void trangsform(int[] arr1){
        int left=0;
        int right=arr1.length-1;
        while(left<right){
            while(left<right && arr1[left]%2==0){
                left++;
            }
            while(left<right && arr1[right]%2!=0){
                right--;
            }
                int tmp=arr1[left];
                arr1[left]=arr1[right];
                arr1[right]=tmp;  
        }
    }
}