package com.saadebruno;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public interface IRebeldes {
    void imprimirListaRebeldes(String nome, int idade, ERebeldes raca) throws FileNotFoundException, UnsupportedEncodingException;
}
