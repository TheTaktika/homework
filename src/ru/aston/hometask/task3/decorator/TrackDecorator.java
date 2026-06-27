package ru.aston.hometask.task3.decorator;

public abstract class TrackDecorator implements AudioTrack {
    protected AudioTrack decoratedTrack;

    public TrackDecorator(AudioTrack track) {
        this.decoratedTrack = track;
    }

    @Override
    public void play() {
        decoratedTrack.play();
    }

    @Override
    public String getDescription() {
        return decoratedTrack.getDescription();
    }
}
