package com.company;

import static java.lang.Thread.sleep;

public class NumberGenerator implements Runnable{

    private String name;

    public NumberGenerator(String name) {
        this.name = name;
    }

    public NumberGenerator() {

    }

    @Override
    public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }

