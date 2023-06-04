package ArrayUnidimen;

import EntradaSalida.Tools;

public class ArrayObjetos {
    
    private Rectangulo datos[];
    private byte i;
    
    public ArrayObjetos(){}
    public ArrayObjetos(byte tam){
        datos=new Rectangulo[tam];
        i=-1;
    }
    public boolean arrayVacio(){
        return i==-1;
    }
    public boolean espacioArray(){
        return i<datos.length-1;
    }
    public Rectangulo crearObjeto(){
        Rectangulo rec=new Rectangulo();
        
        rec.setAltura(Tools.leerDouble("Altura del rectangulo"));
        rec.setBase(Tools.leerDouble("Base del rectangulo"));
        return rec;
    }
    public void insetardatoLectura(){
        if(espacioArray())
        {
            i++;
            datos[i]=crearObjeto();
        }else
            Tools.salidaError("Array Lleno");
        }
    public String imprimeDatosArray(){
        
        String cad=" ";
        for(byte j=0;j<=i;j++){
            cad+=j+"["+datos[j].toString()+"]\n";
        }
        return cad;
    }
    public void ordenaBurbuja(){
        Rectangulo aux=new Rectangulo();
        byte k,l;
        for(k=0;k<datos.length-1;k++){
            for(l=(byte) (k+1);l<datos.length;l++){
                if(datos[k].getArea()>datos[l].getArea()){
                    aux=datos[k];
                    datos[k]=datos[l];
                    datos[l]=aux;
                }
            }
        }
    }
    
    
}
