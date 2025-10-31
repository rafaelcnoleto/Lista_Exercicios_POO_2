package ex4;

public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        if (comprimento < 0 || largura < 0) {
            throw new IllegalArgumentException("Medidas não podem ser negativas");
        }
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularArea() {
        return comprimento * largura;
    }

    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}
