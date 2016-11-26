package empregados;

public class EmpregadosFeculdade {

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    double getGastos() {
        return this.getSalario();
    }

    String getInfo() {
        return "nome: " + this.getNome() + " com salário " + this.getSalario();
    }
    
}
