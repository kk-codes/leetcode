class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
    /* 1)first need to find whether rows are even or odd
        To reverse:
            if even we can switch places last to first , second last to second...
            else we neeed switch same like above but keep the center element there itself
        To inverse:
            change 1 to 0 and 0 to 1*/
      int n = image.length;
        int[][] temp = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[i][j] = image[i][n-j-1];
                if(temp[i][j]==0)
                    temp[i][j]=1;
                else
                    temp[i][j]=0;
            }
        }
        return temp;
    }
}