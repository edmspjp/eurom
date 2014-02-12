package com.orggrid.eurom;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Gera {

  public static void main( String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter( new FileWriter( new File( "D:\\orggrid\\eurom\\result.txt")));
    //int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
    int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
    int len = numeros.length;
    for( int n1=0 ; n1<len-4 ; n1++) {
      for( int n2=n1+1 ; n2<len-3 ; n2++) {
        for( int n3=n2+1 ; n3<len-2 ; n3++) {
          for( int n4=n3+1 ; n4<len-1 ; n4++) {
            for( int n5=n4+1 ; n5<len-0 ; n5++) {
              bw.write( numeros[n1] + " " + numeros[n2] + " " +  numeros[n3] + " " +  numeros[n4] + " " +  numeros[n5] + "\n");
            }
          }
        }
      }
    }
    if( bw!=null) {
      bw.close();
    }
  }

}
