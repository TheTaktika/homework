package ru.aston.hometask.task3.ChainOfResponsibilities;

abstract class Logic {
    protected int priority;
    protected Logic nextLogic;

    public void setNextLogic(Logic nextLogic) {
        this.nextLogic = nextLogic;
    }

    public void logic(int messagePriority, String message) {
        if (messagePriority < 1 || messagePriority > 3) {
            System.out.println("Priority must be from 1 to 3, your number is: " + messagePriority);
            return;
        }
        if (this.priority == messagePriority) {
            write(message);
            return;
        }
        if (nextLogic != null) {
            nextLogic.logic(messagePriority, message);
        } else {
            System.out.println("Error: invalid priority - " + messagePriority);
        }
    }

    protected abstract void write(String message);
}

class Newbie extends Logic {
    public Newbie() {
        this.priority = 1;
    }

    protected void write(String message) {
        System.out.println(message);
    }
}

class SemiProfessional extends Logic {
    public SemiProfessional() {
        this.priority = 2;
    }

    protected void write(String message) {
        System.out.println(message);
    }
}

class Professional extends Logic {
    public Professional() {
        this.priority = 3;
    }

    protected void write(String message) {
        System.out.println(message);
    }
}

