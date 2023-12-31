package com.assignment;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//import static com.assignment.Main.Gender.FEMALE;
//import static com.assignment.Main.Gender.MALE;

public class Main {

    static int sumOfNum(int num1, int num2){
        return num1 + num2;
    }

    static int productOfNum(int num1, int num2, int num3, int num4) {
        return num1 * num2 * num3 * num4;
    }

    static void diffrenceOfNum() {
        int num1 = sumOfNum(5, 9);
        int num2 = productOfNum(7, 3, 2, 4);

        System.out.println("Difference: " + (num2 - num1));
    }

    static void studentGrade(int ca1, int ca2, int ca3) {
        int sumOfCas = ca1 + ca2 + ca3;
        if (sumOfCas >= 70) System.out.println("A");
        else if (sumOfCas >= 60) System.out.println("B");
        else if (sumOfCas >= 50) System.out.println("C");
        else System.out.println("FAIL!");
    }

    static void printThing(Printable thing) {
        thing.print();
    }

    public static void main(String[] args) {

//        diffrenceOfNum();

//        Scanner scanner = new Scanner(System.in);
//        scanner.useRadix(2);
//
//        System.out.print("Input Radix: ");
//        int s = scanner.nextInt();
//        System.out.println(s);

//        Data Types
//        System.out.println("Int max: " + Integer.MAX_VALUE);
//        System.out.println("Int min: " + Integer.MIN_VALUE);
//        System.out.println("Int bytes: " + Integer.BYTES);

//        studentGrade(20, 30, 40);
//        studentGrade(20, 0, 4);
//        studentGrade(2, 10, 45);
//        studentGrade(21, 1, 35);
//        studentGrade(80, 1, 35);
//        studentGrade(21, 5, 35);
//
//        printThing(() -> System.out.println("Meow"));

//        List<Person> people = List.of(
//            new Person("David", MALE),
//            new Person("Samuel", MALE),
//            new Person("Olajide", MALE),
//            new Person("Queen", FEMALE),
//            new Person("Paul", FEMALE )
//        );
////        Imperative Approach
//        List<Person> females = new ArrayList<>();
//
//        for (Person person : people) {
//            if (FEMALE.equals(person.gender)) {
//                females.add(person);
//            }
//        }
//
//        for (Person female : females) {
//            System.out.println(female);
//        }
//
////        Declarative Approach
//        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
//        List<Person> females2 = people.stream()
//                .filter(personPredicate)
//                .toList();
//
//        females2.forEach(System.out::println);
//
//    }
//
//    public static  class Person {
//        private final String name;
//        public final Gender gender;
//
//        public Person(String name, Gender gender) {
//            this.name = name;
//            this.gender = gender;
//        }
//
//        @Override
//        public String toString() {
//            return "Person{" +
//                    "name='" + name + '\'' +
//                    ", gender=" + gender +
//                    '}';
//        }
//    }
//
//    public enum Gender {
//        MALE, FEMALE

//        areaOfShape();

//        Format Specifier
        int x = 10;
        float y = 2.44f;
        String str = "David is a good boy";

//        System.out.printf("%07.1f \n", y);
//        System.out.printf("%20s", str);

//        Strings
        String str1 = "Java Program";
        String str2 = new String("Java");
        str2 =  "Javac";

        char c[] = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(c, 1, 3);

        byte b[]  = {65, 66, 67, 68};
        String str4 = new String(b, 1, 3);

//        System.out.println(str4);

        String str5 = "Java";
        String str6 = "Java";

        str5 = "jaca";

//        System.out.println(str6);

//        checkIfGmailAndSeparateNameAndDomain("david@gmail.com");
//        isBinary(10011100);
//        isCorrectFormat("21/12/2120");
        String s = "a!B@c#1$2%3D";
        String s1 = "   abc    def    ehi   jkl   ";

//        System.out.println(s1.replaceAll("\\s+", " ").trim());

//        findRadixOf("10011101");
//        findRadixOf("112332999");
//        findRadixOf("11234567");
//        findRadixOf("1AD3229");
//
//        printProtocol("http://www.google.com");
//        printProtocol("ftp://www.google.org");
//        printProtocol("fttp://www.google.orw");

//        for (int i = 0, j = 2; i < 10; i++, j = j*2) {
//            System.out.println(i + " " + j);
//        }

//        displayDigit(12521);
//        printNumInWord(1700);
//          arithmeticProgression(7, 2, 5);

//        How to instantiate an abstract class
//          Account d = new Account() {
//              @Override
//              public void dispenseMoney(String amount) {
//
//              }
//          };
        List<Integer> coins = Arrays.asList(5,2,3);//Correct
        List<Integer> coins1 = Arrays.asList(1,2);//Correct
        List<Integer> coins2 = Arrays.asList(5,2,3,6,4,5,1,2,4,7);//Wrong
        System.out.println(todaysAlgo(10, coins));
        System.out.println(todaysAlgo(4, coins1));
        System.out.println(todaysAlgo(20, coins2));
    }

//    Area of a Shape(✔)
    static void areaOfShape() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Base of Shape/a: ");
        float base = scanner.nextFloat();

        System.out.println("Enter Height of Shape/b: ");
        float height = scanner.nextFloat();

        System.out.println("Enter c: ");
        float c = scanner.nextFloat();
//        Formula 1
        double area = 0.5 * (base * height);
        System.out.println("Area of shape is:  " + area);
//        Formula 2
        double S = 0.5 *(base + height + c);
        double area2 = Math.sqrt(S * ((S - base) * (S - height) * (S - c)));
        System.out.println("Area2 is : " + area2);
    }

    static void checkIfGmailAndSeparateNameAndDomain(String s) {
        int indexOfAt = s.indexOf('@');
        String name = s.substring(0, indexOfAt);
        String domain= s.substring(indexOfAt + 1);
        boolean isGmail = domain.startsWith("gmail");

        System.out.println(isGmail);
        System.out.println(name);
        System.out.println(domain);
    }

    static void isBinary(int b) {
        String strOfB = b + "";
        boolean isBinary = strOfB.matches("[01]+");

        System.out.println(isBinary);
    }

    static void isCorrectFormat(String str) {
        System.out.println(str.matches("[0-3][0-9]/[01][0-9]/\\d*"));
    }

    static void findRadixOf(String str) {
        if (str.matches("[01]+")) System.out.println("Binary Radix=2");
        else if (str.matches("[0-7]+")) System.out.println("Octal Radix=8");
        else if (str.matches("[0-9]+")) System.out.println("Decimal Radix=10");
        else if (str.matches("[0-9A-F]+")) System.out.println("Hexadecimal Radix=16");
    }

    static void printProtocol(String url) {
        int indexOfDot = url.lastIndexOf(".");
        String domain = url.substring(indexOfDot + 1);

        if(url.startsWith("http")) System.out.println("http - Hypertext Transfer Protocol");
        else if(url.startsWith("ftp")) System.out.println("ftp - File Transfer Protocol");
        else System.out.println("Invalid Protocol");

        if(domain.equals("com")) System.out.println("com - Commercial");
        else if(domain.equals("org")) System.out.println("org - Organisation");
        else System.out.println("🥹");
    }

    static void displayDigit(int num) {
//        for(int quotient = num/10;quotient != 0; quotient = quotient/10) {
//            System.out.println(remainder);
//            remainder = quotient % 10;
//        }
//        System.out.println(remainder);
//        do{

//        }while (quotient != 0);
        int originalNum = num;
        int remainder;
        int count = 0;
        int armstrong = 0;
        int reversedNum = 0;

        while (num != 0) {
            remainder = num % 10;
            num = num/10;
            armstrong += Math.pow(remainder, 3);
            System.out.println(remainder);
            reversedNum = reversedNum * 10 + remainder;
            count++;
        }
        System.out.println("Count = " + count);
        System.out.println("Reversed Number = " + reversedNum);

        if (armstrong == originalNum) System.out.println("Number is Armstrong");
        else System.out.println("Number is not Armstrong");

        if (reversedNum == originalNum) System.out.println("Number is Palindrome");
        else System.out.println("Number is not Palindrome");
    }

    static void printNumInWord(int num) {
        String strNum[] = String.valueOf(num).split("");
        for(String c : strNum) {
            switch (c) {
                case "0":
                    System.out.println("Zero");
                    break;
                case "1":
                    System.out.println("One");
                    break;
                case "2":
                    System.out.println("Two");
                    break;
                case "3":
                    System.out.println("Three");
                    break;
                case "4":
                    System.out.println("Four");
                    break;
                case "5":
                    System.out.println("Five");
                    break;
                case "6":
                    System.out.println("Six");
                    break;
                case "7":
                    System.out.println("Seven");
                    break;
                case "8":
                    System.out.println("Eight");
                    break;
                case "9":
                    System.out.println("Nine");
                    break;
            }
        }
    }

    static void arithmeticProgression(int start, int diff, int numOfTime) {
        int newStart = start;
        for (int i = 0; i < numOfTime; i++) {
            System.out.print(newStart + ",");
            if (i == numOfTime-1) System.out.print(newStart+diff);
            newStart += diff;
        }
    }

    static int todaysAlgo(int money, List<Integer> coins) {

        int count = 0;
        int sum = 0;

        for (Integer coin : coins) {
            if (money % coin == 0) count++;
            sum += coin;
            for (Integer integer : coins) {
                if (coin + integer == money) count++;
            }
        }
        if(sum == money) count++;

        return count;
    }

}