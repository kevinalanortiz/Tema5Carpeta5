package ArrayUnidimen;

public class IMC {
	
		private static int Folio=1000;
		private  String nomPer;
		private byte edadPer;
		private char sexPer;
		private float pesoPer;
		private float alturaPer;
		private String edoPesoPer;
		private float imcPer;
		
	public IMC(){}
        
	public IMC(String nomPer, byte edadPer, char sexPer, float pesoPer, float alturaPer) {
			
		    this.nomPer = nomPer;
			this.edadPer = edadPer;
			this.sexPer = sexPer;
			this.pesoPer = pesoPer;
			this.alturaPer = alturaPer;
			this.edoPesoPer=edoPeso();
			this.imcPer=calcularIMC();
			Folio++;
		}


	


	public static int getFolio() {
		return Folio;
	}

    

	public String getNomPer() {
		return nomPer;
	}


	public byte getEdadPer() {
		return edadPer;
	}


	public char getSexPer() {
		return sexPer;
	}


	public float getPesoPer() {
		return pesoPer;
	}


	public float getAlturaPer() {
		return alturaPer;
	}


	public String getEdoPesoPer() {
		return edoPesoPer;
	}


	public float getImcPer() {
		return imcPer;
	}
	
	
	public void setNomPer(String nomPer) {
		this.nomPer = nomPer;
	}



	public void setEdadPer(byte edadPer) {
		this.edadPer = edadPer;
	}


	public void setSexPer(char sexPer) {
		this.sexPer = sexPer;
	}

	public void setPesoPer(float pesoPer) {
		this.pesoPer = pesoPer;
	}


	public void setAlturaPer(float alturaPer) {
		this.alturaPer = alturaPer;
	}


	public float calcularIMC () {
		return  (pesoPer/ (alturaPer/100));
	}

    @Override
    public String toString() {
        return "IMC{" + "nomPer=" + nomPer + ", edadPer=" + edadPer + ", sexPer=" + sexPer + ", pesoPer=" + pesoPer + ", alturaPer=" + alturaPer + ", edoPesoPer=" + edoPesoPer + ", imcPer=" + imcPer + '}';
    }
	
   public String edoPeso() {
	
		if(imcPer<18.5) return("Bajo peso");
		else if (imcPer>=18.5&& imcPer<=24.9) return("peso normal");
		
		else if (imcPer>=25.0 && imcPer<=29.9) return("Sobrepeso");
		
		else if (imcPer>=30.0 && imcPer<=34.9)  return("Obesidad");
		else if (imcPer>=35.0 && imcPer<=39.0)  return("Obesidad severa");
	    return ("Imc fuera de rango");
   }
   
}
