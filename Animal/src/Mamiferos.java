public class Mamiferos extends Animal {

    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover(){
        System.out.println("Mamifero locomovendo!");
    }

    @Override
    public void alimentar(){
        System.out.println("Mamifero mamando");
    }

    @Override
    public void emitirSom(){
        System.out.println("Mamifero emitindo som!");
    }


}
