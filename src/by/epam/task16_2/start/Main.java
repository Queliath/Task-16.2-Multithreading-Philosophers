package by.epam.task16_2.start;

import by.epam.task16_2.domain.Fork;
import by.epam.task16_2.service.Philosopher;

/**
 * Created by Владислав on 09.07.2016.
 */
public class Main {
    public static void main(String[] args){
        Fork fork1 = new Fork(1);
        Fork fork2 = new Fork(2);
        Fork fork3 = new Fork(3);
        Fork fork4 = new Fork(4);
        Fork fork5 = new Fork(5);

        Philosopher aristotle = new Philosopher("Aristotle", fork1, fork2);
        Philosopher socrates = new Philosopher("Socrates", fork2, fork3);
        Philosopher plato = new Philosopher("Plato", fork3, fork4);
        Philosopher democritus = new Philosopher("Democritus", fork4, fork5);
        Philosopher pythagoras = new Philosopher("Pythagoras", fork5, fork1);

        new Thread(aristotle).start();
        new Thread(socrates).start();
        new Thread(plato).start();
        new Thread(democritus).start();
        new Thread(pythagoras).start();

        try {
            Thread.sleep(10000);
            aristotle.stopRunning();
            socrates.stopRunning();
            plato.stopRunning();
            democritus.stopRunning();
            pythagoras.stopRunning();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
