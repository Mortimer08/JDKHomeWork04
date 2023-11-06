package org.example;

public class Emplyee {
    private Integer number;
    private String phone;
    private String name;
    private Integer experience;

    public Emplyee(Integer number, String phone, String name, Integer experience) {
        this.number = number;
        this.phone = phone;
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Emplyee{" +
                "number=" + number +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }

    public Integer getNumber() {
        return number;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public Integer getExperience() {
        return experience;
    }
}
