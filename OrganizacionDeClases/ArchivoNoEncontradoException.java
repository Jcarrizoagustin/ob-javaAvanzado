package OrganizacionDeClases;

import java.io.FileNotFoundException;

public class ArchivoNoEncontradoException extends FileNotFoundException {
    public ArchivoNoEncontradoException(String msg){
        super("Error: ArchivoNoEncontradoException: " + msg);
    }
}
