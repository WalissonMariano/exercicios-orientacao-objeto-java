public abstract class Animal {

    private double peso;
    private int idade;
    private int membros;
    
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getMembros() {
        return membros;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }

    public void mostrar(){
        System.out.println("\n_________________________");
        System.out.println(getPeso());
        System.out.println(getIdade());
        System.out.println(getMembros());
        System.out.println("_________________________\n");
    }

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();


}
