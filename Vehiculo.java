import java.util.Scanner;
public class Vehiculo{
    protected String modelo;
    protected String color;
    protected String marca;
    protected double precio;

    Scanner entrada= new Scanner (System.in);

    public Vehiculo(String modelo, String color, String marca, double precio){
        this.modelo=modelo;
        this.color=color;
        this.marca=marca;
        this.precio=precio;
    }

    public Vehiculo(){}

    public void registrarVehiculo(){
        System.out.println("Ingrese el modelo del vehiculo");
        modelo=entrada.next();
        System.out.println("Ingrese la marca del vehiculo");
        marca=entrada.next();
        System.out.println("Ingrese el precio del vehiculo");
        precio=entrada.nextInt();
        System.out.println("Ingrese el color del vehiculo");
        color=entrada.next();
    }

    public String toString(){
        return String.format("%s: %s %s\n%s: %.2f\n%s: %s", "vehiculo. marca y modelo", marca,modelo,"precio",precio,"color",color);
    }
    public String getColor(){
        return color;
    }

}