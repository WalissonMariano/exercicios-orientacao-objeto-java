public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPagina;
    private int pagAtual;
    private Pessoa leitor;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotalPagina() {
        return totalPagina;
    }
    public void setTotalPagina(int totalPagina) {
        this.totalPagina = totalPagina;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public Livro (String tituloLivro, String autorLivro, int totalPaginaLivro, 
    int pagAtualLivro, Pessoa leitorLivro){

        setTitulo(tituloLivro);
        setAutor(autorLivro);
        setTotalPagina(totalPaginaLivro);
        setPagAtual(pagAtualLivro);
        setLeitor(leitorLivro);

    }

    public void detalhesLivro(){
        System.out.println("Detalhes do livro:\n");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Total de páginas: " + getTotalPagina());
        System.out.println("Página atual: " + getPagAtual());
        System.out.println("Leitor: " + getLeitor());
    }

    public void abrir(){
        System.out.println("Livro aberto");

    }
    public void fechar(){
        
    }
    public void folhear(){
        
    }
    public void avancarPag(){
        
    }
    public void voltarPag(){
        
    }

}
