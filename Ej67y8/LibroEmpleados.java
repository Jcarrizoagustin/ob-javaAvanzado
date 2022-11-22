package Ej67y8;
import java.util.ArrayList;
import java.util.List;

public class LibroEmpleados {
  private List<Empleado> listadoEmpleados;

  public LibroEmpleados(){
    this.listadoEmpleados = new ArrayList<>();
  }

  public void agregarEmpleado(Empleado empleado){
    this.listadoEmpleados.add(empleado);
  }
}
