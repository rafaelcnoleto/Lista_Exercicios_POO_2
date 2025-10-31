package ex8;

public class Paciente {
    private String nome;
    private double peso;
    private double altura;

    public Paciente(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String faixaPeso() {
        double imc = calcularIMC();
        if (imc < 20)
            return "abaixo do peso ideal";
        else if (imc >= 20 && imc <= 25)
            return "peso normal";
        else if (imc > 25 && imc <= 30)
            return "excesso de peso";
        else if (imc > 30 && imc <= 35)
            return "obesidade";
        else
            return "obesidade mórbida";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

