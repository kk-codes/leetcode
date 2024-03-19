class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
    /* 1)first need to find whether rows are even or odd
        To reverse:
            if even we can switch places last to first , second last to second...
            else we neeed switch same like above but keep the center element there itself
        To inverse:
            change 1 to 0 and 0 to 1*/
      int n = image.length;
        /*int[][] temp = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[i][j] = image[i][n-j-1];
                temp[i][j] ^=1;
            }
        }
        return temp;
        
        T.c = O(n^2)
        S.c = O(n^2);
        */
        int temp=-1;
         for(int i =0;i<n;i++){
            for(int j=0;j<(n+1)/2;j++){
                temp = image[i][n-j-1];
                image[i][n-j-1] = image[i][j]^1;
                image[i][j]=temp^1;
            }
        }
        return image;
        //T.C O(n*n/2)
        //S.C O(1)
    }
    
}