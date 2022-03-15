package ru.fadesml.patterns.factory;

import ru.fadesml.patterns.entity.Father;
import ru.fadesml.patterns.entity.GrandFather;
import ru.fadesml.patterns.entity.Person;
import ru.fadesml.patterns.entity.Son;

public class FamilyMaleFactory implements FamilyFactory{
    @Override
    public Person createGrand() {
        return new GrandFather();
    }

    @Override
    public Person createParent() {
        return new Father();
    }

    @Override
    public Person createChild() {
        return new Son();
    }
}