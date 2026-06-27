package ru.aston.hometask.task3.ChainOfResponsibilities;

public class Main {
    public static void main(String[] args) {
        Performance performance = new Performance();

        performance.askQuestion(1, "Play a few notes");
        performance.askQuestion(2, "play <Bad Apple>");
        performance.askQuestion(3, "play only one hand");
        performance.askQuestion(99, "do something");
    }
}
