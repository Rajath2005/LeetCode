class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int OldColor=image[sr][sc];
        if( OldColor==color)
        {
            return image;
        }
        dfs(image, sr, sc, OldColor, color);
        return image;
        
    }
    public void dfs(int [][]image, int i, int j, int OldColor, int NewColor)
    {
        if(i<0 || j<0 || i>=image.length || j>=image[0].length || image[i][j]!=OldColor)
        {
            return;
        }
        image[i][j]=NewColor;

        dfs(image, i-1, j, OldColor, NewColor );//top
        dfs(image, i+1, j, OldColor, NewColor );//down
        dfs(image, i, j-1, OldColor, NewColor );//left
        dfs(image, i, j+1, OldColor, NewColor );//right

    }
}