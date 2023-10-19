public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Professor(String nome, int idade, String sexo, String especialidade, double salario){
        super(nome, idade, sexo);
        setEspecialidade(especialidade);
        setSalario(salario);
    }

    public void receberAumento(double aumento){
        setSalario(getSalario() + aumento);
    }
    
}
