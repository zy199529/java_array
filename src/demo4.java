public class demo4 {
    public static void main(String[] args){
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr.length;i++){
            for(int j= 0 ;j<i;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]= temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j= 0 ;j<arr.length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
