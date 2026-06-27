package ru.aston.hometask.task3.strategy;

public class Artist {
    private TechniqueStrategy strategy;

    public void setStrategy(TechniqueStrategy strategy) {
        this.strategy = strategy;
    }

    public TechniqueStrategy getStrategy() {
        return strategy;
    }

    public String perform() {
        if (strategy == null) {
            return "The artist does nothing";
        }
        return strategy.execute();
    }
}
