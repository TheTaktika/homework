package ru.aston.hometask.task3.strategy;

public class Concert {

    public static void start() {
        Artist artist1 = new Artist();
        Artist artist2 = new Artist();
        Artist artist3 = new Artist();
        Artist artist4 = new Artist();
        artist1.setStrategy(Instrument.GUITAR.getStrategy());
        artist2.setStrategy(Instrument.ACOUSTIC_GUITAR.getStrategy());
        artist3.setStrategy(Instrument.DRUMS.getStrategy());
        artist4.setStrategy(Instrument.VOICE.getStrategy());
        System.out.println("Music start playing~~~ " + artist1.perform() + " " + artist2.perform() + " " + artist3.perform() + " " + artist4.perform());
    }
}
