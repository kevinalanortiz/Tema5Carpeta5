package ArrayUnidimen;

import EntradaSalida.Tools;
import ArrayUnidimen.IMC;

public class ArrayObjetos2 {
    
    private IMC datos[];
    private byte i;
    
    public ArrayObjetos2() {
    }
    
    public ArrayObjetos2(byte tam) {
        datos = new IMC[tam];
        i = -1;
    }
    
    public boolean arrayVacio() {
        return i == -1;
    }
    
    public boolean espacioArray() {
        return i < datos.length - 1;
    }
    
    public IMC crearObjeto() {
        IMC per = new IMC();
        
        per.setNomPer(Tools.leerString("Nombre"));
        per.setEdadPer(Tools.leerByte("Edad"));
        per.setSexPer(Tools.leerChar("Género"));
        per.setAlturaPer(Tools.leerFloat("Altura"));
        per.setPesoPer(Tools.leerFloat("Peso"));
        
        return per;
    }
    
    public void insetardatoLectura() {
        if (espacioArray()) {
            i++;
            datos[i] = crearObjeto();
        } else {
            Tools.salidaError("Array Lleno");
        }
    }
    
    public String imprimeDatosArray() {
        String cad = "";
        for (byte j = 0; j <= i; j++) {
            cad += j + "[" + datos[j].toString() + "]\n";
        }
        return cad;
    }
    
    public void ordenaBurbuja() {
        IMC aux = new IMC();
        byte k, l;
        for (k = 0; k < datos.length - 1; k++) {
            for (l = (byte) (k + 1); l < datos.length; l++) {
                if (datos[k].getNomPer().compareTo(datos[l].getNomPer()) > 0) {
                    aux = datos[k];
                    datos[k] = datos[l];
                    datos[l] = aux;
                }
            }
        }
    }
    
    public void mostrarEstadisticas() {
        int totalMasculinos = 0;
        int totalFemeninos = 0;
        int totalBajoPeso = 0;
        int totalSobrepeso = 0;
        int totalObesidad = 0;
        int totalObesidadSevera = 0;

        for (int j = 0; j <= i; j++) {
            IMC persona = datos[j];

            if (persona.getSexPer() == 'M') {
                totalMasculinos++;
            } else if (persona.getSexPer() == 'F') {
                totalFemeninos++;
            }

            String estadoPeso = persona.getEdoPesoPer();
            if (estadoPeso.equals("Bajo peso")) {
                totalBajoPeso++;
            } else if (estadoPeso.equals("Sobrepeso")) {
                totalSobrepeso++;
            } else if (estadoPeso.equals("Obesidad")) {
                totalObesidad++;
            } else if (estadoPeso.equals("Obesidad severa")) {
                totalObesidadSevera++;
            }
        }
        
        Tools.imprimePantalla("Estadísticas:\n" +
                 "\nTotal de personas del género masculino: " + totalMasculinos+
                "\nTotal de personas del género femenino: " + totalFemeninos+
                "\nTotal de personas bajo de peso: " + totalBajoPeso+
                "\nTotal de personas con sobrepeso: " + totalSobrepeso+
                "\nTotal de personas con obesidad: " + totalObesidad+
                "\nTotal de personas con obesidad severa: " + totalObesidadSevera);
    }
    public void consultaIndividual() {
    byte indice = Tools.leerByte("Ingrese el índice de la persona a consultar (0-" + (datos.length - 1) + "): ");
    
    if (indice >= 0 && indice <= i) {
        IMC persona = datos[indice];
        
        Tools.imprimePantalla("\nDatos de la persona en la posición " + indice + ":\n" +
                "Nombre: " + persona.getNomPer() + "\n" +
                "Género: " + persona.getSexPer() + "\n" +
                "Edad: " + persona.getEdadPer() + "\n" +
                "Altura: " + persona.getAlturaPer() + " cm\n" +
                "Peso: " + persona.getPesoPer() + " kg\n" +
                "Estado de peso: " + persona.getEdoPesoPer() + "\n" +
                "IMC: " + persona.getImcPer());
    } else {
        Tools.imprimePantalla("Índice inválido.");
        }
    }
}

  
