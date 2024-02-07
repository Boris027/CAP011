package Ejercicio5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ejercicio5 {
    
    public static void crearcomentarios(String comentario,String nombrecrear){
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter(nombrecrear));
            BufferedReader b1=new BufferedReader(new FileReader(comentario));

            String salir="";

            while(salir!=null){
                salir=b1.readLine();

                if(salir!=null){
                    bw.write(salir+"\n");
                }
            }

            bw.close();
            b1.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void Limpiar(String comentario,String nuevo){
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter(nuevo));
            BufferedReader b1=new BufferedReader(new FileReader(comentario));

            String salir="";

            while(salir!=null){
                salir=b1.readLine();

                if(salir!=null){
                    bw.write(salir+"\n");
                }
            }

            bw.close();
            b1.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }



    public static void main(String[] args) {
        //clona el ejercicio del cual se pone el nombre y esta en la ruta principal del programa de java
        //se clona en el archivo con el nombre que se indica

        crearcomentarios("Ejercicio4.java","hola.java");

        //primer comentario indica el archivo que se quiere coger y limpiar y el segundo indica el nombre del nuevo archivo
        Limpiar("hola.java", "holav2.java");
    }


}
