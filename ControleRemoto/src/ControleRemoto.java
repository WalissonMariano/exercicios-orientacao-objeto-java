public class ControleRemoto implements Controlador {
    
    private int volume;
    private boolean ligar;
    private boolean tocando;

    public int getVolume(){
        return this.volume;
    }
    public void setVolume( int volumeTv){
        this.volume = volumeTv;
    }

    public boolean getLigar(){
        return this.ligar;
    }
    public void setLigar(boolean ligarTv){
        this.ligar = ligarTv;
    }

    public boolean getTocando(){
        return tocando;
    }
    public void setToando(boolean tocandoTv){
        this.tocando = tocandoTv;
    }

    
    public void construtor(){
        setVolume(50);
        setLigar(false);
        setToando(false);
    }

    @Override
    public void ligar(){
        if(getLigar() == false){
            setLigar(true);
        }else if (getLigar() == true){
            System.out.println("Televisão já está ligada!");
        }

    }

    @Override
    public void desligar(){
        if(this.getLigar() == true){
            this.setLigar(false);
        }else if (this.getLigar() == false){
            System.out.println("Televisão já está desligada!");
        }
    }

    @Override
    public void abrirMenu(){


    }

    @Override
    public void fecharMenu(){


    }

    @Override
    public void maisVolume(){
        if(this.getLigar() == true && getVolume()<=100){
            this.setVolume(this.getVolume() + 5);
        }else if(this.getLigar() == false){
            System.out.println("Televisão esta desligada! ");
        }else if(this.getVolume() == 100){
            System.out.println("Televisão já está no volume máximo");
        }
    }
    
    @Override
    public void menosVolume(){
        if(this.getLigar() == true && getVolume() >= 0){
            this.setVolume(this.getVolume() - 5);
        }else if(this.getLigar() == false){
            System.out.println("Televisão desligada! ");
        }else if(this.getVolume() == 0){
            System.out.println("Televisão já está no mudo");
        }
    }

    @Override
    public void ligarMudo(){
        if(this.getLigar() == true && this.getVolume() > 0){
            this.setVolume(0);
        }else if (this.getLigar() == false){
            System.out.println("Televisão desligada! ");
        }else if (this.getVolume() == 0){
            System.out.println("Televisão já esta no mudo! ");
        }
    }

    @Override
    public void desligarMudo(){
         if(this.getLigar() == true && this.getVolume() == 0){
            this.setVolume(50);
        }else if (this.getLigar() == false){
            System.out.println("Televisão desligada! ");
        }else if (this.getVolume() > 0){
            System.out.println("Televisão não está no mudo! ");
        }
    }

    @Override
    public void play(){
        if(this.getLigar() == true && this.getTocando() == false){
            this.setLigar(true);
        }else if(this.getLigar() == false){
            System.out.println("Televisão desligada! ");
        }else if(this.getTocando() == true){
            System.out.println("Televisão já está tocando! ");
        }
    }

    @Override
    public void pausa(){
        if(this.getLigar() == true && this.getTocando() == true){
            this.setToando(false);
        }else if(this.getLigar() == false){
            System.out.println("Televisão desligada! ");
        }else if(this.getTocando() == false){
            System.out.println("Televisão já está pausada! ");
        }
    }

    
}
