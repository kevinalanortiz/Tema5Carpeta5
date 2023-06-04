package TestPrueba;

import ArrayBidimen.AlamacenarDatosTabla;
import EntradaSalida.Tools;
import java.util.Random;

public class TestAlmacenarDatosTabla {
    public static void main(String [] args){
        
         menuArrayMatriz("Aleatorio,Leer,Suma Principal,Octal,Constantes,Ordenar,Triangulo Inferior,Imprimir,Salir");
        
    }
    public static void menuArrayMatriz(String menu){
        AlamacenarDatosTabla mat=new AlamacenarDatosTabla((byte)4,(byte)4);
        
        int matriz2[][]={{18,-3,14},{35,4,20},{4,-16,70},{24,3,10}};
        int dato;
        String sel= "",cad=" ";
        
        do{
            sel=Tools.boton(menu);
            switch(sel){
                case "Aleatorio":
                    Random aleatorio=new Random();
                    dato=aleatorio.nextInt(21);
                    
                break;
                case "Leer":
                    if(!mat.espacioMatriz())Tools.salidaError("Matriz llena");
                    else{mat.leerFilas();
                    Tools.imprimePantalla("Datos almacenados:\n"+mat.verMatriz());}
                break;
                case "Suma Principal":
                    Tools.imprimePantalla("Datos almacenados:\n"+mat.sumaDiagPrinc()+"\n"+mat.verMatriz());
                break;
                case "Octal":
                    Tools.imprimePantalla("Datos almacenados:\n"+mat.verMatrizOctal());
                break;    
                case "Constantes":
                    Tools.imprimePantalla("Datos Almacendos:\n" + mat.verMatriz(1));
                    break;
                case "Ordenar":
                        Tools.imprimePantalla("Datos Almacendos:\n" + mat.ordenaBurbuja()+"\n"+ mat.verMatriz(1));
                    break;
                case "Triangulo Inferior":
                    Tools.imprimePantalla("Datos Almacenados:\n" + mat.imprimirTriangularInferior()+"\n"+ mat.verMatrizTrianInfe());
                    break;
                case "Imprimir": 
                    if(mat.matrizVacia())Tools.salidaError("Array Vacio..insertar datos");
                    else Tools.imprimePantalla("Datos Almacendos:\n"+ mat.verMatriz());
                break;
                case "Salir": break;  
                    
            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }
}