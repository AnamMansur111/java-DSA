public class LinearSearch {
    public static void main(String[] args){
        int[] nums={1,3,6,8,12,15,18,23,24};
        int target = 23;
        int ans=linearsearch(nums,target);
        System.out.println(ans);
    }

    static int linearsearch(int[]arr,int target){
        if(arr.length==0){
            return -1;

        }
        for(int element:arr){
           if (element==target) {
                return element;
            }
        
            }
            return -1;
        }
       
    }
        
       
