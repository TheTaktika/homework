package ru.aston.hometask.task3.adapter;

public class Artist {

    public void connectToPc() {
        Guitar guitar = new Guitar();
        PersonalComputer pc = new CableAdapter(guitar);
        String chord = "E-Am-C-Dm";

        pc.play(chord);
    }

}
