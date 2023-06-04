package TestPrueba;

import java.util.Random;
import EntradaSalida.Tools;
import ArrayUnidimen.AlmacenarDatos;

public class TestAlmacenarDatos {
    public static void main(String [] args){
        
        menuArray("Aleatorio,Leer,Constantes,Primos,Triangulo,Frecuencia,sumaDigitos,Imprimir");
        
    }
    public static void menuArray(String menu){
        AlmacenarDatos dat=new AlmacenarDatos((byte)10);
        
        int dato;
        String sel= "",cad=" ";
        
        do{
            sel=Tools.boton(menu);
            switch(sel){
                case "Aleatorio":
                    Random aleatorio=new Random();
                    dato=aleatorio.nextInt(30);
                    dat.insetardatoLectura(dato);
                    Tools.imprimePantalla("Datos almacenados:\n"+dat.imprimeDatosArray());
                break;
                case "Leer":
                    dato=Tools.leerInt(Integer.MIN_VALUE+">Dar un Entero <"+Integer.MAX_VALUE);
                    dat.insetardatoLectura(dato);
                    Tools.imprimePantalla("Datos almacenados:\n"+dat.imprimeDatosArray());
                break;
                case "Constantes":
                    int a[]={35,-12,41,82,35,247,-71};
                    Tools.imprimePantalla("Datos almacenados:\n"+dat.imprimeDatosArray());
                break;
                case "Primos":
                    if(dat.arrayVacio())Tools.salidaError("Array Vacio..insertar datos");
                    cad=dat.imprimePrimos();
                break;
               case "Triangulo": 
                    if(dat.arrayVacio())Tools.salidaError("Array Vacio..insertar datos");
                    else cad=dat.imprimeTriangulo();
                    break; 
                case "Frecuencia": 
                    if(dat.arrayVacio())Tools.salidaError("Array Vacio..insertar datos");
                    else cad=dat.imprimeFrecuencia();
                    break;  
                case "sumaDigitos": 
                    if(dat.arrayVacio())Tools.salidaError("Array Vacio..insertar datos");
                    else cad=dat.imprimesumaDigitos();
                    break;  
                case "Imprimir": 
                    if(dat.arrayVacio())Tools.salidaError("Array Vacio..insertar datos");
                    else Tools.imprimePantalla("Datos almacenados:\n"+dat.imprimeDatosArray()+"Numeros Primos:\n"+dat.imprimePrimos());
                break;
                case "Salir": break;  
                    
            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }
}

