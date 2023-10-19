 public class ContaBanco {
    
    public double numConta;
    protected String tipoConta;
    private String nomeConta;
    private double saldoConta;
    private boolean statusConta;

    public double getNumConta () {
        return this.numConta;
    }
    public void setNumConta (double num) {
        this.numConta = num;
    }

    public String getTipoConta () {
        return this.tipoConta;
    }
    public void setTipoConta (String tipo) {
        this.tipoConta = tipo;
    }

    public String getNomeConta (){
        return this.nomeConta;
    }
    public void setNomeConta (String nome){
        this.nomeConta = nome;
    }

    public double getSaldoConta () {
        return this.saldoConta;
    }
    public void setSaldoConta (double saldo) {
        this.saldoConta = saldo;
    }
    
    public boolean getStatusConta () {
        return this.statusConta;
    }
    public void setStatusConta (boolean status){
        this.statusConta = status;
    }

    public void construtor (){
        this.setSaldoConta(0);
        this.setStatusConta(false);
    }

    public void abrirConta (double num , String tipo , String nome){

        this.setNumConta(num);
        this.setTipoConta(tipo);
        this.setNomeConta(nome);
        this.setStatusConta(true);

        if (tipo == "cc"){

            this.setSaldoConta(50);

        }else if (tipo == "cp"){

            this.setSaldoConta(150);

        }
    }

    public void fecharConta (){


    }
    public void deposita (double deposito){
        if (this.getStatusConta() == true){

            this.setSaldoConta(deposito + this.saldoConta);

        }else if (this.getStatusConta() == false){

            System.out.println("Conta inativa ou fechada!");
            
        }
    }

    public void sacar (double saque){

        if (this.getStatusConta() == true && this.getSaldoConta() > 0){

            setSaldoConta(this.getSaldoConta() - saque);
        }else if (this.getStatusConta() == false && this.getSaldoConta() < 1){

            System.out.println("Conta inativa ou saldo insuficiente!");
        }

    }
    public void pagarMensalidade (){
        if (this.getTipoConta() == "cc"){
            this.setSaldoConta(this.getSaldoConta() - 12);
        }else if (this.tipoConta == "cp"){
            this.setSaldoConta(this.getSaldoConta() - 20);
        }
    }
}
