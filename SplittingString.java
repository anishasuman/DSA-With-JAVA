class SplittingString {
    public int maxScore(String s) {
        int right = 0;
        int left = 0;
        int maxScore = 0;
        int n = s.length();

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                right++;
            }
        }


        for(int i = 0;i<n-1;i++){
            if(s.charAt(i)=='0'){
                left++;
            }else{
                right--;
            }
            int score = left+right;
            
            maxScore = Math.max(maxScore , score);
        }
         return maxScore;
    }
   
}