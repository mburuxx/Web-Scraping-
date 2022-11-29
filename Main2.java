public class Main2 {
    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        
        grid[0][0] = 0;
        grid[0][1] = 0;
        grid[0][2] = 0;
        
        grid[1][0] = 0;
        grid[1][1] = 1;
        grid[1][2] = 0;
        
        grid[2][0] = 0;
        grid[2][1] = 0;
        grid[2][2] = 0;
        
        System.out.println(T(2, 2));
    }
    
    public static int T(int i, int j) {
        if (i == 0 && j == 0) {
            return 1;
        }
        if (i < 0 || j < 0) {
            return 0;
        }
        return T(i-1, j) + T(i, j-1);
    }
}