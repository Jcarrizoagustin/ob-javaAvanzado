package OrganizacionDeClases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ficheros {

    public static void leerFichero(String path) throws FileNotFoundException {
        File file = new File(path);
        if(!file.canRead()){
            throw new ArchivoNoEncontradoException("El archivo : "+path +" no fue encontrado");
        }
        FileReader reader = new FileReader(file);
        System.out.println(file);
    }
}
