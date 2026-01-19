import java.util.ArrayList;
import java.util.List;

class Solution {
    public int maxArea(int[] height) {
        int i =0,j=height.length-1;
        List<Integer> list = new ArrayList<>();
        int area=0;
        while (i<j) {
            area = Math.min(height[j], height[i])*(j-i);
            list.add(area);
            if(height[j]>height[i])i++;
            else j--;
        }
        int lar = 0;
        for (int k = 0; k < list.size(); k++) {
            lar = Math.max(lar,list.get(k));
        }
        return lar;
    }
}
public class ContainerWithMostWaterr {
    
}
