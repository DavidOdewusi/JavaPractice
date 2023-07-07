package com.assignment.Streams;

import com.assignment.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.assignment.Streams._Stream.Gender.*;


public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("David", MALE),
                new Person("Samuel", MALE),
                new Person("Olajide", MALE),
                new Person("Queen", FEMALE),
                new Person("Cucks", PREFER_NOT_TO_SAY),
                new Person("Paul", FEMALE)
        );

        people.stream()
                .map(person -> person.name)
                .collect(Collectors.toSet())
                .forEach(System.out::println);


    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE,PREFER_NOT_TO_SAY
    }
}
