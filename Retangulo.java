public class Retangulo extends FiguraGeometrica{
    private double largura;
    private double altura;

    public Retangulo(String cor, double largura, double altura){
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura(){
        return largura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double calcularArea(){
        return largura * altura;
    }

    public double calcularPerimetro(){
        return 2 * (largura + altura);
    }

    public String getTipoFigura(){
        return "Retângulo";
    }

    public String getDetalhes(){
        return "Largura: " + Double.toString(largura) + ", Altura: " + Double.toString(altura);
    }

    public String getInfo(){
        return "ID: " + getID() + ", Cor: " + getCor() + ", Tipo: " + getTipoFigura() + ", Largura: " + Double.toString(getLargura()) + ", Altura: " + Double.toString(getAltura()) + ", Area: " + Double.toString(calcularArea()) + "`, Perimetro: " + Double.toString(calcularPerimetro());
    }

}
