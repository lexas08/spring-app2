package ru.kukatov.springcourse;

public class ClassicalMusic implements Music {

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Init doing");
    }


    public void doMyDestroy(){
        System.out.println("Doing destroying");
    }


    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
