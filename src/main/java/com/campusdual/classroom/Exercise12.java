package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", "Gasolina");

        // Comprobar el tacómetro es cero
        System.out.println("Tacómetro es cero: " + myCar.isTachometerEqualToZero());

        // Encender el coche
        myCar.start();

        // Intentar encender el coche nuevamente
        myCar.start();

        // Acelerar el coche
        myCar.accelerate();
        myCar.accelerate(); // Acelerar más

        // Mostrar detalles del coche
        myCar.showDetails();

        // Girar el volante
        myCar.turnAngleOfWheels(20);
        myCar.turnAngleOfWheels(50); // Intentar girar más de 45 grados

        // Frenar el coche
        myCar.brake();
        myCar.brake();

        // Detener el coche
        myCar.stop();

        // Cambiar a marcha atrás
        myCar.setReverse(true);

        // Intentar apagar el coche mientras está en movimiento
        myCar.setReverse(false); // Cambiar a no marcha atrás
        myCar.stop(); // Ahora debería apagarse
    }

}