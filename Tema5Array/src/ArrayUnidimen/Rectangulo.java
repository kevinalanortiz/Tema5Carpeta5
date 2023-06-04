package ArrayUnidimen;

public class Rectangulo {
    private double Base;
    private double Altura;
    private double Area;
    private double Perimetro;
  
    public Rectangulo(){}
    
    public Rectangulo (double Base,double Altura){
        
        this.Area=CalArea();
        this.Perimetro=CalPerimetro();
        this.Base=Base;
        this.Altura=Altura;
        
    }
    public double getArea() {
        
        return Area;
    }
    
    public double getPerimetro() {
        
        return Perimetro;
    }
    public double getBase(){
        return Base;
    }
    public void setBase(double Base) {
        this.Base=Base;
        
    }
    public double getAltura(){
        return Base;
    }
    public void setAltura(double Altura) {
        this.Altura=Altura;
        
    }

    @Override
    public String toString() {
        return "Rectangulo{ " + "Base=" + Base + ", Altura=" + Altura 
                + ", Area=" + CalArea() + ", Perimetro=" + CalPerimetro() + '}';
    }

    public double CalArea(){
        
        return (Altura*Base);
    }
    public double CalPerimetro(){
        
        return (2*Altura+Base);
    }
}