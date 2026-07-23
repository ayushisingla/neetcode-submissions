class Solution {
    public boolean isPalindrome(String s) {
        int leftIndex = 0, rightIndex = s.length()-1;
        while(leftIndex < rightIndex){
            while(leftIndex < rightIndex && !Character.isLetterOrDigit(s.charAt(leftIndex))) {
                leftIndex++;
            }

            while(leftIndex < rightIndex && !Character.isLetterOrDigit(s.charAt(rightIndex))) {
                rightIndex--;
            }

            if(s.toLowerCase().charAt(leftIndex) != s.toLowerCase().charAt(rightIndex)){
                return false;
            }

            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}
