package empregados;

public class ProfessorDaFaculdade extends EmpregadosFeculdade {

    private int RF;
    private int horasDeAula;

    public int getRF() {
        return RF;
    }

    public void setRF(int RF) {
        this.RF = RF;
    }

    @Override
    double getGastos() {
        return this.getSalario() + this.horasDeAula * 10;
    }

    @Override
    String getInfo() {
        String informacaoBasica = super.getInfo();
        String informacao = informacaoBasica + " horas de aula: " + this.horasDeAula;
        return informacao;
    }
}
