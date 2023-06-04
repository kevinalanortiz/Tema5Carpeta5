package ArrayUnidimen;

import EntradaSalida.Tools;

public class Metodos {
    public static boolean esPrimo(int numero)
    {
        if(numero<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(numero);i++){
            if(numero%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean numArmstrong(int valor){
        
        int aux=valor, sum=0;
        
        while(aux>0){
            sum+=Math.pow(aux%10, 3);
            aux/=10;
        }
        
        return(sum== valor);
    }
    public static void sumaDigitos(int valor)
	{
		int suma=0;
		while(valor!=0)
		{
			suma+=valor%10;
			valor/=10;
		}
		Tools.imprimePantalla("Suma de digitos:"+suma);
	}
    public static String cliente(String nCliente){

        return(nCliente);
    }

    public static double montoAdeudo(double consumo){


        double adeudo = 0;
        if(consumo <100)
            adeudo = consumo * 40;
        else
            if (consumo>=100 && consumo<500)
                adeudo = (consumo - 100) * 60 + 4000;
            else
                if (consumo>=500 && consumo<=1000)
                    adeudo = (consumo - 499) * 80 + 33940;
                else
                    if (consumo>1000)
                        adeudo = (consumo - 1000) * 100 + 113940;
        if (adeudo > 600)
            adeudo = (adeudo* .02) + adeudo;
        return(adeudo);
    }
    public static String clienteX(String nEstudiante){

        return(nEstudiante);
    }

    public static double calculaAdeudo(double prom, String cat){
        double adeudo = 0;
        int pago = 0;

        if(cat.equalsIgnoreCase("A"))
            pago = 1200;
        else
            if(cat.equalsIgnoreCase("B"))
                pago = 1000;
            else
                if(cat.equalsIgnoreCase("C"))
                    pago = 900;
                else
                    if(cat.equalsIgnoreCase("D"))
                        pago = 600;
        if(prom >80 && prom<=100)
            adeudo = pago- (pago*.15);
        else
            if(prom >75 && prom<=80)
                    adeudo=pago - (pago*.08);

        return(adeudo);
    }
    public static boolean calculaPerfecto(int numero){

        boolean nPerfecto = false;
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma = suma + i;
            }
        }
        if(suma==numero)
            nPerfecto = true;

        return(nPerfecto);
    }
    public static int multiplicacionRusa(int num1, int num2){
        int multiplicacion=0;
        while(num1!=0){
            if(num1 % 2 != 0){
                multiplicacion = multiplicacion + num2;
            }
           
            num1 =num1 / 2;
            num2 = num2 * 2;System.out.println(num1+"  "+num2+"\n");
        }
        return multiplicacion;
    }
    public static String filasDigitos(int filas){
        String calculo = "";
        for(int x=1;x<=filas;x++){

            for(int y=0;y<=((x-1)+y);x++){
                if(y%2==1){
                    calculo += y + " ";
                }

            }
            calculo+="\n";

        }
        return calculo;
    }
    public static String cuentaVocales(String cadena){
        byte a=0,e=0,i=0,o=0,u=0;
        byte f=0;
        String cad="";
        while(f<cadena.length()){
            switch(cadena.charAt(f)){
                
                case 'A' :   
                case 'a' : a++;break;
                case 'E' :   
                case 'e' : e++;break;
                case 'I' :   
                case 'i' : i++;break;
                case 'O' :   
                case 'o' : o++;break;
                case 'U' :   
                case 'u' : u++;break;    
            }
            f++;
          
        }
        cad="a="+ Tools.imprimeFrecuencia(a)+"\n"+"e="+ Tools.imprimeFrecuencia(e)+"\n"+
                "i="+ Tools.imprimeFrecuencia(i)+"\n"+"o="+ Tools.imprimeFrecuencia(o)+"\n"+
                "u="+ Tools.imprimeFrecuencia(u)+"\n";
        return cad;
                
    }
    public static int numeros(int num1,int num2, char sel){
        
        int result=0;
        
        switch(sel){
            
            case '+' : result=num1+num2;break;      
            case '-' : result=num1-num2;break;
            case '*' : result=num1*num2;break;
            case '/' : result=num1/num2;break;
            case '%' : result=num1%num2;break;
            
        
        }   
       
        return (result);
      
    }
    public static double binario(String numero){
        int x = 0, digito= 0;
        double binario=0;
        int num = Tools.leerInt(numero);
        while(num!=0){
            digito = num%2;
            binario = binario + digito*Math.pow(10, x);
            x++;
            num /=2;
        }
        
        return binario;
    }
    public static int mayorNum(int dato1,int dato2,int dato3){
        int a=Math.max(dato1,dato2);
        Tools.imprimePantalla("El mayor : "+(Math.max(a,dato3)));
        return a;
    }
    public static boolean esPalindromo(String palabra)
    {
        palabra = palabra.toLowerCase().replace(" ", "").replace(",","");
        int cont = 0, inverso = palabra.length()-1;
        boolean palindromo = false;

        while ((cont<inverso) && (!palindromo)){
            if (palabra.charAt(cont) == palabra.charAt(inverso)){
                cont++;
                inverso--;
            } else {
                palindromo = true;
            }
        }
        return palindromo;
    }
    public static void sumParImpar(int cont)
    {
        int i=1, sImpares=0, sPares=0;
        while(i<=cont){
            if(i%2==0)
                sPares+=i;
            else
                sImpares+=i;
            i++;
        }
        Tools.imprimePantalla("La suma de los numeros pares es de "+ sPares + 
                " y la suma de los numeros impares es de " + sImpares);
    }
    public static int numProducto(int num1, int num2)
    {
        int suma=0;
        for(int i =0; i<num2;i++)
            suma+=num1;

        return suma;
    }
    public static int contadorDigitos(int val){
        int s=0;
        while(val>0){
            s++;
            val/=10;
        }
        return s;
    }
    public static void contNumeros(int num1, int num2, int num3)
    {
        if(num1==num2 && num2==num3)
            Tools.imprimePantalla("Los tres numeros son iguales");
        else if(num1==num2 && num3>num1)
            Tools.imprimePantalla("Los primeros dos numeros son iguales y el numero " + num3 + " es el mayor");
        else if(num1==num3 && num2>num1)
            Tools.imprimePantalla("El primer y tercer numero son iguales y el numero " + num2 + " es el mayor");
        else if(num3==num2 && num1>num2)
            Tools.imprimePantalla("El segundo y tercer numero son iguales y el numero "+ num1 + " es el numero mayor");
        else if (num1>num2 && num2>num3)
            Tools.imprimePantalla("El numero " + num1 + " es el mayor");
        else if (num1<num2 && num2>num3)
            Tools.imprimePantalla("El numero " + num2 + " es el mayor");
        else if (num1<num2 && num2<num3)
            Tools.imprimePantalla("El numero " + num3 + " es el mayor");
    }
    public static String Frecuencia(byte n){
        String cad=" ";
        for(int i=1;i<=n;i++){
            cad+="*";
        }
        return cad;
        
    }
    public static String Octal(int d){
        String octal=" ";int mod;int div=d;
        while(div>=1){
        mod=div%8;
        div=div/8;
        octal=mod+octal;
        }
                return octal;
                
    }
    
    
    
}