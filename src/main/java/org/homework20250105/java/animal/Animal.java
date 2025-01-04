package org.homework20250105.java.animal;

public abstract class Animal {
    private String name; // 名前
    private Integer age; // 年齢
    private AnimalEnum type;  // 動物の種類

    public Animal(String name, Integer age, AnimalEnum type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        // 年齢が未指定(null)の場合は"???"を返す
        if (age == null) {
            return "???";
        }
        return age.toString();
    }

    public AnimalEnum getType() {
        return type;
    }

    public abstract void say();  // 鳴き声を出力する抽象メソッド
}
