public class linearSearch {
public static void main(String []args){

int nums[]={2,4,6,7,88,54};
int target=7;

int result = linearSearch(nums,target);

if(result != -1)
System.out.println("element found at index : "+result);
else
System.out.println("element not found ");
}
public static int linearSearch (int[] nums,int target){
for(int i=0;i<nums.length;i++){
if(nums[i]==target)
return i;
}
}

