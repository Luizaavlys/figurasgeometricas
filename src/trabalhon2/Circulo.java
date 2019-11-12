
package trabalhon2;


public class Circulo extends FiguraGeometrica{
    private double perimetro;
    private double area;
    private static final double Pi = 3.1415926;
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


    @Override
    public double calcularArea() {
        this.area = this.Pi * this.raio * this.raio;
        return this.area;
    }

    @Override
    public double calcularPerimetro() {
        this.perimetro = 2 * this.Pi * this.raio;
        return this.perimetro;
       
    }
    
   
}

