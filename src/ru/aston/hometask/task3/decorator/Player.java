package ru.aston.hometask.task3.decorator;

public class Player {

    public static void execute() {
        System.out.println("Track 1:");
        AudioTrack track1 = new SimpleTrack("Abnormalize");
        System.out.println("Title: " + track1.getDescription());
        track1.play();

        System.out.println("Track 2:");
        AudioTrack track2 = new ReverbDecorator(new SimpleTrack("Promise"));
        System.out.println("Title: " + track2.getDescription());
        track2.play();

        System.out.println("Track 3:");
        AudioTrack track3 = new DistortionDecorator(new SimpleTrack("ヨルシカ - あぶく"));
        System.out.println("Title: " + track3.getDescription());
        track3.play();

        System.out.println("Track 4:");
        AudioTrack track4 = new EqualizerDecorator(new DistortionDecorator(new SimpleTrack("Crazy Train")));
        System.out.println("Title: " + track4.getDescription());
        track4.play();
    }
}
