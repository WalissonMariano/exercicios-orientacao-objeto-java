public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nomeLutador){
        this.nome = nomeLutador;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public void setNacionalidade(String nacionalidadeLutador){
        this.nacionalidade = nacionalidadeLutador;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idadeLutador){
        this.idade = idadeLutador;
    }

    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double alturaLutador){
        this.altura = alturaLutador;
    }

    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double pesoLutador){
        this.peso = pesoLutador;
    }

    public String getCategoria(){
        return this.categoria;
    }
    public void setCategoria(String categoriaLutador){
        this.categoria = categoriaLutador;
    }

    public int getVitorias(){
        return this.vitorias;
    }
    public void setVitorias(int vitoriasLutador){
        this.vitorias = getVitorias() + vitoriasLutador;
    }

    public int getDerrota(){
        return this.derrotas;
    }
    public void setDerrota(int derrotasLutador){
        this.derrotas = getDerrota() + derrotasLutador;
    }

    public int getEmpate(){
        return this.empates;
    }
    public void setEmpate(int empatesLutador){
        this.empates = getEmpate() + empatesLutador;
    }

    public Lutador (String nomeConstrutor, String nacionalidadeConstrutor, int idadeConstrutor, 
    double alturaConstrutor, double pesoConstrutor, int vitoriasConstrutor, 
    int derrotasConstrutor, int empatesConstrutor ){

        setNome(nomeConstrutor);
        setNacionalidade(nacionalidadeConstrutor);
        setIdade(idadeConstrutor);
        setAltura(alturaConstrutor);
        setPeso(pesoConstrutor);
        setVitorias(getVitorias() + vitoriasConstrutor);
        setDerrota(getDerrota() + derrotasConstrutor);
        setEmpate(getEmpate() + empatesConstrutor);

        if(getPeso()<=70){
            setCategoria("Leve");
        }else if(getPeso()>70 && getPeso()<=90){
            setCategoria("Medio");
        }else if(getPeso()>90){
            setCategoria("Pesado");
        }

    }

    public void apresentar (){
        System.out.println("____________________________");
        System.out.println("\nApresentação Lutador\n");
        System.out.println("Nome: " + getNome());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Altura: " + getAltura() + "m");
        System.out.println("Peso: " + getPeso() + "kg");
        System.out.println("Vitoria: " + getVitorias());
        System.out.println("Derrota: " + getDerrota());
        System.out.println("Empate: " + getEmpate() );
         System.out.println("____________________________");

    }

    public void status (){
         System.out.println("____________________________");
        System.out.println("\nStatus Lutador");
        System.out.println("Nome: " + getNome());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Vitorias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrota());
        System.out.println("Empates: " + getEmpate() );
         System.out.println("____________________________");
    }

    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    public void perdeLuta(){
        setDerrota(getDerrota() + 1);
    }

    public void empateLuta(){
        setEmpate(getEmpate() + 1);
    }

}