package org.example.prototype;

public class Employee implements IClonablePrototype<Employee> {
    String firstName;
    String lastName;


    public Employee(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public Employee clone() throws CloneNotSupportedException {
            return (Employee) super.clone();
        }
    }

