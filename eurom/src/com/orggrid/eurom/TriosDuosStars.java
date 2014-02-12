package com.orggrid.eurom;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

public class TriosDuosStars {
  public static void main( String[] args) throws Exception {
    String trio, dupla;
    int[] trios = new int[ 51];
    int[] duplas = new int[ 51];
    for( int i = 0 ; i < 51 ; i++) {
      trios[ i] = 0;
      duplas[ i] = 0;
    }

    FileWriter fw = new FileWriter( new File( "D:\\orggrid\\eurom\\result.txt"));
    BufferedWriter bw = new BufferedWriter( fw);

    BufferedReader brt = new BufferedReader( new FileReader( "D:\\orggrid\\eurom\\trios.txt"));
    while( ( trio = brt.readLine()) != null) {
      // System.out.println( trio);
      for( int i = 0 ; i < 51 ; i++) {
        trios[ i] = 0;
      }
      StringTokenizer stt = new StringTokenizer( trio);
      while( stt.hasMoreElements()) {
        trios[ Integer.parseInt( (String)stt.nextElement())] = 1;
      }
      BufferedReader brd = new BufferedReader( new FileReader( "D:\\orggrid\\eurom\\duplas.txt"));
      while( ( dupla = brd.readLine()) != null) {
        // System.out.println( dupla);
        for( int i = 0 ; i < 51 ; i++) {
          duplas[ i] = 0;
        }
        StringTokenizer std = new StringTokenizer( dupla);
        while( std.hasMoreElements()) {
          duplas[ Integer.parseInt( (String)std.nextElement())] = 1;
        }
        int qtd = 0;
        for( int i = 0 ; i < 51 ; i++) {
          if( trios[ i] != 0 || duplas[ i] != 0) {
            qtd++;
          }
        }
        if( qtd == 5) {
          for( int i = 0 ; i < 51 ; i++) {
            if( trios[ i] != 0 || duplas[ i] != 0) {
              bw.write( i + " ");
            }
          }
          bw.write( "\n");
        }
      }
      if( brd != null) {
        brd.close();
      }
    }
    bw.close();
    if( brt != null) {
      brt.close();
    }
  }
}
