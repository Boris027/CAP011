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

            boolean escribir=true;
            boolean escribirraro=false;
            boolean palabraescribir=true;
            while(salir!=null){
                escribir=true;
                salir=b1.readLine();

                if(salir!=null){

                    String palabras[]=salir.split("//");
                    if(palabras.length>1){
                        escribir=false;
                    }

                    
                    for(int i=0;i<salir.length();i++){
                        if(i==salir.length()-1){
                            break;
                        }
                        char primerCaracter = salir.charAt(i);
                        char segundocaracter=salir.charAt(i+1);
                        String palabrasw=primerCaracter+""+segundocaracter;

                        

                        if(palabrasw.equals("/*")){

                            for(int j=0;j<i;j++){
                                bw.write(salir.charAt(j));
                            }
                            

                            escribirraro=true;
                        }
                        


                    }


                    
                    

                    if(escribir==true && escribirraro==false){
                        bw.write(salir+"\n");
                    }

                    
                    if(escribirraro){
                        for(int i=0;i<salir.length();i++){
                            if(i==salir.length()-1){
                                break;
                            }
                            char primerCaracter = salir.charAt(i);
                            char segundocaracter=salir.charAt(i+1);
                            String palabrasw=primerCaracter+""+segundocaracter;
    
                            
    
                            if(palabrasw.equals("*/")){
                                escribirraro=false;
                                String salir2="";
                                if(i+2>salir.length()){
                                    break;
                                }
                                for(int j=i+2;j<salir.length();j++){
                                    salir2+=salir.charAt(j)+"";
                                }
                                bw.write(salir2+"\n");
                            }
                            
                            if(escribirraro==false){
                                
                            }
    
                        }
                    }

                    if(escribirraro){
                        bw.write("\n");
                    }

                    
                    
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
        //primer comentario indica el archivo que se quiere coger y limpiar y el segundo indica el nombre del nuevo archivo

        crearcomentarios("Ejercicio4.java","hola.java");

        
    }


}
