class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int startIndex=0;
        int endIndex=heights.length-1;
        while(startIndex < endIndex){
            area = Math.max(area, (endIndex - startIndex) * Math.min(heights[startIndex], heights[endIndex]));
            if(heights[startIndex]<heights[endIndex]){
                startIndex++;
            } else {
                endIndex--;
            }
        }
        return area;
    }
}

