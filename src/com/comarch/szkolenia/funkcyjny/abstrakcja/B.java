package com.comarch.szkolenia.funkcyjny.abstrakcja;

public interface B extends C {
    void b();
    default void x() {
        // jakis kod z interfejsu B
    }
}
