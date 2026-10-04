package com.JavaPractice;

public class Cinema {

    public void vikram(){
        System.out.println("Aarambhikalaama");

    }
    public void leo(){
        System.out.println("Naan thaan dah Leo,Leo Das");

    }

    public void jailer(){
        System.out.println("Tiger ka hukkum");

    }

    public int count(int a , int b){
        int c = a+b;
        System.out.println("Print here before return:"+c);
        return a+b;
    }


    public static void main(String[] args) {

        Cinema film = new Cinema();

        film.vikram();
        film.leo();
        film.jailer();
        int cinema_buff = film.count(21,05);
        System.out.println("Returned Cine Buffs Count :"+cinema_buff);

    }
}
