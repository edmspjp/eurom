package com.orggrid.eurom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Premios {

  public static void verificaPremio( int[] chavePremiada) throws Exception {
    int qtd;
    int premios[] = new int[5];
    String chave;
    BufferedReader br = new BufferedReader( new FileReader( "D:\\orggrid\\eurom\\resultOk.txt"));
    for( int i=0 ; i<premios.length ; i++) {
      premios[i]=0;
    }
    while( ( chave = br.readLine()) != null) {
      // System.out.println( chave);
      qtd=0;
      StringTokenizer st = new StringTokenizer( chave);
      for( int i=0 ; i<5 && st.hasMoreElements() ; i++ ) {
        int numero = Integer.parseInt( (String)st.nextElement());
        //System.out.print( numero + " ");
        if( chavePremiada[ numero] == 1) qtd++;
      }
      System.out.println( chave + ": " + qtd);
      premios[ qtd]++;
    }
    if( br!=null) {
      br.close();
    }
    for( int i=0 ; i<premios.length ; i++) {
      System.out.println( i + " : " + premios[i]);
    }
  }
  public static void main( String[] args) throws Exception {
    String chave;
    int[] chavePremiada = new int[51];
    BufferedReader br = new BufferedReader( new FileReader( "D:\\orggrid\\eurom\\chaves.txt"));
    while( ( chave = br.readLine()) != null) {
      for( int i = 1 ; i < 51 ; i++) {
        chavePremiada[ i] = 0;
      }
      StringTokenizer st = new StringTokenizer( chave);
      for( int i=0 ; i<5 && st.hasMoreElements() ; i++ ) {
        int numero = Integer.parseInt( (String)st.nextElement());
        //System.out.print( numero + " ");
        chavePremiada[ numero] = 1;
      }
      System.out.println( "Chave premiada:" + chave);
      verificaPremio( chavePremiada);
    }
    if( br!=null) {
      br.close();
    }
  }

}
