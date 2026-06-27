package ru.aston.hometask.task3.strategy;

public class Piano implements TechniqueStrategy {
    @Override
    public String execute() {
        return "Comping";
    }
}
