package com.imooc;

public class Person {

    public void eat(){
        System.out.println("person eat");
    }

    public Heart getHeart(){
        return new Heart();
    }

   public class Heart{
        public void eat(){
            Person.this.eat();
            System.out.println("Heart eat");
        }

        public Heart() {

        }

        public String toString() {
            return "Heart{}";
        }
    }
}
