package ru.aston.hometask.task3.adapter;

public class CableAdapter implements PersonalComputer {
    private Guitar guitar;

    public CableAdapter(Guitar guitar) {
        this.guitar = guitar;
    }

    @Override
    public void play(String chord) {
        guitar.perform(chord);
    }
}
