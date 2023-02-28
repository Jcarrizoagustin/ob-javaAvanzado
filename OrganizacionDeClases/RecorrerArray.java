package OrganizacionDeClases;

public class RecorrerArray {

    public static void obtenerObjetoDadaUnaPosicion(String[] args,int posicion) throws PosicionFueraDeArrayException {
        int longitud = args.length;
        if(posicion >= longitud){
            throw new PosicionFueraDeArrayException("La posicion es mayor que la longitud del array");
        }

        String objeto = args[posicion];
        System.out.println(objeto);
    }
}
