import java.util.Scanner;

public class elementFound {
    public static void main(String[] args) {
       // --------------------element found or not found---------------------------
        int arr[]={2,4,5,6,7,8,9,6,5};
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the element:");
        int num=sc.nextInt();

        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("element found");
                found=true;
                break;

            }
            if(!found){
                System.out.println("element not found");
            }
        }
    }
}
