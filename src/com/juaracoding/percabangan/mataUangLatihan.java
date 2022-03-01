package com.juaracoding.percabangan;

import java.util.*;
import java.text.*;

public class mataUangLatihan {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // isi disini
    
    double mataUang = scan.nextDouble();
    
//    DecimalFormat formatRupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
//    DecimalFormatSymbols simbolRupiah = new DecimalFormatSymbols();
//    
//    simbolRupiah.setCurrencySymbol("Rp. ");
//    simbolRupiah.setMonetaryDecimalSeparator('-');
//    simbolRupiah.setGroupingSeparator('.');
//    
//    formatRupiah.setDecimalFormatSymbols(simbolRupiah);
//    System.out.println(formatRupiah.format(mataUang));
    
    NumberFormat formatDollar = NumberFormat.getCurrencyInstance(Locale.US);
    System.out.println(formatDollar.format(mataUang));
    
    NumberFormat formatJepang = NumberFormat.getCurrencyInstance(Locale.JAPANESE);
    System.out.println(formatJepang.format(mataUang));
    
  }
}