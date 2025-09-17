public abstract class FiguraGeometrica implements CalculosGeometricos{

    private int id;
    private String cor;

    private static int totalFiguras = 0;



    public FiguraGeometrica(String Cor){
        totalFiguras++;
        this.id = totalFiguras;
        this.cor = Cor;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public static int getTotalFiguras(){
        return totalFiguras;
    }

    public String getInfo(){
        return "ID:" + Integer.toString(id) + ", Cor" + cor;
    }

    public abstract String getDetalhes();

    public String getID(){
        return Integer.toString(id);
    }

}
