public class Ave extends Animal {
    private String corPena;

    public String getCorPena(){
        return corPena;
    }
    public void setCorPena(String cor){
        this.corPena = cor;
    }

    public void fazerNinho(){
        System.out.println("Ninho feito!");
    }

    @Override
    public void locomover(){
        System.out.println("Ave locomovendo!");
    }

    @Override
    public void alimentar(){
        System.out.println("Ave mamando");
    }

    @Override
    public void emitirSom(){
        System.out.println("Ave emitindo som!");
    }
    
}
