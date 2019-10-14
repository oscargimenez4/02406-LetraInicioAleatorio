/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        //Constantes
        final char LETRA_MAX = 'A';
        final char LETRA_MIN = 'Z';
        //Variable
        char letra;
        //Random
        letra = (char) (RND.nextInt(LETRA_MIN - LETRA_MAX + 1) + LETRA_MAX);
        //Mensaje
        System.out.printf("Letra de inicio de examen ...: %c%n", letra);
    }
}
