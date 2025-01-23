package FibAtvdd;

import java.sql.Time;
import java.lang.String;

public class Fibonacci{
    public static void main(String[] args) {
        RecursInter RecursInter = new RecursInter();
        long inicio, fim;
        inicio = System.nanoTime();
        System.out.println(RecursInter.FibonacciRecurs(21));
        fim = System.nanoTime();
        System.out.println("sao em segundos na funcao interativa: " + (fim - inicio));

        //Atividade feita por Sarah

        inicio = System.nanoTime();
        System.out.println(RecursInter.FibonacciInter(21));
        fim = System.nanoTime();
        System.out.println("sao em segundos na funcao recursiva: " + (fim - inicio));
    }
}