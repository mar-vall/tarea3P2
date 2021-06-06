
public class Matrices
{
    private int [][] matriz;
    public Matrices(int n){
        matriz = new int [n][n];
    }
    public void recorridoCaracol(){
        int num = 1;
        int a = 0;
        int b = matriz.length - 1;        
        for(int j = 0; j < matriz.length; j++){
            for(int i = a; i <= b; i++){
                matriz[a][i] = num++;
            }
            for(int i = a + 1; i <= b; i++){
                matriz[i][b] = num++;
            }
            for(int i = b - 1; i >= a; i--){
                matriz[b][i] = num++;
            }
            for(int i = b - 1; i > a; i--){
                matriz[i][a] = num++;
            }
            a++;
            b--;
        }
    }
    public void diagonal(){
        //para diagonal principal
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(i == j){
                    matriz[i][j] = 1;
                }
            }
        }
        //para diagonal secundaria
        int a = 0;
        int b = matriz.length - 1;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(i == a && j == b){
                    matriz[a][b] = -1;
                    a++; b--;
                }
            }
        }
    }
    public void imprimir(){
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
