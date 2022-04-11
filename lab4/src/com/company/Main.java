package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String sciezkaTeacup = "input/teacup.txt";
        String sciezkaTeacupOut = "src/output/teacup_new.txt";

        String sciezkaSpoon = "input/spoon.txt";
        String sciezkaSpoonOut = "src/output/spoon_new.txt";

        String sciezkaTeapot = "src/Lab4/czaj.txt";
        String sciezkaTeapotOut = "src/output/czajnik_new.txt";

        PlatBeziere.formBeziera(sciezkaTeacup, sciezkaTeacupOut, 26);
        PlatBeziere.formBeziera(sciezkaSpoon, sciezkaSpoonOut, 16);
        PlatBeziere.formBeziera(sciezkaTeapot, sciezkaTeapotOut, 32);
    }

}