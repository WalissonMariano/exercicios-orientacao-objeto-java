import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    public Lutador getDesafiado(){
        return this.desafiado;
    }
    public void setDesafiado(Lutador desafiadoLuta){
        this.desafiado = desafiadoLuta;
    }

    public Lutador getDesafiante(){
        return this.desafiante;
    }
    public void setDesafiante(Lutador desafianteLuta){
        this.desafiante = desafianteLuta;
    }

    public int getRounds (){
        return rounds;
    }
    public void setRounds (int roundsLuta){
        this.rounds = roundsLuta;
    }

    public boolean getAprovado() {
        return aprovado;
    }
    public void setAprovado(boolean aprovadoLuta) {
        this.aprovado = aprovadoLuta;
    }


    public void marcarLuta(Lutador desafiadoConstrutor, Lutador desafianteConstrutor){

        setDesafiado(desafiadoConstrutor);
        setDesafiante(desafianteConstrutor);

        if(desafiadoConstrutor != desafianteConstrutor && getDesafiado().getCategoria() == getDesafiante().getCategoria()){

            setAprovado(true);

        }else{
            setDesafiado(null);
            setDesafiante(null);
            setAprovado(false);
        }
       
    }

    public void lutar(){
        if(getAprovado() == true){
            Random contador = new Random();
            switch (contador.nextInt(3)){
                case 0 : 
                    getDesafiado().setEmpate(1);
                    getDesafiante().setEmpate(1);

                    System.out.println("Empate!");
                break;

                case 1 :
                    getDesafiado().setVitorias(1);
                    getDesafiante().setDerrota(1);

                    System.out.println("Vencedor foi o " + getDesafiado().getNome());
                break;

                case 2 :
                    getDesafiado().setDerrota(1);
                    getDesafiante().setVitorias(1);

                    System.out.println("Vencedor foi o " + getDesafiante().getNome());
                break;
            }

        }else{
            System.out.println("Luta não aprovada! " );
        }
    }
}