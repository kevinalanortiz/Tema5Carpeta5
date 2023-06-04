package ArrayBidimen;

import ArrayUnidimen.Metodos;
import EntradaSalida.Tools;

public class AlamacenarDatosTabla {
    private Object matriz[][];
    private byte i,j;//i filas y j columnas
    int matriz2[][]={{18,-3,14},{35,4,20},{4,-16,70},{24,3,10}};
    
    public AlamacenarDatosTabla(byte m,byte n){
        matriz= new Object[m][n];
        i=-1;j=-1;
        
    }
    public boolean matrizVacia(){
        return(i==-1 && j==-1);
    }
    public boolean espacioMatriz(){
        return(i<matriz.length && j<matriz[0].length);
    }
    public void leerFilas(){
        byte k,l=0; 
        if(espacioMatriz()){
            
            for( k=(byte)(i+1);k<matriz.length;k++){
                for( l=(byte)(j+1);l<matriz[0].length;l++){
                    matriz[k][l]=Tools.leerInt("Dato a insertar");
                }
            }
            i=k;j=l;
        }
    }
    public String verMatriz(){
        
    String cad="";
        for(byte k=0;k<matriz.length;k++){
                for(byte l=0;l<matriz[0].length;l++){
                    cad+="[ "+matriz[k][l]+" ]";
                }
                cad+="\n";
    }
        return cad;
    
    }
    public int sumaDiagPrinc (){
    int suma=0;
    for(int i=0;i<matriz.length;i++){
        suma+=(int)matriz[i][i];
    }
    return suma;
    }
    
    public String verMatrizOctal(){
        
    String cad="";
        for(byte k=0;k<matriz.length;k++){
                for(byte l=0;l<matriz[0].length;l++){
                    cad+="[ "+matriz[k][l]+" ] "+" ( "+Metodos.Octal((int) matriz[k][l])+" ) ";
                }
                cad+="\n";
    }
        return cad;
    }
    
    public String ordenaBurbuja(){
        int q = matriz2.length;
        int n =matriz2[0].length;
        for (int i=0;i<q;i++)
            for (int h=0;h<n;h++)
                for (int g=0;g<4;g++)
                    for (int f=0;f<n;f++){
                        if(matriz2[i][h]>=matriz2[g][f])
                            matriz2[i][h] = matriz2[i][h];
                        else {
                            int temp = matriz2[g][f];
                            matriz2[g][f]= matriz2[i][h];
                            matriz2[i][h] = temp;
                        }
                    }
       String resultado = "";
        for (int i = 0; i < q; i++) {
        for (int h = 0; h < n; h++) {
            resultado += matriz2[i][h] + " ";
        }
        resultado += "\n";
    }

    return resultado;
}

    public String verMatriz(int a){

        String cad="";
        for(byte k=0;k<matriz2.length;k++){
            for(byte l=0;l<matriz2[0].length;l++){
                cad+="[ "+matriz2[k][l]+" ]";
            }
            cad+="\n";
        }
        return cad;
    }
    public String imprimirTriangularInferior() {
    int tamaño = matriz.length;
    String trianInfe = "";

    for (int i = 0; i < tamaño; i++) {
        for (int j = 0; j <= i; j++) {
            trianInfe += (matriz[i][j] + " ");
        }
        trianInfe += "\n";
    }
    return trianInfe;
}

public String verMatrizTrianInfe() {
    int tamaño = matriz.length;
    String cad = "";

    for (int i = 0; i < tamaño; i++) {
        for (int j = 0; j < tamaño; j++) {
            if (j <= i) {
                cad += (matriz[i][j] + " ");
            } else {
                cad += "  "; 
            }
        }
        cad += "\n";
    }
    return cad;
}
}
        
            
            
        
               
