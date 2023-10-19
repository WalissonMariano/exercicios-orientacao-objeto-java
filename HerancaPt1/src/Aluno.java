public class Aluno extends Pessoa{

    private boolean matr;
    private String curso;
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isMatr() {
        return matr;
    }

    public void setMatr(boolean matr) {
        this.matr = matr;
    }

    public Aluno(String nome, int idade, String sexo, boolean matr, String curso) {
        super(nome, idade, sexo);
        setMatr(matr);
        setCurso(curso);

    }
    public void cancelarMatr(){
        setMatr(false);
    }


}
