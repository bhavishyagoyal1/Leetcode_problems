class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][]temp=new int[n][n];
        //rowshift
        for(int i=0;i<n;i++){
            int k=rowShift[i]%n;
            for(int j=0;j<n;j++){
                int newc=(j-k+n)%n;
                temp[i][newc]=grid[i][j];
            }
        }
        //colshift
        int[][]temp1=new int[n][n];
        for(int j=0;j<n;j++){
            int k=colShift[j]%n;
            for(int i=0;i<n;i++){
                int newr=(i-k+n)%n;
                temp1[newr][j]=temp[i][j];
            }
        }
        return temp1;
    }
}