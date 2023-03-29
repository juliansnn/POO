package Figuras_Geométricas;
import java.util.Scanner;
public class Inicio {
        public static void main(String[] args) {
        double base=0;
        double altura=0;
        double radio=0;
        double numPi=3.1416;
        int eleccion;
        Scanner in =new Scanner(System.in);
        System.out.println("Digite un número del 1 al 3 (1 para Rectángulo, 2 para Triángulo o 3 para Círculo)");
        eleccion=in.nextInt();
        if(eleccion==1){
            System.out.println("Digite el valor de la base");
            base=in.nextFloat();
            System.out.println("Digite el valor de la altura");
            altura=in.nextFloat();
            Rectángulo fig=new Rectángulo(base,altura);
            fig.calcularArea();
        }else if (eleccion==2){
            Triángulo fig2=new Triángulo(base,altura);
            System.out.println("Digite el valor de la base del triángulo");
            base=in.nextFloat();
            System.out.println("Digite el valor de la altura del triángulo");
            altura=in.nextFloat();
            fig2.calcularArea();
        }else if (eleccion==3){
        System.out.println("Digite el valor del radio del círculo");
        radio=in.nextDouble();
        Circulo fig3 = new Circulo(radio,numPi);
        fig3.calcularArea();
        in.close();
        }
    }
}