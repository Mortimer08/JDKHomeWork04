package org.example;

public class Main {
    public static void main(String[] args) {
        Directory dir = new Directory();
        dir.addEmployee(new Emplyee(1,"28989436927","John", 6));
        dir.addEmployee(new Emplyee(2,"289374891111","Mel", 1));
        dir.addEmployee(new Emplyee(3,"789748927","Gill", 2));
        dir.addEmployee(new Emplyee(7,"78974238927","Gill", 3));
        dir.addEmployee(new Emplyee(4,"12343748927","Bob", 7));
        dir.addEmployee(new Emplyee(5,"97748927","Vinnie", 5));
        dir.addEmployee(new Emplyee(6,"2890874564","Christoph", 1));
        System.out.println(dir.findByExperience(1));
        System.out.println(dir.findByName("Gill"));
        System.out.println(dir.findByNumber(6));
    }
}