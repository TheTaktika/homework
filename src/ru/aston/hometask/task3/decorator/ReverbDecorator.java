package ru.aston.hometask.task3.decorator;

public class ReverbDecorator extends TrackDecorator {
    public ReverbDecorator(AudioTrack track) {
        super(track);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Reverb");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + reverb";
    }
}