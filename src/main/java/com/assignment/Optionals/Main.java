package com.assignment.Optionals;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<IllegalStateException> exception = () -> new IllegalStateException("exception");
        Optional.ofNullable("davidodewusi@gmail.com")
                .ifPresentOrElse(email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Cannot send email"));

//        System.out.println();
    }
}
