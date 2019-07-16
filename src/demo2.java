public class demo2 {
    public static void main(String[] args){
        int[] arr=new int[]{1,2,3,9,-1};
        int temp=arr[0];
        for(int i=1;i<arr.length;i++) {
            if (temp > arr[i]) {
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }
}
