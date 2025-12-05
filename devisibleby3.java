public class devisibleby3 {
    public static void main(String[] args) {
       // ------------------- 3rd program-----------------------------
        int arr[]={2,3,4,5,6,7,};
        int count=0;

        for(int num:arr){
            if(num%3==0){
                count++;
            }
        }
        System.out.println("count exactly divisible by 3 is" + count);

    }
}
