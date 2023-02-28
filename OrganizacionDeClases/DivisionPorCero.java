package OrganizacionDeClases;

public class DivisionPorCero {

    public static int dividir(int dividendo,int divisor) throws DivisionPorCeroException{
        if(divisor==0){
            throw new DivisionPorCeroException("El divisor no puede ser cero.");
        }
        return dividendo/divisor;
    }
}
