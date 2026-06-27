package ru.aston.hometask.task3.proxy;

public class AudioTrackProxy implements AudioTrack {
    private String filename;
    private String title;
    private String artist;
    private RealAudioTrack realTrack;

    public AudioTrackProxy(String filename, String title, String artist) {
        this.filename = filename;
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void showInfo() {
        System.out.println("Info From Proxy: " + title + ", artist: " + artist);
    }

    @Override
    public void play() {
        if (realTrack == null) {
            realTrack = new RealAudioTrack(filename, title, artist);
            System.out.println("--Proxy-- File downloaded");
        }
        realTrack.play();
    }
}
