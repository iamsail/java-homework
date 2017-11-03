import java.util.Scanner;

public class Matrix {
    private int row,column;
    private int ma[][];

    Matrix(){}

    Matrix(int m,int n){
        this.row = m;
        this.column = n;
    }

    public void setData(){
        Scanner in = new Scanner(System.in);
        ma = new int[row][column];

        for(int i=0;i<this.row;i++)
            for(int j=0;j<this.column;j++){
                this.ma[i][j] = in.nextInt();
            }
    }

    public Matrix cheng(Matrix a){
        Matrix temp = new Matrix(this.row,a.column);
        temp.ma = new int[this.row][a.column];

        for(int i = 0;i < this.row;i++){
            for(int j = 0; j < a.column;j++){
                int sum = 0;
                for(int k = 0; k < this.column;k++){
                    sum += this.ma[i][k] * a.ma[k][j];
                }
                temp.ma[i][j] = sum;
            }
        }

        return temp;
    }

    void print(){
        for(int i = 0;i < this.row;i++){
            for(int j = 0;j < this.column;j++){
                System.out.print(this.ma[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Matrix mx1=new Matrix(2,3);
        mx1.setData();
        mx1.print();
        Matrix mx2=new Matrix(3,2);
        mx2.setData();
        mx2.print();
        Matrix mx3=mx1.cheng(mx2);
        mx3.print();
    }
}
