package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {
    public Turtle zofka;

    public void start() {

        zofka = new Turtle();
        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(400);
        zofka.penDown();

        slunce();

        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(150);
        zofka.penDown();

        dum();

        mezeraDum();

        dum();

        mezeraDum();

        dum();

        mezeraDum();

        dum();

        zofka.turnLeft(45);
        zofka.penUp();
        zofka.move(300);
        zofka.turnRight(90);
        zofka.penDown();

        dum();

        zofka.turnLeft(45);
        zofka.penUp();
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.move(800);
        zofka.turnLeft(90);
        zofka.penDown();

        dum();

        zofka.turnLeft(45);
        zofka.penUp();
        zofka.move(900);
        zofka.turnRight(90);
        zofka.penDown();

        dum();

        zofka.turnRight(135);
        zofka.penUp();
        zofka.move(400);
        zofka.turnLeft(90);
        zofka.move(200);
        zofka.turnLeft(180);
        zofka.penDown();

        prase();

        zofka.turnRight(135);
        zofka.penUp();
        zofka.move(300);
        zofka.turnLeft(180);
        zofka.penDown();

        pismenoE();

        mezeraPismeno();

        pismenoV();

        mezeraPismeno();

        pismenoA();

        mezeraPismeno();
    }

    public void prase() {

        for (int i = 0; i < 2; i++) {
            zofka.move(100);
            zofka.turnRight(90);
            zofka.move(150);
            zofka.turnRight(90);
        }

        zofka.turnLeft(45);

        for (int i = 0; i < 2; i++) {
            zofka.move(70);
            zofka.turnRight(90);
        }

        zofka.turnLeft(315);
        zofka.move(100);

        zofka.turnRight(45);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);

        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);

        zofka.turnRight(135);
        zofka.move(150);

        zofka.turnRight(45);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);

        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);

        zofka.turnLeft(45);
        zofka.move(100);
        zofka.turnRight(45);
        zofka.move(30);

    }

    public void osmiuhelnik() {

        for (int i = 0; i < 8; i++) {
            zofka.turnLeft(45);
            zofka.move(100);
        }

    }

    public void kolo() {

        for (int i = 0; i < 18; i++) {
            zofka.move(40);
            zofka.turnLeft(20);
        }

    }

    public void slunce() {

        for (int i = 0; i < 12; i++) {
            zofka.move(20);
            zofka.turnRight(75);
            zofka.move(10);
            zofka.turnRight(180);
            zofka.move(10);
            zofka.turnRight(75);
        }

    }

    public void dum() {

        for (int i = 0; i < 2; i++) {
            zofka.move(150);
            zofka.turnRight(90);
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.turnRight(135);
        for (int i = 0; i < 2; i++) {
            zofka.move(70);
            zofka.turnLeft(90);
        }

    }

    public void mezeraDum() {

        zofka.turnLeft(45);
        zofka.penUp();
        zofka.move(300);
        zofka.turnRight(90);
        zofka.penDown();

    }

    public void pismenoE() {

        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.move(30);

    }

    public void pismenoV() {

        zofka.turnLeft(70);
        zofka.move(65);
        zofka.turnLeft(180);
        zofka.move(65);
        zofka.turnRight(140);
        zofka.move(65);
        zofka.turnLeft(180);
        zofka.move(65);
        zofka.turnLeft(70);

    }

    public void pismenoA() {

        zofka.turnLeft(70);
        zofka.move(65);
        zofka.turnRight(140);
        zofka.move(65);
        zofka.turnLeft(180);
        zofka.move(25);
        zofka.turnLeft(70);
        zofka.move(25);
        zofka.turnLeft(180);
        zofka.move(25);
        zofka.turnRight(70);
        zofka.move(25);
        zofka.turnLeft(70);

    }

    public void mezeraPismeno() {

        zofka.penUp();
        zofka.move(50);
        zofka.penDown();

    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}



