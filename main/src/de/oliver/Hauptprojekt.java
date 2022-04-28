package de.oliver.main;

import de.oliver.sub.SubSystem;
import org.apache.logging.log4j.*;

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


    public static void main(String[] args) {
		final Logger logger = LogManager.getLogger("Log4j-Logger");

        System.out.println("Start");
		logger.info("Loging gestartet!");
        SubSystem sub = new SubSystem();
        sub.foo();
		logger.debug("sub complete!");
		Hauptprojekt haupt = new Hauptprojekt();
		haupt.hello();
    }

    public void hello() {
        SubSystem sub = new SubSystem();
        sub.foo();
        System.out.println("Hallo vom HauptSystem");
    }
}
