package org.example.singleton;

public class Main {
    public static void main(String[] args) {
        DataBasemanager.getINSTANCE().queryDb();
    }
}