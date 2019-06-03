package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {
    //Instance variables
    String name;
    Integer age;
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
        return ;
    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {

    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        return ;

    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }
}
