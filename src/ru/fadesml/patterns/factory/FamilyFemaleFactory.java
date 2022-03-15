package ru.fadesml.patterns.factory;

import ru.fadesml.patterns.entity.Daughter;
import ru.fadesml.patterns.entity.GrandMother;
import ru.fadesml.patterns.entity.Mother;
import ru.fadesml.patterns.entity.Person;

public class FamilyFemaleFactory implements FamilyFactory{
    @Override
    public Person createGrand() {
        return new GrandMother();
    }
    @Override
    public Person createParent() {
        return new Mother();
    }
    @Override
    public Person createChild() {
        return new Daughter();
    }
}
