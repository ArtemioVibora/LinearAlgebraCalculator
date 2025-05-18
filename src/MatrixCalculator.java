public class MatrixCalculator {

    private Matrix matrix1;
    private Matrix matrix2;

    public MatrixCalculator(Matrix matrix1, Matrix matrix2)
    {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    public MatrixCalculator()
    {

    }

    public boolean isAddable(Matrix matrix1, Matrix matrix2)
    {
        if (matrix1.length() != matrix2.length())
        {
            return false;
        }

        return true;
    }

    public boolean isMultipliable(Matrix matrix1, Matrix matrix2)
    {
        return true;
    }

    public void setMatrix1(Matrix matrix1) {
        this.matrix1 = matrix1;
    }

    public void setMatrix2(Matrix matrix2) {
        this.matrix2 = matrix2;
    }

    public Matrix getMatrix1()
    {
        return matrix1;
    }

    public Matrix getMatrix2()
    {
        return matrix2;
    }



}
