public class Automovil extends Vehiculo{
    private String estilo;

    public String getEstilo(){
        return "Estilo"+" "+estilo;
    }

    public void registrarVehiculo(){
        super.registrarVehiculo();
        System.out.println("Digite el estilo de la automovil:Clasico, Deportivo, 4x4, Lujos");
        estilo = entrada.next();
    }
}