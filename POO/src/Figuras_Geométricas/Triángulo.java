package Figuras_Geométricas;

public class Triángulo {
    private double base;
    private double altura;
    public Triángulo(double base,double altura){
        this.base=base;
        this.altura=altura;
    } 
    public double getBase2() {
        return base;
    }
    public void setBase2(float base) {
        this.base = base;
    }
    public double getAltura2() {
        return altura;
    }
    public void setAltura2(float altura) {
        this.altura = altura;
    }
    public void calcularArea() {
      double area=0;
      area= base*altura /2;
      System.out.println("La base del Triángulo es: "+base+" y su altura es: " +altura+ " .El área es: "+area);
    }
}
