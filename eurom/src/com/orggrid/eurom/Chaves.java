package com.orggrid.eurom;

/*
 ------
 Países
 ------
 Reino Unido
 Irlanda
 França
 Bélgica
 Suíça
 Luxemburgo
 Espanha
 Áustria
 Portugal

 ------
 Linguas
 ------
 Inglês
 Reino Unido
 Irlanda
 Francês
 França
 Bélgica
 Suíça
 Luxemburgo
 Espanhol
 Espanha
 Alemão
 Áustria
 Bélgica
 Suíça
 Luxemburgo
 Português
 Portugal
 Neerlandês
 Bélgica
 Italiano
 Suíça
 Romanche
 Suíça
 Luxemburguês
 Luxemburgo
 Esloveno
 Áustria
 Croata
 Áustria
 Húngaro
 Áustria
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;

public class Chaves {
  static int[] consecutivosQtd = { 0, 2 };
  static int[] ultimoSorteioQtd = { 0, 0 };
  static int[] somaQtd = { 50, 90 };
  static int[] stdevQtd = { 4, 10 };
  static int[] primosQtd = { 0, 3 };
  static int[] primosGemeosQtd = { 0, 1 };
  static int[][] parImparQtd = { { 1, 4 }, { 2, 3 }, { 3, 2 }, { 4, 1 } };
  static int[][] baixoAltoQtd = { { 5, 0 } };
  static int[][] dezenaQtd = { { 3, 2 }, { 3, 1, 1 }, { 4, 1 } };
  static int[][] terminQtd = { { 1, 1, 1, 1, 1 }, { 2, 1, 1, 1 }, { 2, 2, 1 } };
  static int[][] linhaQtd = { { 2, 1, 1, 1 }, { 2, 2, 1 }, { 3, 1, 1 }, { 3, 2 } };
  static int[][] colunaQtd = { { 1, 1, 1, 1, 1 }, { 2, 1, 1, 1 }, { 2, 2, 1 }, { 3, 1, 1 } };
  static int[][] posicaoQtd = { { 1, 4 }, { 3, 8 }, { 7, 11 }, { 12, 15 }, { 17, 25 } };
  static int[] ultimoSorteioNum = { 4, 26, 30, 42, 44 };

  static int[][] parImparNum = {
      { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50 },
      { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49 } };
  static int[][] baixoAltoNum = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 },
      { 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 } };
  static int[][] dezenaNum = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
      { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 }, { 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 },
      { 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 } };
  static int[][] terminNum = { { 10, 20, 30, 40, 50 }, { 1, 11, 21, 31, 41 }, { 2, 12, 22, 32, 42 }, { 3, 13, 23, 33, 43 },
      { 4, 14, 24, 34, 44 }, { 5, 15, 25, 35, 45 }, { 6, 16, 26, 36, 46 }, { 7, 17, 27, 37, 47 }, { 8, 18, 28, 38, 48 },
      { 9, 19, 29, 39, 49 } };
  static int[][] linhaNum = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },
      { 19, 20, 21, 22, 23, 24 }, { 25, 26, 27, 28, 29, 30 }, { 31, 32, 33, 34, 35, 36 }, { 37, 38, 39, 40, 41, 42 },
      { 43, 44, 45, 46, 47, 48 }, { 49, 50 } };
  static int[][] colunaNum = { { 1, 7, 13, 19, 25, 31, 37, 43, 49 }, { 2, 8, 14, 20, 26, 32, 38, 44, 50 },
      { 3, 9, 15, 21, 27, 33, 39, 45 }, { 4, 10, 16, 22, 28, 34, 40, 46 }, { 5, 11, 17, 23, 29, 35, 41, 47 },
      { 6, 12, 18, 24, 30, 36, 42, 48 } };
  static int[] primos = { 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 };
  static int[][] primosGemeos = { { 3, 5}, {5, 7}, {11, 13}, {17, 19}, {29, 31}, {41, 43} };

  public static boolean ultimoSorteio( int[] numeros, BufferedWriter bw) throws Exception {
    int numUltimoSorteio = 0;
    int ultimoSorteioLen = ultimoSorteioNum.length;
    for( int i = 1 ; i < 51 ; i++) {
      if( numeros[ i] != 0) {
        for( int j = 0 ; j < ultimoSorteioLen ; j++) {
          if( ultimoSorteioNum[ j] == i) {
            numUltimoSorteio++;
          }
        }
      }
    }
    // bw.write( "-> " + numUltimoSorteio);
    return ultimoSorteioQtd[ 0] < numUltimoSorteio || ultimoSorteioQtd[ 1] > numUltimoSorteio ? false : true;
  }

  public static boolean consecutivos( int[] numeros, BufferedWriter bw) throws Exception {
    int dif = 0;
    int numConsecutivos = 0;
    for( int i = 1 ; i < 51 ; i++) {
      if( numeros[ i] != 0) {
        for( int j = i + 1 ; j < 51 ; j++) {
          if( numeros[ j] != 0) {
            dif = j - i;
            if( dif == 1) {
              numConsecutivos++;
            }
            i = j - 1;
            break;
          }
        }
      }
    }
    // bw.write( "-> " + numConsecutivos);
    return numConsecutivos < consecutivosQtd[ 0] || numConsecutivos > consecutivosQtd[ 1]? false : true;
  }

  public static boolean primos( int[] numeros, BufferedWriter bw) throws Exception {
    int p = 0;
    for( int i=0 ; i<51 ; i++) {
      if( numeros[ i] != 0) {
        for( int j=0 ; j<primos.length ; j++) {
          if( i == primos[ j]) {
            p++;
            break;
          }
        }
      }
    }
    //bw.write( "-> " + p);
    return p < primosQtd[0] || p > primosQtd[ 1]? false : true;
  }

  public static boolean primosGemeos( int[] numeros, BufferedWriter bw) throws Exception {
    int pg = 0;
    for( int j=0, p=0 ; j<primosGemeos.length ; j++, p=0) {
      if( numeros[ primosGemeos[ j][0]] == 1) {
        System.out.println( "1:" + primosGemeos[ j][0]);
        p++;
      }
      if( numeros[ primosGemeos[ j][1]] == 1) {
        System.out.println( "2:" + primosGemeos[ j][1]);
        p++;
      }
      /*
      for( int k=0 ; k<51 ; k++) {
        if( numeros[ k] != 0) {
          System.out.print(  k + " ");
        }
      }
      System.out.println( "-> " + p);
      */
      if( p==2) {
        pg++;
        //System.out.println( "pg:" + pg);
      }
    }
    //bw.write( "-> " + pg);
    return pg < primosGemeosQtd[0] || pg > primosGemeosQtd[ 1]? false : true;
  }

  static boolean soma( int[] numeros, BufferedWriter bw) throws Exception {
    int numSoma = 0;
    for( int i = 1 ; i < 51 ; i++) {
      if( numeros[ i] != 0) {
        numSoma += i;
      }
    }
    // bw.write( "-> " + numSoma);
    return numSoma < somaQtd[ 0] || numSoma > somaQtd[ 1] ? false : true;
  }

  static boolean grupo( int[] numeros, BufferedWriter bw, int[][] grp, boolean sort, int[][] filtro) throws Exception {
    boolean ok = true;
    // System.out.println();
    Integer qtd[] = new Integer[ grp.length];
    for( int q = 0 ; q < grp.length ; q++) {
      qtd[ q] = 0;
    }
    for( int g = 0 ; g < grp.length ; g++) {
      for( int n = 0 ; n < grp[ g].length ; n++) {
        // System.out.print( grp[ g][ n] + " ");
        if( numeros[ grp[ g][ n]] != 0) {
          qtd[ g]++;
        }
      }
      // System.out.println();
    }
    if( sort) {
      Arrays.sort( qtd, Collections.reverseOrder());
    }
    // for( int q = 0 ; q < grp.length ; q++) {
    // System.out.print( qtd[ q] + " ");
    // }
    // System.out.println();
    for( int f = 0 ; f < filtro.length ; f++) {
      ok = true;
      for( int n = 0 ; n < qtd.length && n < filtro[ f].length ; n++) {
        if( qtd[ n] != filtro[ f][ n]) {
          ok = false;
          break;
        }
      }
      if( ok)
        break;
    }
    return ok;
  }

  public static boolean standardDeviation( int[] numeros, BufferedWriter bw) throws Exception {
    double[] chave = new double[ 5];
    for( int i = 0, n = 0 ; i < 51 ; i++) {
      if( numeros[ i] != 0) {
        chave[ n++] = i;
      }
    }
    StandardDeviation stdev = new StandardDeviation();
    int stdevval = (int)stdev.evaluate( chave);
    bw.write( String.format( " %f ", stdev.evaluate( chave)));
    return stdevval < stdevQtd[ 0] || stdevval > stdevQtd[ 1] ? false : true;
  }

  public static boolean posicao( int[] numeros, BufferedWriter bw) throws Exception {
    int q, ninicial = 0, nfinal = 0;
    // System.out.println();
    Integer qtd[] = new Integer[ 5];
    for( q = 0 ; q < 5 ; q++) {
      qtd[ q] = 0;
    }
    q = 0;
    for( int i = 1 ; i < 51 ; i++) {
      if( numeros[ i] != 0) {
        if( ninicial == 0)
          ninicial = i;
        for( int j = i + 1 ; j < 51 ; j++) {
          if( numeros[ j] != 0) {
            //System.out.println( "q=" + q + " numeros[" + j + "]=" + numeros[ j] + " numeros[" + i + "]=" + numeros[ i]);
            nfinal = j;
            qtd[ q++] = j - i;
            break;
          }
        }
      }
    }
    //System.out.println( "inicial=" + ninicial + " final=" + nfinal);
    qtd[ q] = 50 + ninicial - nfinal;
    Arrays.sort( qtd);
    /*
    for( int i = 0 ; i < 5 ; i++) {
      bw.write( "->" + qtd[ i] + ":");
    }
    */
    for( int i = 0 ; i < 5 ; i++) {
      if( qtd[i]<posicaoQtd[i][0] || qtd[i]>posicaoQtd[i][1]) {
        return false;
      }
    }
    return true;
  }

  public static void main( String[] args) throws Exception {
    boolean ok[] = { true, true, true, true, true, true, true, true, true, true, true, true, true };
    int[] numeros = new int[ 51];
    BufferedWriter bw = new BufferedWriter( new FileWriter( new File( "D:\\orggrid\\eurom\\resultfilter.txt")));
    BufferedWriter bwOk = new BufferedWriter( new FileWriter( new File( "D:\\orggrid\\eurom\\resultOk.txt")));
    String chave;
    BufferedReader br = new BufferedReader( new FileReader( "D:\\orggrid\\eurom\\result.txt"));
    while( ( chave = br.readLine()) != null) {
      // System.out.println( chave);
      for( int i = 1 ; i < 51 ; i++) {
        numeros[ i] = 0;
      }
      StringTokenizer st = new StringTokenizer( chave);
      while( st.hasMoreElements()) {
        int numero = Integer.parseInt( (String)st.nextElement());
        numeros[ numero] = 1;
        bw.write( numero + " ");
      }
      //if( !( ok[ 10] = posicao( numeros, bw))) {
      //  bw.write( "-> posição");
      //}
      if( !( ok[ 9] = standardDeviation( numeros, bw))) {
        bw.write( "-> standard deviation");
      }
      //if( !( ok[ 0] = ultimoSorteio( numeros, bw))) {
      //  bw.write( "-> ultimo sorteio");
      //}
      if( !( ok[ 11] = primos( numeros, bw))) {
        bw.write( "-> primos");
      }
      if( !( ok[ 12] = primosGemeos( numeros, bw))) {
        bw.write( "-> primos gémeos");
      }
      if( !( ok[ 1] = consecutivos( numeros, bw))) {
        bw.write( "-> consecutivos");
      }
      if( !( ok[ 2] = soma( numeros, bw))) {
        bw.write( "-> soma");
      }
      if( !( ok[ 3] = grupo( numeros, bw, parImparNum, false, parImparQtd))) {
        bw.write( "-> par impar");
      }
      //if( !( ok[ 4] = grupo( numeros, bw, baixoAltoNum, false, baixoAltoQtd))) {
      //  bw.write( "-> baixo alto");
      //}
      if( !( ok[ 5] = grupo( numeros, bw, dezenaNum, true, dezenaQtd))) {
        bw.write( "-> dezena");
      }
      if( !( ok[ 6] = grupo( numeros, bw, terminNum, true, terminQtd))) {
        bw.write( "-> terminação");
      }
      if( !( ok[ 7] = grupo( numeros, bw, linhaNum, true, linhaQtd))) {
        bw.write( "-> linha");
      }
      if( !( ok[ 8] = grupo( numeros, bw, colunaNum, true, colunaQtd))) {
        bw.write( "-> coluna");
      }
      bw.write( "\n");
      if( ok[ 0] && ok[ 1] && ok[ 2] && ok[ 3] && ok[ 4] && ok[ 5] && ok[ 6] && ok[ 7] && ok[ 8] && ok[ 9] && ok[ 10] && ok[ 11] && ok[ 12]) {
        for( int i = 1 ; i < 51 ; i++) {
          if( numeros[ i] != 0) {
            bwOk.write( i + " ");
          }
        }
        bwOk.write( "\n");
        ok[ 0] = ok[ 1] = ok[ 2] = ok[ 3] = ok[ 4] = ok[ 5] = ok[ 6] = ok[ 7] = ok[ 8] = ok[ 9] = ok[ 10] = ok[ 11] = ok[ 12] = true;
      }
      //break;
    }
    if( br != null) {
      br.close();
    }
    if( bw != null) {
      bw.close();
    }
    if( bwOk != null) {
      bwOk.close();
    }
  }
}
