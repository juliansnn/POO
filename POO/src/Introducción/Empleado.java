package Introducción;

import java.util.Scanner;

public class Empleado extends Persona {
    private String cargo,departamento;
    private int valorhora, horastrabajadas;
    private double total;
    public Empleado (String nombre, String apellido, String tipoDoc, int documento, String cargo, String departamento, int valorhora, int horastrabajadas){
        super(tipoDoc, nombre, apellido, documento);
        this.cargo=cargo;
        this.departamento=departamento;
        this.valorhora=valorhora;
        this.horastrabajadas=horastrabajadas;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public int getValorhora() {
        return valorhora;
    }
    public void setValorhora(int valorhora) {
        this.valorhora = valorhora;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public int getHorastrabajadas() {
        return horastrabajadas;
    }
    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }
    public void pedirDatos(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite el tipo de documento: " );
        tipoDoc=in.next();
        System.out.println("Digite el número de documento: ");
        documento=in.nextInt();
        System.out.println("Digite su nombre: ");
        nombre=in.next();
        System.out.println("Digite su apellido: ");
        apellido=in.next();
        System.out.println("Digite el cargo: ");
        cargo=in.next();
        System.out.println("Digite el departamento: ");
        departamento=in.next();
        System.out.println("Digite el valor de una hora: ");
        valorhora=in.nextInt();
        System.out.println("Digite las horas totales trabajadas: ");
        horastrabajadas=in.nextInt();
        in.close();
    } 
    public void mostrarDato(){
        System.out.println("Su tipo de documento es "+getTipoDoc()+"\ncon número de identificación: "+getDocumento()+"\nSus nombres son: "+getNombre()+" con los apellidos: "+getApellido()+"\nTiene el cargo de: "+getCargo()+" en el departamento: "+getDepartamento()+"\nEl valor de una hora es de: "+getValorhora()+" y trabajaste por "+getHorastrabajadas()+" horas en total.");
    }
    public void calcularHorarios(){
        double reteica = 0.966;
        total = valorhora*horastrabajadas-reteica;
        System.out.println("Su pago total fué de: "+getTotal()+" pesos.");
    }
    
}
