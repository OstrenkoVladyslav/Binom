package binom;

public class Binom {

    public static void main(String[] args) {
        int array_row [][] = new int [10][];
        for (int i=0; i<10; i++){
            array_row[i]=new int [i+1];
            array_row[i][0]=1;
            System.out.print(array_row[i][0]+" ");
            for (int j=1;j<i;j++){
                array_row[i][j]=array_row[i-1][j]+array_row[i-1][j-1];
                System.out.print(array_row[i][j]+" ");
            }
            array_row[i][i]=1;
            if (i==0)
                System.out.println();
            else
                System.out.println(array_row[i][i]);
        }
        System.exit(0);
    }    
}
