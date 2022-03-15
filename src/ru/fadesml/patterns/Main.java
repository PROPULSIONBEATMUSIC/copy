package ru.fadesml.patterns;
/**
 * Копирование чего то
 * @author Kirill
 * @version 1.0
 */

import ru.fadesml.patterns.factory.FamilyFactory;
import ru.fadesml.patterns.factory.FamilyFemaleFactory;
import ru.fadesml.patterns.factory.FamilyMaleFactory;

import static ru.fadesml.patterns.entity.Person.Grade.PARENT;
import static ru.fadesml.patterns.entity.Person.Sex.MALE;

public class Main {
    public static final FamilyFactory maleFactory = new FamilyMaleFactory();
    public static final FamilyFactory femaleFactory = new FamilyFemaleFactory();

    public static void main(String[] args) {
        System.out.println(maleFactory.createChild().getClass());
        System.out.println(maleFactory.createParent().getClass());
        System.out.println(maleFactory.createGrand().getClass());
        Person personOne = new Person(PARENT, MALE);
        System.out.println(personOne);

        Person copy = (Person) personOne.copy();
        System.out.println(copy);
    }

    interface Copyable{
        Object copy();
    }
    static class Person implements Copyable {
        private ru.fadesml.patterns.entity.Person.Grade grade;
        private ru.fadesml.patterns.entity.Person.Sex sex;

        public Person(ru.fadesml.patterns.entity.Person.Grade grade, ru.fadesml.patterns.entity.Person.Sex sex) {
            this.grade = grade;
            this.sex = sex;
        }
        @Override
        public String toString() {
            return "Person{" +
                    "grade=" + grade +
                    ", sex=" + sex +
                    '}';
        }
        public Object copy() {
            Person copy = new Person(grade, sex);
            return copy;
        }
    }
}