package org.example;


public class App {

    public static void main(String[] args) {
        Life l = new Life();
        //Edit for master
        //System.out.println(l.randState(9,8));
        l.renderBoard(l.randState(50,100));
    }
}

