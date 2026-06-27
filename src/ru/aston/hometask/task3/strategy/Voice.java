package ru.aston.hometask.task3.strategy;

public class Voice implements TechniqueStrategy {
    @Override
    public String execute() {
        return "Singing";
    }
}
