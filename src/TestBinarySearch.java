public class TestBinarySearch {

    public static int[] sortArray(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                int temp = 0;
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int binarySearch(int[] sortedArray, int valueToSearch){
        int low = 0;
        int high = sortedArray.length-1;
        int mid = (low+high)/2;

        while(low <= high){
            if(sortedArray[mid] == valueToSearch){
                return mid;
            }else if(valueToSearch > sortedArray[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }

            mid = (low + high) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = sortArray(new int[] {9, 3, 8, 7, 5, 4, 10});
        int indexOfValIfPresent = binarySearch(sortedArray, 5);
        System.out.println(indexOfValIfPresent);
    }

}
