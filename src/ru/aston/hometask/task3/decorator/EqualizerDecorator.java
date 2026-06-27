package ru.aston.hometask.task3.decorator;

public class EqualizerDecorator extends TrackDecorator {
    public EqualizerDecorator(AudioTrack track) {
        super(track);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Bass");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + equalizer";
    }
}
