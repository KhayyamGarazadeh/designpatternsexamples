package org.example.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee orxan = new Employee("Orxan", "Aliyev");
        Employee cloneOrxan = orxan.clone();
        System.out.println(orxan == cloneOrxan); //output: false
    }
}

