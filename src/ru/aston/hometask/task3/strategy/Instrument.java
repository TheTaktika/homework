package ru.aston.hometask.task3.strategy;

public enum Instrument {
    GUITAR(new Guitar()),
    BASS_GUITAR(new BassGuitar()),
    ACOUSTIC_GUITAR(new AcousticGuitar()),
    DRUMS(new Drums()),
    PIANO(new Piano()),
    VOICE(new Voice());

    private final TechniqueStrategy strategy;

    Instrument(TechniqueStrategy strategy) {
        this.strategy = strategy;
    }

    public TechniqueStrategy getStrategy() {
        return this.strategy;
    }
}
