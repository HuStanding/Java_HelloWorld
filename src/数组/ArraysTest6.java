package 数组;

/**
 * @author huzhu
 * @date 2019-04-07 15:43
 */
public class ArraysTest6 {
    public static void main(String[] args) {

        int[] a = {4,2,6,1,3,9,10};
        bubbleSort(a);
        for(int i : a){
            System.out.println(i);
        }
    }

    public static void bubbleSort(int[] values) {
        for(int i = 0;i < values.length;i++){
            for(int j = i + 1; j < values.length;j++){
                if(values[i] > values[j]){
                    swap(values,i,j);
                }
            }
        }
    }

    public static void swap(int[] values,int i,int j) {
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }
}
