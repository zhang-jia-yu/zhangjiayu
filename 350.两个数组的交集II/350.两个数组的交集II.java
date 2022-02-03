import java.util.Arrays;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] endArr = new int[Math.min(len1 , len2)];
        int index = 0 ,index1 = 0 ,index2 = 0;
        while (index1 < len1 && index2 < len2){
            if (nums1[index1] > nums2[index2]){
                index2++;
            }else if (nums1[index1] < nums2[index2]){
                index1++;
            }else{
                endArr[index] = nums1[index1];
                index++;
                index1++;
                index2++;
            }
        }
        return Arrays.copyOfRange(endArr , 0 , index);
    }
}