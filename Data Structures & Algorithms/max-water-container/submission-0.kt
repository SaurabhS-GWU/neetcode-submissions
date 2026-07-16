class Solution {
    fun maxArea(heights: IntArray): Int {
        var first  = 0  
        var last  = heights.size - 1
        var area  = 0 
        while(first < last){
            var currArea = (last - first) * minOf(heights[first], heights[last])
            if(currArea > area) area = currArea 
            if(heights[first] > heights[last]){
                last-- 
            }else{
                first++ 
            }

        }
        return area 

    }
}
