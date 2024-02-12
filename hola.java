
package Ejercicio4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;




aabb

noches

dias
public class Ejercicio4 {

    public static void desordenadas(){
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter("Palabras.txt"));
            bw.write("Zoro"+"\n");
            bw.write("Boris"+"\n");
            bw.write("Nacho"+"\n");
            bw.write("Matilda"+"\n");
            bw.close();
        } catch (Exception e) {
        }
    }

    public static ArrayList<String> leer(){
        ArrayList<String> guardar=new ArrayList<>();

        try {
            BufferedReader b1=new BufferedReader(new FileReader("Palabras.txt"));

            String palabra="";

            while(palabra!=null){

                palabra=b1.readLine();
                if(palabra!=null){
                    guardar.add(palabra);
                }
            }

            b1.close();

        } catch (Exception e) {
        }
        

        return guardar;
    }

    public static ArrayList<String> ordenar(ArrayList<String> lista){

        Collections.sort(lista);
        
        return lista;
    }

    public static void Creararchivo(ArrayList<String> lista){
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter("Palabras_sort.txt"));

            for(String a:lista){
                bw.write(a+"\n");
            }
            bw.close();
        } catch (Exception e) {
        }
    }


    public static void main(String[] args) {
        desordenadas();
        ArrayList<String> lectura=leer();
        lectura=ordenar(lectura);
        Creararchivo(lectura);

        
    }

}
