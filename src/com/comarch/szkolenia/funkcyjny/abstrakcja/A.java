package com.comarch.szkolenia.funkcyjny.abstrakcja;

public interface A {
    void a();
    default void x() {
        // jakis kod z interfejsu A
    }
}
