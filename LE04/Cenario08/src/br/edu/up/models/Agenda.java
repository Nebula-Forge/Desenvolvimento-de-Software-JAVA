package br.edu.up.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionar(Comercial contato) {
        contatos.add(contato);
    }

    public void adicionar(Pessoal contato) {
        contatos.add(contato);
    }

    public void getContato(int codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                System.out.println(contato);
            }
        }
    }

    public void excluirContato(int codigo) {
        Iterator<Contato> iterator = contatos.iterator();
        while (iterator.hasNext()) {
            Contato contato = iterator.next();
            if (contato.getCodigo() == codigo) {
                iterator.remove(); // Remove o contato usando o iterador
            }
        }
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
}
