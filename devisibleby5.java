public class devisibleby5 {
    public static void main(String[] args) {
        //-------------------- 4th program--------------------------------
        int arr[]={3,4,6,7,5,4};
        int count=1;

        for(int num:arr){
            if(num%5==0){
                count++;
            }
        }
        System.out.println("divisible by 5 the output is:"+count);

    }
}
