package ru.aston.hometask.task3.decorator;

public class DistortionDecorator extends TrackDecorator {
    public DistortionDecorator(AudioTrack track) {
        super(track);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Distortion");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + DS";
    }
}