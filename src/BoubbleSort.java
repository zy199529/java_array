public class BoubbleSort {
    public static void main(String[] args){
        int[] array=new int[]{63, 4, 24, 1, 3, 15};
        //创建冒泡排序类的对象
        BoubbleSort sorter=new BoubbleSort();
        sorter.sort(array);
    }

    public void sort(int[] array){
        for(int i=1;i<array.length;i++){
            for(int j=0;j<array.length-i;j++){
                if(array[j]>array[j+1]){
                    int temp;
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for(int i:array){
            System.out.print(">"+i);
        }
        System.out.println();
    }
}
