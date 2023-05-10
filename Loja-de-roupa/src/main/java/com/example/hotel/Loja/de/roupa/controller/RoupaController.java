package com.example.hotel.Loja.de.roupa.controller;

import com.example.hotel.Loja.de.roupa.dominio.Roupa;

public class RoupaController {

    public boolean isRoupaValido(Roupa roupa) {
        return isPrecoValido(roupa) && isTipoValido(roupa) && isTamanhoValido(roupa);
    }

    private boolean isPrecoValido(Roupa roupa) {
        if ((roupa.getPreco() == null) || roupa.getPreco() == 0) {
            return false;
        }

        return true;

    }

    public boolean isTipoValido(Roupa roupa) {
       if ((roupa.getTipo().isEmpty())) {
           return false;
    }

    return true;

    }

    public boolean isTamanhoValido(Roupa roupa) {
        if ((roupa.getTamanho().isEmpty() || roupa.getTamanho().length() > 3)) {
            return false;
    }

        return true;

    }
}