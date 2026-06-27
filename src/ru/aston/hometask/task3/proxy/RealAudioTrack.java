package ru.aston.hometask.task3.proxy;

public class RealAudioTrack implements AudioTrack {
    private String filename;
    private String title;
    private String artist;

    public RealAudioTrack(String filename, String title, String artist) {
        this.filename = filename;
        this.title = title;
        this.artist = artist;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Download... " + filename + " from disk (MP3, 10 MB)");
        System.out.println("Complete");
    }

    @Override
    public void play() {
        System.out.println("Playing audio... " + title);
    }

    @Override
    public void showInfo() {
        System.out.println("Info: " + title + ", artist: " + artist);
    }
}
