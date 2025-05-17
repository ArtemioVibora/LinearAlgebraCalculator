import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Matrix {
    private int row;
    private int col;
    private int[][] matrix;

    public static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    public static BufferedReader reader = new BufferedReader(inputStreamReader);

    public void setRow(int row)
    {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setMatrix(int[][] matrix)
    {
        this.matrix = matrix;
    }

    public int[][] getMatrix()
    {
        return matrix;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int[][] enterValues() throws IOException
    {
        int[][] tempM = new int[row][col];
        for (int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.printf("Enter number of row %d of column %d: ", i + 1, j + 1);
                tempM[i][j] = Integer.parseInt(reader.readLine());
            }
            System.out.println();
        }
        return tempM;
    }

    public void displayMatrix()
    {
        for (int i = 0; i < row; i++)
        {
            System.out.println();
            for (int j = 0; j < col; j++)
            {
                System.out.print(matrix[i][j] + "  ");
            }
        }
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append("\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sb.append(matrix[i][j]).append("  ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }




}
