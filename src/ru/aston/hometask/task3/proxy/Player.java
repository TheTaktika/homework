package ru.aston.hometask.task3.proxy;

public class Player {

    public static void execute() {
        AudioTrack track1 = new AudioTrackProxy("BFG_Division.mp3", "BFG Division", "Mick Gordon");
        AudioTrack track2 = new AudioTrackProxy("Guitar, Loneliness and Blue Planet.mp3", "Guitar, Loneliness and Blue Planet", "kessoku band");

        track1.showInfo();
        track2.showInfo();
        track1.play();
        track2.play();
    }
}
