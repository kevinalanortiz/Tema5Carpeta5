//Arreglos homogeneos
package ArrayUnidimen;

import ArrayUnidimen.Metodos;
import EntradaSalida.Tools;

public class AlmacenarDatos {
    private Object datos[];
    private byte i;//subindice
    
    public AlmacenarDatos(int max){
        datos=new Object[max];
        i=-1;//para indicar que el array esta vacio
    }
    public boolean arrayVacio(){
        return(i==-1);
    }
    public boolean arrayEspacio(){
        return(i<datos.length-1);
    }
    public void insetardatoLectura(Object dato){
        if(arrayEspacio())
        {
            i++;
            datos[i]=dato;
        }else
            Tools.salidaError("Array Lleno");
        }
    public String imprimeDatosArray(){
        
        String cad=" ";
        for(byte j=0;j<=i;j++){
            cad+=j+"["+datos[j]+"]\n";
        }
        return cad;
    }
    public String imprimePrimos(){
        String cad=" ";
        for (byte j=0;j<=i;j++){
            if(Metodos.esPrimo((int)datos[j]))cad+=j+" ["+datos[j]+"]\n";
        }
        return cad;
    }
    public int convertirABinario(){
        
        int cad = (int)datos[i]%2;
        datos[i]=(int)datos[i]/2;
        return cad;
    }
    public String imprimeFrecuencia() {
        String cad = "";
        byte n=0;
        for (int i=1;i<n;i++) {
            cad += "*";
        }
        return cad;
    }
    public String imprimeTriangulo(){
        String cad = "";
        for (byte j = 0; j <= i; j++) {
            cad += j + " [" + datos[j] + "]: " + Metodos.filasDigitos((int) datos[j]) + "\n";
        }
        return cad;
    }
    public String imprimesumaDigitos(){
        String cad=" ";
        for (byte j = 0; j <= i; j++){
            Metodos.sumaDigitos((int)datos[j]);
            cad+=j+" ["+datos[j]+"]\n";
        }
         return cad;
    }
}

