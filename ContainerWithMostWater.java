public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left<right){
            int area = (left-right)*(Math.min(height[left],height[right]));
            maxArea = Math.max(maxArea,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
    
    public static void main(String[] args) {
        
    }
}
