import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class App {

    public static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    public static BufferedReader reader = new BufferedReader(inputStreamReader);
    public static Display display = new Display();
    public static Prompter prompt = new Prompter();
    public static MatrixCalculator matrixCalculator = new MatrixCalculator();

    //ArrayLists and HashMaps
    public static ArrayList<Matrix> matrixContainer = new ArrayList<>();
    public static HashMap<Integer, Integer> rowAndColContainer = new HashMap<>();
    public static HashMap<HashMap<Integer, Integer>, ArrayList<Matrix>> overAllContainer = new HashMap<>();




    public void run() throws IOException, NullPointerException
    {
        boolean flag = true;
        int input;

        int row;
        int col;


        while (flag)
        {
            display.menuOptions();
            System.out.print("Enter choice: ");
            input = Integer.parseInt(reader.readLine());
            switch (input)
            {
                //Enter matrix
                case 1:
                    Matrix matrix = new Matrix();
                    row = prompt.promptRow();
                    col = prompt.promptCol();
                    matrix.setRow(row);
                    matrix.setCol(col);
                    int[][] tempMatrix = matrix.enterValues();
                    matrix.setMatrix(tempMatrix);
                    matrix.displayMatrix();
                    matrixContainer.add(matrix);
                    rowAndColContainer.put(row, col);
                    overAllContainer.put(rowAndColContainer, matrixContainer);
                    break;
                case 2:
                    System.out.println(matrixContainer);
                    break;
                case 3:

                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    display.displayGenErrorMessage();
                    break;
            }
            System.out.println();
        }
    }
}
