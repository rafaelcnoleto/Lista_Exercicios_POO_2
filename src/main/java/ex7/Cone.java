package ex7;

public class Cone {
    private double raio;
    private double altura;

    public Cone(double raio, double altura) {
        if (raio < 0 || altura < 0) {
            throw new IllegalArgumentException("Raio e altura não podem ser negativos");
        }
        this.raio = raio;
        this.altura = altura;
    }

    public double calcularGeratriz() {
        return Math.sqrt(altura * altura + raio * raio);
    }

    public double calcularAreaLateral() {
        return 3.1415 * raio * calcularGeratriz();
    }

    public double calcularAreaTotal() {
        return 3.1415 * raio * (calcularGeratriz() + raio);
    }

    public double calcularVolume() {
        return (1.0 / 3.0) * 3.1415 * raio * raio * altura;
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

