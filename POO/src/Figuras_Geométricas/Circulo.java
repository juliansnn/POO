package Figuras_Geométricas;

public class Circulo extends Figura {
    private double radio;
    private double numPi=3.1416;
    public Circulo(Double radio,Double numPi){
        this.radio=radio;
        this.numPi=numPi;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(Double radio) {
        this.radio = radio;
    }
    public Double getNumPi() {
        return numPi;
    }
    public void setPi(Double numPi) {
        this.numPi = numPi;
    }
    public void calcularArea() {
      Double area=0.0;
      radio=radio*radio;
      area=radio*numPi;
      System.out.println("el radio del círculo es: "+radio+" Y su area es: "+area);
    }
}