package org.aaim;

public class Cat implements Printable {
  private String name;
  private String gender;
  @Override
  public void print() {
    System.out.println("Meow");
  }
}
