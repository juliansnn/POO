package Introducción;

public class Inicio {
    public static void main(String[] args) {
        Empleado registro = new Empleado(null, null, null, 0, null, null, 0, 0);
        registro.pedirDatos();
        registro.mostrarDato();
        registro.calcularHorarios();
    }
}
