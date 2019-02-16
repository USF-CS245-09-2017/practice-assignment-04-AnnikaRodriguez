public class BubbleSort implements SortingAlgorithm {


    public void sort(int[] a){
        //iterates through entire array and swaps if current is greater than the next one
        //sorts in ascending order

        for (int i= 0; i < a.length - 1; i++){
            for (int j= 0; j < a.length - i - 1; j++){
                if (a[j] > a[j+1]){
                    swap(a, j, j+1);
                }
            }
        }

    }

    public void swap(int[] array, int a, int b){

        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;

    }



} //end of program
