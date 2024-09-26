public class binarySearchProblem_2 {
    static boolean matrixBinaryProblem_1(int [][] array,int target){
        int row = array.length;
        int column = array[0].length;
        int start = 0,end = row * column - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            int midElement = array[mid/column][mid%column];
            if (target == midElement)return true;
            else if (midElement < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
    }
    static String matrixBinaryProblem_2(int [][] array,int target){
        int row = array.length;
        int i = 0;
        int column = array[0].length;
        int j = column - 1;
        while (i < row && j >= 0){
            if (target == array[i][j])return i+","+j;
            else if (target > array[i][j]) {
                i++;
            }
            else {
                j--;
            }
        }
        return "not found";
    }
    static int peak_1_Index(int [] array){
        int start = 1;
        int n = array.length;
        int end = n-2;
        if (array[0] > array[1])return 0;
        if (array[n-1] > array[n-2])return n-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (array[mid] > array[mid-1] && array[mid] > array[mid+1])return mid;
            else if (array[mid] > array[mid-1]) start = mid + 1;
            else if (array[mid] > array[mid+1]) end = mid - 1;
        }
        return -1;
    }
    static int peak_multiple_Index(int [] array){
        int start = 1;
        int n = array.length;
        int end = n-2;
        if (array[0] > array[1])return 0;
        if (array[n-1] > array[n-2])return n-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (array[mid] > array[mid+1] && array[mid] > array[mid-1])return mid;
            else if (array[mid] > array[mid-1]) start = mid + 1;
            else if (array[mid] > array[mid+1]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [][] array = {{1,3,5,7,9},{10,13,14,15,16},{17,18,21,23,24},{25,26,31,32,33}};
        System.out.println(matrixBinaryProblem_1(array,13));
        System.out.println(matrixBinaryProblem_2(array,18));
        int [] a = {1,2,3,2,1};
        int n = a.length;
//        for (int i = 0; i < n; i++) {
//            if ((i == 0 || a[i] > a[i-1]) && (i == n-1 || a[i] > a[i+1])){
//                System.out.println(i);
//            }
//        }
        int [] peakArray = {1,2,3,4,5,2,1};
        int [] mPeakArray = {1,5,1,2,1};
        System.out.println(peak_1_Index(peakArray));
        System.out.println(peak_multiple_Index(mPeakArray));

    }
}


