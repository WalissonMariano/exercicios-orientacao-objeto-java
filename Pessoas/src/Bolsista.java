
public class Bolsista extends Aluno{

    private String bolsa;

    public String getBolsa() {
        return bolsa;
    }
    public void setBolsa(String bolsa) {
        this.bolsa = bolsa;
    }


    public Bolsista(String nome, int idade, String sexo, int matricula, String curso, String bolsa) {
        super(nome, idade, sexo, matricula, curso);
        setBolsa(bolsa);
        
    }

    public void renovarBolsa(){
        System.out.println("Bolsa renovada");
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga");
    }

}
