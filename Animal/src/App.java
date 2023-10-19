public class App {
    public static void main(String[] args) {

        Mamiferos mamifero = new Mamiferos();

        mamifero.setPeso(10.8);
        mamifero.setIdade(8);
        mamifero.setMembros(4);
        mamifero.mostrar();

        Peixe peixe = new Peixe();

        peixe.setPeso(2);
        peixe.setIdade(1);
        peixe.setMembros(7);
        peixe.mostrar();

        Repitil repitil = new Repitil();

        repitil.setPeso(4.5);
        repitil.setIdade(5);
        repitil.setMembros(4);
        repitil.mostrar();

        Ave ave = new Ave();

        ave.setPeso(2.5);
        ave.setIdade(3);
        ave.setMembros(4);
        repitil.mostrar();
    }
}
