public class Repitil extends Animal {

    private String corEscama;

    public String getCorEscama(){
        return this.corEscama;
    }
    public void setCorEscama(String cor){
        this.corEscama = cor;
    }

    @Override
    public void locomover(){
        System.out.println("Repitil locomovendo!");
    }

    @Override
    public void alimentar(){
        System.out.println("Repitil mamando");
    }

    @Override
    public void emitirSom(){
        System.out.println("Repitil emitindo som!");
    }
    
}
