package Konular._Exceptions;

import java.io.IOException;

public class try_catch {
    public static void main(String[] args) throws IOException {

        playWithFire();

//        try {
//            playWithFire();
//        } catch (IOException e) {
//            System.out.println("caught the fish!!!");   // this line will not be executed
//        }
    }

    public static void playWithFire() throws IOException{

        System.out.println("Playing with fire");
        try {
          throw new IOException();
        } catch (IOException e) {
          System.out.println("CAUGHT EXCEPTION");
        }
    }
/*
java.lang.Object
=> java.lang.Throwable
    => java.lang.Exception
        => java.io.IOException
           public class IOException extends Exception

This exception occurs when an IO operation has failed for some reason.
(Input/Output => write/read)
It is also a checked exception which means that your program has to handle it.
 */
}
