package com.example.listsaga;

import java.util.ArrayList;
import java.util.List;

public class Saga {
    public String nome;
    public int img;

    public Saga(String nome, int img) {
        this.nome = nome;
        this.img = img;
    }

    public static List<Saga> getSaga(){
        List<Saga> sagas = new ArrayList<>();
        sagas.add(new Saga("Harry Potter e a Pedra  Filosofal", R.drawable.book_01));
        sagas.add(new Saga("Harry Potter e a Câmara Secreta", R.drawable.book_02));
        sagas.add(new Saga("Harry Potter e o Prisioneiro de Azkabam", R.drawable.book_03));
        sagas.add(new Saga("Harry Potter e o Cálice de Fogo", R.drawable.book_04));
        sagas.add(new Saga("Harry Potter e a Ordem da Fênix", R.drawable.book_05));
        sagas.add(new Saga("Harry Potter e o Enigma do Príncipe", R.drawable.book_06));
        sagas.add(new Saga("Harry Potter e as Relíquias da Morte", R.drawable.book_07));
        return sagas;
    }
}
