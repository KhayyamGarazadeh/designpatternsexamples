package org.example.prototype;

public interface IClonablePrototype<TPrototype> extends Cloneable {

    TPrototype clone() throws CloneNotSupportedException;
}
