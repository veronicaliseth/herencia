public class Autobus extends Vehiculo{
    private int numPasajeros;

    public String getCapacidad(){
        return "Capacidad"+" "+numPasajeros;
    }
    public void registrarVehiculo(){
        super.registrarVehiculo();
        do{
            System.out.println("Ingrese el numero de pasajeros");
            numPasajeros=entrada.nextInt();
        }while(numPasajeros== 0);
    }

    
}