package TestPrueba;


import EntradaSalida.Tools;
import ArrayUnidimen.ArrayObjetos;

public class TestAlmacenarDatos2 {
    public static void main(String [] args){
        
        menuArrayObjetos("Leer,Burbuja,Imprimir,Salir");
        
    }
    public static void menuArrayObjetos(String menu){
        ArrayObjetos objetos=new ArrayObjetos((byte)5);
        
        int dato;
        String sel= "",cad=" ";
        
        do{
            sel=Tools.boton(menu);
            switch(sel){
               
                case "Leer":
                    objetos.insetardatoLectura();
                    Tools.imprimePantalla("Datos Almacenados:\n"+objetos.imprimeDatosArray());
                break;
                case "Burbuja":
                    
                case "Imprimir": 
                    Tools.imprimePantalla("Datos almacenados:\n"+objetos.imprimeDatosArray());
                    break;
                    
                case "Salir": break;  
                    
            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }
}

