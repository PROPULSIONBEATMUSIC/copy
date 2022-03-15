package ru.fadesml.patterns.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public abstract class Person {
    private Grade grade;
    private Sex sex;
    public enum Sex {
        MALE,
        FEMALE
    }
    public enum Grade {
        GRAND,
        PARENT,
        CHILD
    }
}
