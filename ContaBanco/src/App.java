public class App {
    public static void main(String[] args) {

        ContaBanco jubileu = new ContaBanco();
        ContaBanco cleusa = new ContaBanco();

        jubileu.construtor();
        jubileu.abrirConta(234423456, "cc", "Jubileu");
        jubileu.deposita(20);

        cleusa.construtor();
        cleusa.setNomeConta("Cleusa");
    
    System.out.println(jubileu.getNomeConta());
    System.out.println(jubileu.getNumConta());
    System.out.println(jubileu.getTipoConta());
    System.out.println(jubileu.getSaldoConta());
    System.out.println(jubileu.getStatusConta());

    }
}
