package ru.fadesml.patterns.factory;

import ru.fadesml.patterns.entity.Person;

public interface FamilyFactory {
    Person createGrand();
    Person createParent();
    Person createChild();
}
