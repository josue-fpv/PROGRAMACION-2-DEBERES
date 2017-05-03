
package fundamentos2;

//Variables o metodos de clases son static
//Variables o metodos de instancia no son static.
//Para acceder a un metodo o variable static es : NombreClass.Metodo
// o NombreClase.Variable

class CuentaBancaria{
      public int saldo;
       public static int numero=0;
    }

public class Variables1 {

    public static void sumarSaldo(CuentaBancaria cta){
             cta.saldo +=10;
        }
         
        public static void sumarSaldo(int saldo){
            saldo +=10;
        }   
        
        //Crear minio 10 objeto de CuebtaBancaria, probar y probar 

    public static void main(String[] args) {
        
        
        
        CuentaBancaria ct1= new CuentaBancaria();
        CuentaBancaria ct2=ct1;
        ct1.saldo=1000;
        
        
        sumarSaldo(ct1);
        sumarSaldo(ct2);
        System.out.println("saldo de cuenta 1:" +ct1.saldo);//imprime 1020
        System.out.println("saldo de cuenta 2:"+ct2.saldo);//imprime 1020
        
        ct2.saldo=250;
        CuentaBancaria ct3 = ct1;
        sumarSaldo(ct3);
        System.out.println("saldo de cuenta 3:" +ct3.saldo);//imprime 260
        
        
        CuentaBancaria ct4=ct2;
                
        ct4.saldo=600;
        sumarSaldo(ct4);
        sumarSaldo(ct4);
        sumarSaldo(ct4);
        sumarSaldo(ct4);
        System.out.println("saldo de cuenta 4:"+ct4.saldo);// imprime 640
        
        CuentaBancaria ct5=ct1;
        ct5.saldo=500;
        System.out.println("saldo de cuenta 5:"+ct5.saldo);// imprime 500
        
        CuentaBancaria ct6=ct5;
        ct6.saldo=-800;
        sumarSaldo(ct6);
        sumarSaldo(ct5); 
        System.out.println("saldo de cuenta 6:"+ct6.saldo);// imprime -770
        
        CuentaBancaria ct7=ct6;
        ct7.saldo=(900*14)/100;
        sumarSaldo(ct7);
        sumarSaldo(ct7);
        System.out.println("saldo de cuenta 7:"+ct7.saldo);// imprime 146
        
        CuentaBancaria ct8=ct2;
        ct8.saldo=200*5;
        sumarSaldo(ct8);
        sumarSaldo(ct8);
        System.out.println("saldo de cuenta 8:"+ct8.saldo);// imprime 1020
        
        CuentaBancaria ct9=ct1;
        ct9.saldo=350-155;
        sumarSaldo(ct9);
        sumarSaldo(ct9);
        sumarSaldo(ct8);
        sumarSaldo(ct8);
        System.out.println("saldo de cuenta 9:"+ct9.saldo);// imprime 235
        
        CuentaBancaria ct10=ct9;
        ct10.saldo=(350-155)/5;
        sumarSaldo(ct10);
        sumarSaldo(ct9);
        System.out.println("saldo de cuenta 10:"+ct10.saldo);// imprime 59
    }
    
}
