public class median_Of_two_sorted_array {
//    public double findMedianSortedArrays(int[] array1, int[] array2) {
//        int n1 = array1.length,n2 = array2.length,p1 = 0,p2 = 0,p3 = 0;
//        int[] array3 = new int[n1+n2];
//        while(p1 < n1 && p2 < n2){
//            if(array1[p1] <= array2[p2])array3[p3++] = array1[p1++];
//            else array3[p3++] = array2[p2++];
//        }
//        while(p1 != n1)array3[p3++] = array1[p1++];
//        while(p2 != n2)array3[p3++] = array2[p2++];
//        if((n1+n2)% 2 == 1){
//            return (double)array3[(n1+n2)/2];
//        }
//        int i1 = (n1 + n2) / 2;
//        int i2 = i1 - 1;
//        return (double) (array3[i1] + array3[i2]) / 2;
//    }


    // optimal approach - SC->O(1)
    public double findMedianSortedArrays(int[] array1, int[] array2){
        int n1 = array1.length,n2 = array2.length,p1 = 0,p2 = 0;
        int firstElement = -1,secondElement = -1;
        int count = 0,n = n1 + n2,ind1 = n/2,ind2 = ind1 - 1,x = -1,y = -1;
        while(p1 < n1 && p2 < n2){
            if (array1[p1] <= array2[p2]){
                if (count == ind1) x = array1[p1];
                if (count == ind2) y = array1[p1];
                p1++;
                count++;
            }
            else{
                if (count == ind1) x = array2[p2];
                if (count == ind2) y = array2[p2];
                count++;
                p2++;
            }
            if (x != -1 && y != -1)break;
        }
        while (p1 < n1){
            if (count == ind1) x = array1[p1];
            if (count == ind2) y = array1[p1];
            count++;
            p1++;
            if (x != -1 && y != -1)break;
        }
        while (p2 < n2){
            if (count == ind1) x = array2[p2];
            if (count == ind2) y = array2[p2];
            count++;
            p2++;
            if (x != -1 && y != -1)break;
        }
        if (n % 2 == 1)return x;
        return (double)(x + y) / 2;
    }


    public static void main(String[] args) {

    }
}
