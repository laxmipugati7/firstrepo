public class binarySearch{
public static void (String[]args){

int nums[]={ 23,34,32,54,32 };
int target=34;

int result=binarySearch(nums,target);

if(result !=-1)
System.out.println("element found at index : "+result);
else
System.out.println("element not found");

}

public static int binarySearch(int[] nums,int target){
int left = 0;
int right = num.length-1;

while(left <= right){
int mid = (left+right)/2;

if(nums[mid]==target){
return mid;
}
else if(nums[mid]<target){
left=mid+1;
}
else
right=mid-1;
}

return -1;
}
}



