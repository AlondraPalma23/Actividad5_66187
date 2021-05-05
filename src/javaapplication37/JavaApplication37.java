/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

import java.util.Scanner;
//import java.util.StringTokenizer;


/**
 *
 * @author Alondra Palma
 */
public class JavaApplication37 {

 
    public static void newejer() { 
        String diasSem[] = {"domingo","lunes", "martes", "miercoles", "jueves", "viernes", "sabado"};
        System.out.println("Los " + diasSem.length + " Dias de la semana son: ");

        System.out.println(diasSem[0]);
        System.out.println(diasSem[1]);
        System.out.println(diasSem[2]);
        System.out.println(diasSem[3]);
        System.out.println(diasSem[4]);
        System.out.println(diasSem[5]);
        System.out.println(diasSem[6]);
    }
    public static void newejer2() {
        String [][] aPersonajes;
        aPersonajes = new String [16][3];
        aPersonajes[0][0] = "Luke Skywalker ";
        aPersonajes[0][1] = "172 ";
        aPersonajes[0][2] = "male ";
        aPersonajes[1][0] = "R2-D2 ";
        aPersonajes[1][1] = "96 ";
        aPersonajes[1][2] = "n/a ";
        aPersonajes[2][0] = "C-3PO ";
        aPersonajes[2][1] = "167 ";
        aPersonajes[2][2] = "n/a ";
        aPersonajes[3][0] = "Darth Vader ";
        aPersonajes[3][1] = "202 ";
        aPersonajes[3][2] = "male ";
        aPersonajes[4][0] = "Leia Organa ";
        aPersonajes[4][1] = "150 ";
        aPersonajes[4][2] = "female ";
        aPersonajes[5][0] = "Owen Lars ";
        aPersonajes[5][1] = "178 ";
        aPersonajes[5][2] = "male ";
        aPersonajes[6][0] = "Beru Whitesun lars ";
        aPersonajes[6][1] = "165 ";
        aPersonajes[6][2] = "female ";
        aPersonajes[7][0] = "R5-D4 ";
        aPersonajes[7][1] = "97 ";
        aPersonajes[7][2] = "n/a ";
        aPersonajes[8][0] = "Biggs Darklighter ";
        aPersonajes[8][1] = "183 ";
        aPersonajes[8][2] = "male ";
        aPersonajes[9][0] = "Obi-Wan Kenobi ";
        aPersonajes[9][1] = "182 ";
        aPersonajes[9][2] = "male ";
        aPersonajes[10][0] = "Yoda ";
        aPersonajes[10][1] = "66 ";
        aPersonajes[10][2] = "male ";
        aPersonajes[11][0] = "Jek Tono Porkins ";
        aPersonajes[11][1] = "180 ";
        aPersonajes[11][2] = "male ";
        aPersonajes[12][0] = "Jabba Desilijic Tiure ";
        aPersonajes[12][1] = "175 ";
        aPersonajes[12][2] = "hermaphrodite ";
        aPersonajes[13][0] = "Han Solo ";
        aPersonajes[13][1] = "180";
        aPersonajes[13][2] = " male";
        aPersonajes[14][0] = "Chewbacca ";
        aPersonajes[14][1] = "228 ";
        aPersonajes[14][2] = "male ";
        aPersonajes[15][0] = "Anakin Skywalker ";
        aPersonajes[15][1] = "188 ";
        aPersonajes[15][2] = "male ";
        
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(aPersonajes [i][j]);
            }
            System.out.println( );
        }
    }      
    public static void newejer3() {
        String [][] aCodigo;
        aCodigo = new String [26][2];
        aCodigo[0][0] = "A";
        aCodigo[1][0] = "B";
        aCodigo[2][0] = "C";
        aCodigo[3][0] = "D";
        aCodigo[4][0] = "E";
        aCodigo[5][0] = "F";
        aCodigo[6][0] = "G";
        aCodigo[7][0] = "H";
        aCodigo[8][0] = "I";
        aCodigo[9][0] = "J";
        aCodigo[10][0] = "K";
        aCodigo[11][0] = "L";
        aCodigo[12][0] = "M";
        aCodigo[13][0] = "N";
        aCodigo[14][0] = "O";
        aCodigo[15][0] = "P";
        aCodigo[16][0] = "Q";
        aCodigo[17][0] = "R";
        aCodigo[18][0] = "S";
        aCodigo[19][0] = "T";
        aCodigo[20][0] = "U";
        aCodigo[21][0] = "V";
        aCodigo[22][0] = "W";
        aCodigo[23][0] = "X";
        aCodigo[24][0] = "Y";
        aCodigo[25][0] = "Z";
        
        aCodigo[0][1] = ".-";
        aCodigo[1][1] = "-...";
        aCodigo[2][1] = "-.-.";
        aCodigo[3][1] = "-..";
        aCodigo[4][1] = ".";
        aCodigo[5][1] = "..-.";
        aCodigo[6][1] = "--.";
        aCodigo[7][1] = "...";
        aCodigo[8][1] = "..";
        aCodigo[9][1] = ".---";
        aCodigo[10][1] = "-.-";
        aCodigo[11][1] = ".-..";
        aCodigo[12][1] = "--";
        aCodigo[13][1] = "-.";
        aCodigo[14][1] = "---";
        aCodigo[15][1] = ".--.";
        aCodigo[16][1] = "--.-";
        aCodigo[17][1] = ".-.";
        aCodigo[18][1] = "...";
        aCodigo[19][1] = "-";
        aCodigo[20][1] = "..-";
        aCodigo[21][1] = "...-";
        aCodigo[22][1] = ".--";
        aCodigo[23][1] = "-..-";
        aCodigo[24][1] = "-.--";
        aCodigo[25][1] = "--..";
        
        for (int i = 0; i < aCodigo.length; i++) {
            System.out.println(aCodigo[i][0]+ " "+ aCodigo[i][1]);
        }
    }    
    public static void newejer4() {
        String [][] aCodigo;
        aCodigo = new String [26][2];
        aCodigo[0][0] = "A";
        aCodigo[1][0] = "B";
        aCodigo[2][0] = "C";
        aCodigo[3][0] = "D";
        aCodigo[4][0] = "E";
        aCodigo[5][0] = "F";
        aCodigo[6][0] = "G";
        aCodigo[7][0] = "H";
        aCodigo[8][0] = "I";
        aCodigo[9][0] = "J";
        aCodigo[10][0] = "K";
        aCodigo[11][0] = "L";
        aCodigo[12][0] = "M";
        aCodigo[13][0] = "N";
        aCodigo[14][0] = "O";
        aCodigo[15][0] = "P";
        aCodigo[16][0] = "Q";
        aCodigo[17][0] = "R";
        aCodigo[18][0] = "S";
        aCodigo[19][0] = "T";
        aCodigo[20][0] = "U";
        aCodigo[21][0] = "V";
        aCodigo[22][0] = "W";
        aCodigo[23][0] = "X";
        aCodigo[24][0] = "Y";
        aCodigo[25][0] = "Z";
        
        aCodigo[0][1] = ".-";
        aCodigo[1][1] = "-...";
        aCodigo[2][1] = "-.-.";
        aCodigo[3][1] = "-..";
        aCodigo[4][1] = ".";
        aCodigo[5][1] = "..-.";
        aCodigo[6][1] = "--.";
        aCodigo[7][1] = "...";
        aCodigo[8][1] = "..";
        aCodigo[9][1] = ".---";
        aCodigo[10][1] = "-.-";
        aCodigo[11][1] = ".-..";
        aCodigo[12][1] = "--";
        aCodigo[13][1] = "-.";
        aCodigo[14][1] = "---";
        aCodigo[15][1] = ".--.";
        aCodigo[16][1] = "--.-";
        aCodigo[17][1] = ".-.";
        aCodigo[18][1] = "...";
        aCodigo[19][1] = "-";
        aCodigo[20][1] = "..-";
        aCodigo[21][1] = "...-";
        aCodigo[22][1] = ".--";
        aCodigo[23][1] = "-..-";
        aCodigo[24][1] = "-.--";
        aCodigo[25][1] = "--..";

        int asciiValue;
        char echar;
        String frase;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Escriba una frase en mayuscula");
        frase = Entrada.nextLine();
////        String nombre = "ALONDRA";
        char[] achar = frase.toCharArray();
        for (int i = 0; i < aCodigo.length; i++) {
            System.out.println(aCodigo[i][0]+ " "+ aCodigo[i][1]);
        }
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < achar.length; i++) {
            System.out.println(achar[i] );
            echar = achar[i];
            asciiValue = (int) echar;
            System.out.println("Cod_ASCII = " + asciiValue);
            System.out.println(asciiValue +aCodigo[i][0]+ " "+ aCodigo[i][1]);
            System.out.println(asciiValue - 65 + " VALOR ARREGLO");
        }
//        int asciiValue;
//        char echar;
//        String frase;
//        String nombre = "ALONDRA";
//        char[] achar = nombre.toCharArray();
//        for (int i = 0; i < achar.length; i++) {
//            System.out.println(achar[i]);
//            echar = achar[i];
//            asciiValue = (int) echar;
//            System.out.println("Cod_ASCII = " + asciiValue);
//            System.out.println(asciiValue - 65 + " VALOR ARREGLO");

//        for (int i = 1; i < frase.length; i++) {
//            System.out.println(aCodigo[i][0]+ " "+ aCodigo[i][1]);
//        }

    } 
    public static void newejer5() {
        String [][] aCodigo;
        aCodigo = new String [26][1];
        aCodigo[0][0] = "A";
        aCodigo[1][0] = "B";
        aCodigo[2][0] = "C";
        aCodigo[3][0] = "D";
        aCodigo[4][0] = "E";
        aCodigo[5][0] = "F";
        aCodigo[6][0] = "G";
        aCodigo[7][0] = "H";
        aCodigo[8][0] = "I";
        aCodigo[9][0] = "J";
        aCodigo[10][0] = "K";
        aCodigo[11][0] = "L";
        aCodigo[12][0] = "M";
        aCodigo[13][0] = "N";
        aCodigo[14][0] = "O";
        aCodigo[15][0] = "P";
        aCodigo[16][0] = "Q";
        aCodigo[17][0] = "R";
        aCodigo[18][0] = "S";
        aCodigo[19][0] = "T";
        aCodigo[20][0] = "U";
        aCodigo[21][0] = "V";
        aCodigo[22][0] = "W";
        aCodigo[23][0] = "X";
        aCodigo[24][0] = "Y";
        aCodigo[25][0] = "Z";
        
        aCodigo[0][1] = ".-";
        aCodigo[1][1] = "-...";
        aCodigo[2][1] = "-.-.";
        aCodigo[3][1] = "-..";
        aCodigo[4][1] = ".";
        aCodigo[5][1] = "..-.";
        aCodigo[6][1] = "--.";
        aCodigo[7][1] = "...";
        aCodigo[8][1] = "..";
        aCodigo[9][1] = ".---";
        aCodigo[10][1] = "-.-";
        aCodigo[11][1] = ".-..";
        aCodigo[12][1] = "--";
        aCodigo[13][1] = "-.";
        aCodigo[14][1] = "---";
        aCodigo[15][1] = ".--.";
        aCodigo[16][1] = "--.-";
        aCodigo[17][1] = ".-.";
        aCodigo[18][1] = "...";
        aCodigo[19][1] = "-";
        aCodigo[20][1] = "..-";
        aCodigo[21][1] = "...-";
        aCodigo[22][1] = ".--";
        aCodigo[23][1] = "-..-";
        aCodigo[24][1] = "-.--";
        aCodigo[25][1] = "--..";
        
        int asciiValue;
        char echar;
        String frase;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Escriba una frase en mayuscula");
        frase = Entrada.nextLine();
////        String nombre = "ALONDRA";
        char[] achar = frase.toCharArray();
        for (int i = 0; i < achar.length; i++) {
            System.out.println(achar[i]);
            echar = achar[i];
            asciiValue = (int) echar;
            System.out.println("Cod_ASCII = " + asciiValue);
            System.out.println(asciiValue - 65 + " VALOR ARREGLO");
        }
//
//        Scanner sc = new Scanner(System.in);
//        String frase;
//        System.out.print("Introduce una frase: ");
//        frase = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(frase);
//        System.out.println(st.countTokens() + " palabras"); 
//        
//        int ;
//        String cadena, palabra="";
//        System.out.println("Ingrese la cadena a evaluar: ");
//        for (int j = 0; j < asciiValue-65; j++) {
//            }
//            System.out.println(aCodigo[asciiValue-65] [0]);
//        }
//        cadena= br.readLine();
//        for(i=0;i<cadena.length();i++){
//            if(cadena.charAt(i)==' '){
//                con++;
//            }
//        }
//        System.out.println("La cadena contiene "+con+" palabras");       
    }
    public static void main(String[] args) {
//        newejer();
//        newejer2();
//        newejer3();
        newejer4();
//        newejer5();
    }
}



