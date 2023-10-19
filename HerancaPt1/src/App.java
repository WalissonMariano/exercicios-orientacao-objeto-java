public class App {
    public static void main(String[] args) throws Exception {
      
        Pessoa p1 = new Pessoa("Pedro", 20, "Masculino");
        Aluno p2 = new Aluno("Maria", 19, "Feminino", true, "Nutrição");
        Professor p3 = new Professor("Claudio", 45, "Masculino", 
        "Alimentação saudavel", 3500);
        Funcionario p4 = new Funcionario("Fabiana", 32, "Feminino", "Secretaria", 
        true);

        p1.fazerAniv();
        p2.setCurso("Biomedicina");
        p2.cancelarMatr();
        p3.receberAumento(1500);
        p4.mudarTrabalho("Tesouraria");


    }
}
