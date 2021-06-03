/*
 * @author CuRiOsiTy (canal de youtube)
 */
public class Graph {

    private int n;
    private int[][] matriz;


    public Graph(int n) {
        this.n = n;
        matriz = new int[this.n][this.n];
        //se inicializa matriz en 0
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                matriz[i][j] = 0;
            }
        }
    }

    public void add(int i, int j){
        matriz[i][j] += 1;
    }

    public void remove(int i, int j){
        if(matriz[i][j]>0)
            matriz[i][j] -= 1;
    }

    // Metodo agregado por mi
    public void modify(int i, int j, int value){
        matriz[i][j] = value;
    }

    public void showMatrix(){

        for(int i=0; i< n; i++){
            System.out.print("\t");
            for(int j=0; j< n; j++){
                System.out.print( matriz[i][j] + "\t" );
            }
            System.out.print("");
            System.out.println();
        }
    }

    public void imprimir(){
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                if (matriz[i][j]==0){
                    matriz[i][j]=999999;
                }
            }

        }
        for(int i=0; i< n; i++){
            System.out.print("\t");
            for(int j=0; j< n; j++){
                System.out.print( matriz[i][j] + "\t" );
            }
            System.out.print("");
            System.out.println();
        }
    }
    public int[][] getGraph(){
        return matriz;
    }
    public int get(int a, int b){
        return matriz[a][b];
    }
}