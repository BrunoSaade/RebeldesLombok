import com.saadebruno.ERebeldes;
import com.saadebruno.RebeldesLombok;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class RebeldesApplication {
    public static void main(String[] args) {

        String nome;
        int idade;
        ERebeldes raca = ERebeldes.Humano;
        int opcao;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        boolean opcaoInvalida = true;
        String opcaoContinuar;



        try {
            while (flag) {
                System.out.println("Digite o nome:");
                nome = sc.next();

                System.out.println("Digite a idade:");
                idade = sc.nextInt();

                System.out.println("Escolha a raça:");
                System.out.println("1 - Humano");
                System.out.println("2 - Gree");
                System.out.println("3 - Rakata");
                opcao = sc.nextInt();
                System.out.println(opcao);

                while (opcaoInvalida) {
                    switch (opcao) {
                        case 1:
                            raca = ERebeldes.Humano;
                            opcaoInvalida = false;
                            break;
                        case 2:
                            raca = ERebeldes.Gree;
                            opcaoInvalida = false;
                            break;
                        case 3:
                            raca = ERebeldes.Rakata;
                            opcaoInvalida = false;
                            break;
                        default:
                            opcaoInvalida = true;
                            System.out.println("Opção inválida");
                            break;
                    }
                }

                RebeldesLombok rebeldesLombok = new RebeldesLombok(nome, idade, raca);

                RebeldesLombok rebeldesBuilder = RebeldesLombok.builder()
                        .nome(nome)
                        .idade(idade)
                        .raca(raca)
                        .build();

                rebeldesLombok.imprimirListaRebeldes(rebeldesBuilder.getNome(), rebeldesBuilder.getIdade(), rebeldesBuilder.getRaca());

                System.out.println("Deseja cadastrar mais rebelde(s)? <s/n>");
                opcaoContinuar = sc.next();
                if (opcaoContinuar.equalsIgnoreCase("n")) {
                    break;
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
