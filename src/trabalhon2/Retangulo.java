package trabalhon2;

public class Retangulo extends FiguraGeometrica {
    private double altura;
    private double comprimento;
    private double area;
    private double perimetro;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    @Override
    public double calcularArea() {
       this.area = this.getAltura() * this.getComprimento();
       return this.area;
    }

    @Override
    public double calcularPerimetro() {
        this.perimetro = this.getAltura()*2 *( this.getComprimento()*2);
       return this.perimetro;
       
    }
    
    
}
