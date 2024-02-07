package Ejercicio3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;



public class Ejercicio3 {
    public static void crearnoprimos(){
        try {


            BufferedWriter w1=new BufferedWriter(new FileWriter("noprimos.dat"));


            for(int i=1;i<=500;i++){

                int contador=0;

                for(int j=1;j<=i;j++){
                    
                    if(i%j==0){
                        contador+=1;
                    }

                }

                if(contador!=2){
                    
                    w1.write(i+"\n");
                }

            }

            w1.close();



        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void crearprimos(){
        try {


            BufferedWriter w1=new BufferedWriter(new FileWriter("primos.dat"));


            for(int i=1;i<=500;i++){

                int contador=0;

                for(int j=1;j<=i;j++){
                    
                    if(i%j==0){
                        contador+=1;
                    }

                }

                if(contador==2){
                    
                    w1.write(i+"\n");
                }

            }

            w1.close();



        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public static void main(String[] args) {
        crearprimos();
        crearnoprimos();
        
        try {
            BufferedReader b1=new BufferedReader(new FileReader("primos.dat"));
            BufferedReader b2=new BufferedReader(new FileReader("noprimos.dat"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("Ejercicio3.txt"));

            String palabra1="";
            String palabra2="";


            while (palabra1!=null || palabra2!=null) {
                
                palabra1=b1.readLine();
                if(palabra1!=null){
                    bw.write(palabra1+"\n");
                }
                palabra2=b2.readLine();
                if(palabra2!=null){
                    bw.write(palabra2+"\n");
                }


            }

            b1.close();
            b2.close();
            bw.close();


        } catch (Exception e) {
            // TODO: handle exception
        }





    }



}
