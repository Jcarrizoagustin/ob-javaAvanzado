package OrganizacionDeClases;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String [] args){
        //Manejando excepcion personalizada extendida de ArithmeticException.
        try {
            int resultado = DivisionPorCero.dividir(5,0);
            System.out.println(resultado);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        //ArrayIndexOutOfBoundsException
        try {
            String [] arg = {"Hla","Adios","Chau"};
            RecorrerArray.obtenerObjetoDadaUnaPosicion(arg,4);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        try {
            Ficheros.leerFichero("D:\\Projects\\readme.txt");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
