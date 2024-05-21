package org.example.singleton;

public class DataBasemanager {

    private static volatile DataBasemanager INSTANCE = null;

    private DataBasemanager() {
    }
    public static DataBasemanager getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (DataBasemanager.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DataBasemanager();
                }
            }
        }
        return INSTANCE;
    }
    public void queryDb() {
    }
}
