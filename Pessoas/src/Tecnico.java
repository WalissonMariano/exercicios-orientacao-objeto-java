public class Tecnico extends Aluno {

    private int registro;

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public Tecnico(String nome, int idade, String sexo, int matricula, String curso){
        super(nome, idade, sexo, matricula, curso);

    }

    public void registroProfissional(int registro){
        setRegistro(registro);
    }

    public void praticar(){
        System.out.println("Praticando");
    }
    
}
