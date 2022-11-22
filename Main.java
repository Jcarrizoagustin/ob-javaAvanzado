public class Main {
  
  public static void main(String [] args){
    Comercio comercio = Comercio.instancia();
    System.out.println(comercio);

    Comercio comercio2 = Comercio.instancia();
    System.out.println(comercio2);
  }
}
