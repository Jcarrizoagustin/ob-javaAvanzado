package OrganizacionDeClases;

public class DivisionPorCeroException extends ArithmeticException{
    public DivisionPorCeroException(String msg){
        super("Error: DivisionPorCeroException: " + msg);
    }
}
