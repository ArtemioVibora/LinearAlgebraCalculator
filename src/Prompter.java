import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prompter {

    public static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    public static BufferedReader reader = new BufferedReader(inputStreamReader);

    public int promptRow() throws IOException
    {
        int row = 0;
        System.out.print("Enter number of rows: ");
        row = Integer.parseInt(reader.readLine());

        return row;

    }

    public int promptCol() throws IOException
    {
        int col = 0;
        System.out.print("Enter number of columns: ");
        col = Integer.parseInt(reader.readLine());
        return col;
    }

}
