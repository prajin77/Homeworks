public class SpiralMatrix
{
    public static void printSpiral(int[][] mat)
    {
        int m = mat.length;
        int n = mat[0].length;

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        while (top <= bottom && left <= right)
        {
            // Print top row
            for (int i = left; i <= right; i++)
            {
                System.out.print(mat[top][i] + " ");
            }
            top++;

            // Print right column
            for (int i = top; i <= bottom; i++)
            {
                System.out.print(mat[i][right] + " ");
            }
            right--;

            // Print bottom row
            if (top <= bottom)
            {
                for (int i = right; i >= left; i--)
                {
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }

            // Print left column
            if (left <= right)
            {
                for (int i = bottom; i >= top; i--)
                {
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args)
    {
        int[][] mat = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13,14, 15, 16}
        };

        printSpiral(mat);
    }
}
