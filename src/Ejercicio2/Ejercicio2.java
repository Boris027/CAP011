package Ejercicio2;
import java.io.BufferedReader;
import java.io.FileReader;

public class Ejercicio2 {
    

    public static void main(String[] args) {
        

        try {
            
            BufferedReader bw=new BufferedReader(new FileReader("primos.dat"));

            String salida="";


            while(salida!=null){

                salida=bw.readLine();

                String salida2="";
                if(salida!=null){
                    salida2=salida;
                }
                System.out.println(salida2);

            }

            bw.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

        

    }


}
