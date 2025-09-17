import java.lang.*;

public class TrianguloEquilatero extends FiguraGeometrica{
    private double lado;

    public TrianguloEquilatero(String cor, double lado){
        super(cor);
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double calcularArea(){
        return (Math.sqrt(3.0)/4.0) * (lado*lado);
    }

    public double calcularPerimetro(){
        return 3* lado;
    }

    public String getTipoFigura(){
        return "Triângulo Equilátero";
    }

    public String getDetalhes(){
        return "Lados: " + (Double.toString(lado));
    }

    public String getInfo(){
       return "ID: " + getID() + ", Cor: " + getCor() + ", Tipo: " + getTipoFigura() + ", Lados: " + Double.toString(getLado()) + ", Area: " + Double.toString(calcularArea()) + "`, Perimetro: " + Double.toString(calcularPerimetro());
    }


}
