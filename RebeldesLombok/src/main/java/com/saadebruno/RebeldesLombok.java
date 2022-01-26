package com.saadebruno;

import lombok.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RebeldesLombok implements IRebeldes {

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private int idade;

    @Getter
    @Setter
    private ERebeldes raca;

    @Override
    public void imprimirListaRebeldes(String nome, int idade, ERebeldes raca) throws FileNotFoundException, UnsupportedEncodingException {
        @Cleanup PrintWriter writer = new PrintWriter("rebeldes-lombok.txt", "UTF-8");
        writer.println("Lista de Rebeldes");
        writer.println("Nome: " + nome + ", Idade: " + idade + ", Raça: " + raca + ";");
        writer.append("\n");
    }
}
