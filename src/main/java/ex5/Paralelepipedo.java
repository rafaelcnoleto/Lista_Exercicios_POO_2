package ex5;

public class Paralelepipedo {
    private double altura, largura, comprimento;

    public Paralelepipedo(double altura, double largura, double comprimento) {
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double calcularVolume() {
        return altura * largura * comprimento;
    }

    public double calcularArea() {
        return 2 * (altura * largura + altura * comprimento + largura * comprimento);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
}
