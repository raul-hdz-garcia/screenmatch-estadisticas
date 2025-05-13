package com.aluracursos.screenmatch.principal;

import java.util.Arrays;
import java.util.List;

public class EjemploStreams {
    public void muestraEjemplo() {
        List<String> nombres = Arrays.asList("Brenda", "Luis", "Maria Fernanda", "Eric", "Genesys");

        //stream() permite hacer varias operaciones encadenadas
        nombres.stream()
                .sorted()
                .limit(2)
                .filter(n -> n.startsWith("B"))
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int suma = numeros.stream()
                .peek(n -> System.out.println("Elemento: " + n))
                .map(n -> n * 2)
                .peek(n -> System.out.println("Contenido después del map: " + n))
                .reduce(0, (total, numero) -> total + numero);

        System.out.println("La suma de los números es: " + suma);

    }
}
