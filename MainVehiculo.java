import java.util.*;
public class MainVehiculo {
   public static void main(String[] args) {
      int T;
      //vector v-new vector();
      ArrayList<Vehiculo> listaVehiculo = new ArrayList();

      do{
         System.out.println("Cuantos vehiculo desea ingresar?");
         T = sc.nextInt();
      }while(T < 0);
      sc.nextLine();//limpiar el intro
      //lectura de T vehiculos
      if(T==1){
         for(i = 1; i <=T; i++){
            //leer datos de cada ehiculo
            System.out.println("");
         }
      }
      Automovil automovil = new Automovil();
      System.out.println("Registro de automovil");
      automovil.registrarVehiculo();
      //System.out.println(automovil.toString()+"\n"+automovil.getEstilo());
     
      Bicicleta bicicleta = new Bicicleta();
      System.out.println("Registro de bicicleta");
      bicicleta.registrarVehiculo();
      //System.out.println(bicicleta.toString()+"\n"+bicicleta.getTipo());
        
      Autobus autobus=new Autobus();
      System.out.println("Registro de autobus");
      autobus.registrarVehiculo();
      //System.out.println(autobus.toString()+"\n"+autobus.getCapacidad());

      //compararColores(bicicleta, automovil, autobus);
      //informacionDeObjetos(bicicleta, automovil, autobus);
   }

   public static void compararColores(Bicicleta bicicleta, Automovil automovil, Autobus autobus){
      System.out.println("Verificar colores"); 
      if(bicicleta.getColor().equals(automovil.getColor()) && bicicleta.getColor().equals(autobus.getColor())){
         System.out.println("Los vehiculos tienen colores similares");
      }else{
         System.out.println("Los vehiculos tiene colres diferentes");
      }
   }

   public static void informacionDeObjetos(Bicicleta bicicleta, Automovil automovil, Autobus autobus){
      System.out.println("El objeto bicicleta pertenece a la clase: "+bicicleta.getClass());
      System.out.println("El objeto automovil pertenece a la clase: "+automovil.getClass());
      System.out.println("El objeto automovil pertenece a la clase: "+autobus.getClass());
   }
}