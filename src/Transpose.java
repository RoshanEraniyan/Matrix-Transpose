import java.util.*;

class Solution
{
    public void transpose(int[][] array,int r,int c)
    {
        int temp;
        int transpose[][]=new int[c][r];
        for(int i=0;i<c;i++)
        {
            for (int j=0;j<r;j++)
            {
                transpose[i][j]=array[j][i];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
}

class Transpose
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int columns=scanner.nextInt();
        int[][] array=new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                array[i][j]=scanner.nextInt();
            }
        }
        Solution solution =new Solution();
        solution.transpose(array,rows,columns);
    }
}
