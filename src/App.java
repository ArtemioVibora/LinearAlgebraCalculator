import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {

    public static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    public static BufferedReader reader = new BufferedReader(inputStreamReader);
    public static Display display = new Display();
    public static Prompter prompt = new Prompter();
    public static ArrayList<Matrix> matrixContainer = new ArrayList<>();

    public void run() throws IOException
    {
        boolean flag = true;
        int input = 0;

        int row;
        int col;
        Matrix matrix = new Matrix();

        while (flag)
        {
            display.menuOptions();
            System.out.print("Enter choice: ");
            input = Integer.parseInt(reader.readLine());
            switch (input)
            {
                //Enter matrix
                case 1:
                    row = prompt.promptRow();
                    col = prompt.promptCol();
                    matrix.setRow(row);
                    matrix.setCol(col);
                    int[][] tempMatrix = matrix.enterValues();
                    matrix.setMatrix(tempMatrix);
                    matrix.displayMatrix();
                    matrixContainer.add(matrix);
                    break;
                case 2:
                    System.out.println(matrixContainer);
                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    display.displayGenErrorMessage();
                    break;
            }
            System.out.println();
            System.out.println("Hello");

        }
    }
}
