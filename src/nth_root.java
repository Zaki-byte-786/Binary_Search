public class nth_root {
    // this exponent method will give error
//    static int exponent(int m,int n){
//        if (n == 0)return 1;
//        int ans = 1;
//        while (n > 0){
//            if (n % 2 == 1){
//                ans *= m;
//                n--;
//            }
//            m *= m;
//            n /= 2;
//        }
//        return ans;
//    }

    // this will not give error

    static int exponent(int mid,int n,int m){
        long ans = 1;
        for (int i = 1; i <= n ; i++) {
            ans = ans * mid;
            if (ans > m){
                return 2;
            }
        }
        if(ans == m)return 1;
        else return 0;
    }
     static int NthRoot(int n, int m) {
        // Write your code here.
         int i = 1,j = m,mid;
         while (i <= j){
             mid = (i + j) / 2;
             int resultOfExponent = exponent(mid,n,m);
             if (resultOfExponent == 1)return mid;
             else if(resultOfExponent == 2){
                 j = mid - 1;
             }
             else i = mid + 1;
         }
         return -1;
    }
    public static void main(String[] args) {
        System.out.println(NthRoot(5,3125));
    }
}
