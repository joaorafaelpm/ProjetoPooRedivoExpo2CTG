package com.java.sgc.util;

import com.java.sgc.util.Exceptions.AnoValidoException;
import com.java.sgc.util.Exceptions.IdadeValidaException;
import com.java.sgc.util.Exceptions.NomeInvalidoException;

public class Validacoes {

    public static int idadeEValida(int idade) {
        try {
            if (idade <= 0 || idade >= 120 ) {
            throw new NomeInvalidoException(
                String.format("A idade: '%d' é inválida!" , idade)
            );
            }

            return idade;
        } catch (NumberFormatException e) {
            throw new IdadeValidaException(
                String.format("A idade: '%d' é inválida!" , idade)
            );
        }
        
    }

    public static String textoEValido (String texto) {
        if (texto == null || texto.trim().isBlank()) {
            throw new NomeInvalidoException(
                String.format("O texto: '%s' é inválido!" , texto)
            );
        }
        if (!texto.matches("^[A-Za-zÀ-ÿ]+$")) {
            throw new NomeInvalidoException(
                String.format("O texto: '%s' não deve conter caracteres inválidos!" , texto)
            );
        }
        return texto;
    }

    public static String anoValido (String ano) {
        try {
            char charAt = ano.charAt(0);
            int int1 = Integer.parseInt(String.valueOf(charAt));
            if (int1 > 1 && int1 < 3) {
                return ano;
            }
            throw new AnoValidoException(
                String.format("O ano é inválido : '%s'" , ano)
            );
        }
        catch (NumberFormatException e) {
            throw new AnoValidoException(
                String.format("O ano é inválido : '%s'" , ano)
            );
        }
        
    }

}
