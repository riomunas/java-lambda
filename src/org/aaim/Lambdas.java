package org.aaim;

public class Lambdas {
  public static void main(String[] args) {

    Cat myCat = new Cat();
    myCat.print();

    printThing(myCat);

    printThing(
      () -> {
        System.out.println("Meow with lambda 1");
      }
    );

    printThing(() -> System.out.println("Meow with lambda 2"));

    Printable printable = () -> System.out.println("Meow with lambda 3");
    printThing(printable);

    sayHi((prefix -> System.out.println("Hi... with lambda 4")));
    sayHi((prefix -> System.out.println(prefix+"Hi... with lambda 5")));

    String result = sayHello(() -> "Hello");
    System.out.println(result);

  }

  public static void printThing(Printable thing) {
    thing.print();
  }

  public static void sayHi(SayHi thing) {
    thing.hi("--> ");
  }

  public static String sayHello(SayHello thing) {
    return thing.hello();
  }

}
