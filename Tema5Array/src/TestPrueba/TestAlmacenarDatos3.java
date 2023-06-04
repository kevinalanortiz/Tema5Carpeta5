package TestPrueba;


import EntradaSalida.Tools;
import ArrayUnidimen.ArrayObjetos2;

public class TestAlmacenarDatos3 {
    public static void main(String [] args){
        
        menuArrayObjetos("Leer,Burbuja,Imprimir,Estadísticas,Consulta,Salir");
        
    }
    public static void menuArrayObjetos(String menu){
        ArrayObjetos2 objetos=new ArrayObjetos2((byte)5);
        
        int dato;
        String sel= "",cad=" ";
        
        do{
            sel=Tools.boton(menu);
            switch(sel){
               
                case "Leer":
                    objetos.insetardatoLectura();
                    break;

                case "Burbuja":
                    objetos.ordenaBurbuja();
                    Tools.imprimePantalla("Datos ordenados por nombre."+objetos.imprimeDatosArray());
                    break;

                case "Imprimir":
                    Tools.imprimePantalla("Datos almacenados:\n" + objetos.imprimeDatosArray());
                    break;

                case "Estadísticas":
                    objetos.mostrarEstadisticas();
                    break;

                case "Consulta":
                    objetos.consultaIndividual();
                    break;

                case "Salir":
                    break;
            }
        } while (!sel.equalsIgnoreCase("Salir"));
    }
}
                    
           