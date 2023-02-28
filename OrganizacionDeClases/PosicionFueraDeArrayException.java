package OrganizacionDeClases;

public class PosicionFueraDeArrayException extends ArrayIndexOutOfBoundsException{
    public PosicionFueraDeArrayException(String msg){
        super("Error: PosicionFueraDeArrayException: " +msg);
    }
}
