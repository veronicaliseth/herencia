public class Bicicleta extends Vehiculo{
   private String tipo;
   public String getTipo(){
      return "Estilo"+" "+tipo;
     }

     public void registrarVehiculo(){
      super.registrarVehiculo();
      System.out.println("Ingrese el tipo de bicicleta: Montaña, De ruta, Urbanas, BMX");
      tipo=entrada.next();
    }
 }