public class SelectionSort implements SortingAlgorithm {

    public void sort(int[] a){

        //from descending to ascending order
        int min, temp;

        for (int i = 0; i < a.length -1; i++){
            min = i;

            for (int j = i + 1; j < a.length; j++){
                if (a[j] < a[min]){
                    min = j;
                }
            }

            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }





} //end of program
