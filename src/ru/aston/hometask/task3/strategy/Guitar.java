package ru.aston.hometask.task3.strategy;

public class Guitar implements TechniqueStrategy {
    @Override
    public String execute() {
        return "Strumming";
    }
}
