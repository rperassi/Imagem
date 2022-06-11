package exerciciossala;
import java.util.Scanner;
public class d3005ex004 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        //DESENHOOOO
        int caderno[][] = new int[16][16];
        int i, j;
        
        System.out.printf("Seja Bem-Vindo! Desenho livre!\n");
        System.out.printf("==== PALETA DE CORES ====\n (0) - Branco\n (1) - Preto\n (2) - Vermelho\n (3) - Bege\n");
        
        for(i=0; i < 16; i++)
        {
            for(j=0; j < 16; j++)
            {
                System.out.printf("\nDigite o numero referente a cor que voce deseja pintar a posição %dx%d da matriz: ", i, j);
                caderno[i][j] = ler.nextInt(); 
            }
        }
        
        for(i=0; i < 16; i++)
        {
            System.out.printf("\n");
            for(j=0; j < 16; j++)
            {
                System.out.printf(" %d", caderno[i][j]);
                 
            }
        }

    }
}