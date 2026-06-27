package ru.aston.hometask.task3.ChainOfResponsibilities;

public class Performance {
    private final Newbie newbie;
    private final SemiProfessional semi;
    private final Professional pro;

    public Performance() {
        this.newbie = new Newbie();
        this.semi = new SemiProfessional();
        this.pro = new Professional();

        newbie.setNextLogic(semi);
        semi.setNextLogic(pro);
    }

    public void askQuestion(int priority, String message) {
        newbie.logic(priority, message);
    }
}
