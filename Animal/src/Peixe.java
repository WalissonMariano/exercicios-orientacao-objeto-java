public class Peixe extends Animal {

    private String corEscama;
    
    public String getCorEscama(){
        return corEscama;
    }
    public void setCorEscama(String cor){
        this.corEscama = cor;
    }

    public void soltarBolhas(){
        System.out.println("Soltando bolhas!");
    }

    @Override
    public void locomover(){
        System.out.println("Peixe locomovendo!");
    }

    @Override
    public void alimentar(){
        System.out.println("Peixe mamando");
    }

    @Override
    public void emitirSom(){
        System.out.println("Peixe emitindo som!");
    }
    
}
