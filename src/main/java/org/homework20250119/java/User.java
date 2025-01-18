package org.homework20250119.java;



public class User {
    public String name;
    public Integer age;
    public String email;

    private Status status;

    public User(String name, Integer age, String email) {
        // nullの場合は空文字を設定
        if (name == null) {
            this.name = "";
        }else {
            this.name = name;
        }
        this.age = age;
        this.email = email;

        // 年齢によってステータスを設定
        if (age == null) {
            this.status = Status.UNKNOWN;
        }else if (age < 20) {
            this.status = Status.JUNIOR;
        }else {
            this.status = Status.SENIOR;
        }
    }

    public void hello() {
        System.out.println("Hello, " + name + "!");
    }

    @Override
    public String toString() {
        return "User(" + name + ", " + age + ", " + email + ", " + status + ")";
    }
}