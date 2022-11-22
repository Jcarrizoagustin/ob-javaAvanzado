package Ej67y8;

public class Comercio{
  private static Comercio comercio;
  private LibroEmpleados empleados;

  private Comercio(){
    this.empleados = new LibroEmpleados();
  }

  public static Comercio instancia(){
    if(comercio == null){
      comercio = new Comercio();
    }
    return comercio;
  }

  public LibroEmpleados getEmpleados() {
    return empleados;
  }
}