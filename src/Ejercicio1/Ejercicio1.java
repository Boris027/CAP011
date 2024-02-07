package Ejercicio1;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Ejercicio1{

    public static void main(String[] args) {
        
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


}