package ru.aston.hometask.task3.strategy;

public class AcousticGuitar implements TechniqueStrategy {
    @Override
    public String execute() {
        return "Fingerstyle";
    }
}
