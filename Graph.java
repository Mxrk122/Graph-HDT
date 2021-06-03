/*
 * @author CuRiOsiTy (canal de youtube)
 */
public class Graph {

    private int n;
    private int[][] matrix;


    public Graph(int n) {
        this.n = n;
        matrix = new int[this.n][this.n];
        //se inicializa matriz en 0
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                matrix[i][j] = 0;
            }
        }
    }

    public void add(int i, int j){
        matrix[i][j] += 1;
    }

    public void remove(int i, int j){
        if(matrix[i][j]>0)
            matrix[i][j] -= 1;
    }

    // Metodo agregado por mi
    public void modify(int i, int j, int value){
        matrix[i][j] = value;
    }

    public int[][] getGraph(){
        return matrix;
    }

    public int get(int a, int b){
        return matrix[a][b];
    }

    public void showMatrix(){

        for(int i=0; i< n; i++){
            System.out.print("\t");
            for(int j=0; j< n; j++){
                System.out.print( matrix[i][j] + "\t" );
            }
            System.out.print("");
            System.out.println();
        }
    }
}