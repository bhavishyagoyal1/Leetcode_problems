class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int m=matrix[0].length;
        int arr[]=new int[m*n];
        int a=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[a++]=matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}