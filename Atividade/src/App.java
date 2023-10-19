import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sexo = new Scanner(System.in);
        Scanner altura = new Scanner(System.in);

        float maiorAltura = 0 ;
        float menorAltura = 0;
        float alturaHomem = 0;
        float mediaAlturaHomem;
        int homem = 0;
        int mulher = 0;

            for ( int x = 0; x<10 ; x++){

            //COLETA DE DADOS
            System.out.print("\nDigite seu sexo: \n\n[M] Para masculino. \n[F] Feminino. \n>>");
            String sexoDados = sexo.nextLine();
            System.out.println("\nDigite sua altura: ");
            float alturaDados = altura.nextFloat(); 

            //MAIOR E MENOR ALTURA
            if (alturaDados > maiorAltura){
                maiorAltura = alturaDados;
            } 
            
            if (menorAltura == 0){
                menorAltura = alturaDados;
            }else if (alturaDados < menorAltura){
                menorAltura = alturaDados;
            }

            //QUANTIDADE DE HOMENS E MULHERES
            if (sexoDados.intern() == "M" || sexoDados.intern() == "m"){
                homem++;

                //MEDIA ALTURA HOMEM PRIMEIRA PARTE
                alturaHomem += alturaDados;

            }else if (sexoDados.intern() == "F" || sexoDados.intern() == "f"){
                mulher++;
            }
        }

        //MEDIA ALTURA HOMEM SEGUNDA PARTE
        mediaAlturaHomem = alturaHomem / homem;

            System.out.println(
                "\n_____________________________________________\n" +
                "\nForam registradas ao todo 10 pessoas."+
                "\nOs dados coletados são: \n" +
                "\nMaior altura: "+ maiorAltura + 
                "\nMenor altura: "+ menorAltura +
                "\nMedia de altura Homens: " + mediaAlturaHomem +
                "\nQuantidade de mulher: " + mulher + 
                "\n_____________________________________________\n"
                );

        sexo.close();
        altura.close();
    }
}