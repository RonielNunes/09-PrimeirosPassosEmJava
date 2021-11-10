package Desafios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Desafio3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double x;
        String leitura;
        int count = 0;
        int countPares = 0;

        while(count != 6){
            leitura = br.readLine();
            x = Double.parseDouble(leitura);
            if(x > 0.0){
                    countPares++;
            }
            count++;
        }
        System.out.println("" + countPares+" valores positivos");
    }

}