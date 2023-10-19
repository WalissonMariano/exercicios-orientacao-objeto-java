public class Aluno extends Pessoa {

    private int matricula;
    private String curso;
    
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
   
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void pagarMensalidade(){
        System.out.println("Mensalidad Paga");
    }

    public Aluno(String nome, int idade, String sexo, int matricula, String curso){
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setMatricula(matricula);
        setCurso(curso);
    }

}
