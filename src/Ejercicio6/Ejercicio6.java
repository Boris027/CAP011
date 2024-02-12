package Ejercicio6;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class Ejercicio6 {

    public static String leerarchivo(String nombrearchivo){
        String devolver="";
        try {

            BufferedReader br=new BufferedReader(new FileReader(nombrearchivo));
            String raro="";
            while(raro!=null){
                raro=br.readLine();

                if(raro!=null){
                    devolver+=raro+"\n";
                }

            }

        } catch (Exception e) {
            // TODO: handle exception
        }
        

        return devolver;
    }


    public static int contarpalabras(String texto, String palabra){

        String split[]=texto.split(palabra);


        return split.length-1;
    }
    
    public static void main(String[] args) {
        System.out.print("Que palabra quieres saber el numero de ocurrencias?: ");
        String palabra=System.console().readLine();
        System.out.print("Digame la ruta del archivo: ");
        String archivo=System.console().readLine();
        String texto=leerarchivo(archivo);
        System.out.println(contarpalabras(texto, palabra));



    }
    

}
