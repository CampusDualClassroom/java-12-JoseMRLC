package com.campusdual.classroom;

public class Car {
public String brand;
public String model;
public static final  int MAX_SPEED = 120;

    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(){

  }
  public Car(String brand,String model,String fuel){
      this.brand = brand;
      this.model = model;
      this.fuel = fuel;
  }

  public void start(){
        if(this.tachometer == 0){
            this.tachometer = 1000;
            System.out.println("Vehículo acendido");
        } else  {
            System.out.println("O vehículo xa está acendido");
        }
  }

  public void stop(){
        if(this.speedometer == 0){
            this.tachometer=0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("Non se pode apagar o vehículo, primeiro ten que estar detido");
        }
  }

  public void accelerate(){
      if (speedometer < MAX_SPEED) {
          speedometer += 10; // Aumentar la velocidad en 10 km/h
          System.out.println("Acelerando. Velocidad actual: " + speedometer + " km/h");
      } else {
          System.out.println("No se puede acelerar más, se ha alcanzado la velocidad máxima.");
      }
  }
  public void brake(){
      if (speedometer > 0) {
          speedometer -= 10; // Disminuir la velocidad en 10 km/h
          System.out.println("Frenando. Velocidad actual: " + speedometer + " km/h");
      } else {
          System.out.println("El vehículo ya está detenido.");
      }
  }

    public boolean isTachometerEqualToZero()
    {
        if(this.tachometer == 0) {
            return true;
        }
        return false;
    }
  public void turnSteeringWheel(int angle){

  }
    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

  public void setReverse(boolean reverse){
      if (this.speedometer == 0) {
          this.reverse = reverse;
          this.gear = reverse ? "R" : "N"; // Cambiar a marcha atrás o neutral
          System.out.println("El vehículo está en marcha atrás.");
      } else {
          System.out.println("No se puede poner marcha atrás mientras el vehículo está en movimiento.");
      }
  }
  public void showDetails(){
      System.out.println("Marca: " + brand);
      System.out.println("Modelo: " + model);
      System.out.println("Combustible: " + fuel);
      System.out.println("Velocidad: " + speedometer + " km/h");
      System.out.println("Tacómetro: " + tachometer + " RPM");
      System.out.println("Engranaje: " + gear);
      System.out.println("Ángulo de las ruedas: " + wheelsAngle + " grados");
      System.out.println("¿En marcha atrás?: " + (reverse ? "Sí" : "No"));
  }
    public void turnAngleOfWheels(int angle) {
        if (angle < -45) {
            this.wheelsAngle = -45; // Ajustar a -45 si el ángulo es menor
        } else if (angle > 45) {
            this.wheelsAngle = 45; // Ajustar a 45 si el ángulo es mayor
        } else {
            this.wheelsAngle = angle; // Asignar el ángulo directamente
        }
        System.out.println("El ángulo de las ruedas es: " + wheelsAngle + " grados");
    }

}
