package by.epam.task16_2.domain;

/**
 * Created by Владислав on 09.07.2016.
 */

public class Fork {
    /*
    Поле number введено для решения проблемы взаимной блокировки.
    Философ всегда берёт сначала вилку с наименьшим номером,
    а потом вилку с наибольшим номером из двух доступных.
    Далее, философ кладёт сначала вилку с бо́льшим номером, потом — с меньшим.
    Таким образом вилка с наибольшим номером может быть доступна толкьо одному
    философу, что гарантирует заполучение этим фолософом 2ух вилок.
     */
    private int number;

    public Fork(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
