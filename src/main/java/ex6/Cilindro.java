package ex6;

public class Cilindro {
    private double raio;
    private double altura;

    public Cilindro(double raio, double altura) {
        if (raio < 0 || altura < 0) {
            throw new IllegalArgumentException("Raio e altura não podem ser negativos");
        }
        this.raio = raio;
        this.altura = altura;
    }

    public double calcularAreaLateral() {
        return 2 * 3.1415 * raio * altura;
    }

    public double calcularAreaTotal() {
        return 2 * 3.1415 * raio * (altura + raio);
    }

    public double calcularVolume() {
        return 3.1415 * Math.pow(raio, 2) * altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
