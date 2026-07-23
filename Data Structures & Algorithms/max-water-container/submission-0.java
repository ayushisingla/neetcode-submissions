class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int startIndex=0;
        int endIndex=heights.length-1;
        while(startIndex < endIndex){
            int width = endIndex - startIndex;
            int height = Math.min(heights[startIndex], heights[endIndex]);
            int tempArea = width * height;
            if(tempArea > area) {
                area = tempArea;
            }
            if(heights[startIndex]<heights[endIndex]){
                startIndex++;
            } else {
                endIndex--;
            }
        }
        return area;
    }
}

