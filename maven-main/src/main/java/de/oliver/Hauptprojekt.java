package de.oliver;


interface A {
    void hello();
}

interface B {
    void hello();
}


interface C extends A,B{
    default int hello1() {
        return 5;
    }
}

public class Hauptprojekt implements A, B{

/*
    public static void main(String[] args) {
        System.out.println("Hallo");
        SubSystem sub = new SubSystem();
        sub.foo();
    }*/

    public void hello() {
        System.out.println("Hallo");
        SubSystem sub = new SubSystem();
        sub.foo();
        System.out.println("Hallo vom HauptSystem");
    }
}
