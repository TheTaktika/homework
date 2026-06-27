package ru.aston.hometask.task3.decorator;

public class SimpleTrack implements AudioTrack {
    private String title;

    public SimpleTrack(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public String getDescription() {
        return title;
    }
}
