package Figuras_Geométricas;

public class Rectángulo {
    private double base;
    private double altura;
    public Rectángulo(double base,double altura){
        this.base=base;
        this.altura=altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void calcularArea() {
        double area=0;
      area=base*altura;
      System.out.println("La base del rectángulo es: "+base+" y su altura es: " +altura+ " .El área es de: "+area);
    }
}
