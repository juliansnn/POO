package Introducción;

import java.util.Scanner;

public class Persona {
    String tipoDoc, nombre,apellido,sexo;
    int documento, edad;
    double peso,estatura;
    
    public Persona (String tipoDoc, String nombre,String apellido,int documento){
        this.tipoDoc = tipoDoc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;

    }
    public void pedirDatos(){
        Scanner in=new Scanner(System.in);
        System.out.println("Digite el tipo de documento");
        tipoDoc=in.next();
        System.out.println("Digite el número de documento");
        documento=in.nextInt();
        System.out.println("Digite el nombre");
        nombre=in.next();
        System.out.println("Digite el apellido");
        apellido=in.next();
        System.out.println("Digite el peso");
        peso=in.nextDouble();
        System.out.println("Digite la estatura");
        estatura=in.nextInt();
        System.out.println("Digite la edad");
        edad=in.nextInt();
        System.out.println("Digite el sexo");
        sexo=in.next();
        in.close();
    }
    public void mostrarPersona(){
        System.out.println("El tipo de documento es: " + tipoDoc);
        System.out.println("El número de documento es: " + documento);
        System.out.println("El nombre es: " + nombre);
        System.out.println("El apellido es: " + apellido);
        System.out.println("El peso es: " + peso+ " Kg");
        System.out.println("La estatura es: " + estatura + " metros");
        System.out.println("La edad es: " + edad + " años");
        System.out.println("El sexo es: " + sexo);
    }
         public double calcularmc(){
         double pesoActual=  peso/(estatura*estatura);
         if (pesoActual<20){
            System.out.println("PESOBAJO: " + pesoActual);
         }
         else if (pesoActual>=20||pesoActual<=25){
            System.out.println("PESOIDEAL: " + pesoActual);
         }
         else if (pesoActual>25){
            System.out.println("SOBREPESO: " + pesoActual);
         }
         return pesoActual;
    }
    public void mostrarEdad(){
        if (edad >=18){
            System.out.println("Usted es mayor de edad");
        }
        else if (edad <18){
            System.out.println("Usted es menor de edad");
        }
    }
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
}
