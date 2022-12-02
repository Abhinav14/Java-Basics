public class TestSearch {

    public static int[] sortArray(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    
    public static int binarySearch(int[] sortedArr, int searchMe){
        int low =0;
        int high = sortedArr.length-1;
        int mid = (low+high)/2;
        
        while(low <= high){
            if(sortedArr[mid] == searchMe){
                return mid;
            }else if(sortedArr[mid] < searchMe){
                low = mid + 1;
            }else {
                high = mid - 1;
            }

            mid = (low+high)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        //int[] tempArr = new int[5];
        //int[] tempArr2 = {1, 6, 3, 9, 4, 2, 20, 18, 15};
        //int[] tempArr3 = new int[] {2,3,5,7};
        int[] sortedArray = sortArray(new int[] {1, 6, 3, 9, 4, 2, 20, 18, 15});
        int index = binarySearch(sortedArray, 5);
        System.out.println("If value is there then the value is at index -->"+index);
    }

}
