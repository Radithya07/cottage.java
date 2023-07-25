package cottage;

import java.util.Scanner;


public class cottage {

    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input= new Scanner(System.in);
    String kamar, hari;
        System.out.println("jenis kamar");
    kamar= input.nextLine();
        System.out.println("jenis hari");
    hari = input.nextLine();
        System.out.println("lama menginap");
    int lamaMenginap = input.nextInt(); 
        System.out.println("jumlah orang");
    int orang = input.nextInt();
     int harga= 0;
   
    
    if (kamar.equals("duku")){
       if (hari.equals("weekday")){
       harga = 915000;}
       else if (hari.equals("weekend")) {
       harga = 1025000;}
       else if (hari.equals("holiday")) {
       harga = 1225000;}
      if (orang/2 ==1) {
           System.out.println("tidak bisa memesan");
       }
      else {System.out.println("bisa memesan");}
    }
    
     if (kamar.equals("jeruk")){
       if (hari.equals("weekday")){
       harga = 915000;}
       else if (hari.equals("weekend")) {
       harga = 1025000;}
       else if (hari.equals("holiday")) {
       harga = 1225000;}
      if (orang/2 ==1) {
           System.out.println("tidak bisa memesan");
       }  
     else {System.out.println("bisa memesan");}
     }
      
    
     if (kamar.equals("alpukat")){
       if (hari.equals("weekday")){
       harga = 575000;}
       else if (hari.equals("weekend")) {
       harga = 695000;}
       else if (hari.equals("holiday")) {
       harga = 895000;}
         System.out.println("bisa memesan");  
     }

      if (kamar.equals("jambu air")){
       if (hari.equals("weekday")){
       harga = 575000;}
       else if (hari.equals("weekend")) {
       harga = 695000;}
       else if (hari.equals("holiday")) {
       harga = 895000;}
       System.out.println("bisa memesan"); 
       }
      
       if (kamar.equals("melon")){
       if (hari.equals("weekday")){
       harga = 595000;}
       else if (hari.equals("weekend")) {
       harga = 715000;}
       else if (hari.equals("holiday")) {
       harga = 915000;}
        if (orang/2 ==1) {
           System.out.println("tidak bisa memesan");
       }  
     else {System.out.println("bisa memesan");}
       }
       
        if (kamar.equals("durian")){
       if (hari.equals("weekday")){
       harga = 595000;}
       else if (hari.equals("weekend")) {
       harga = 715000;}
       else if (hari.equals("holiday")) {
       harga = 915000;}
        if (orang/2 ==1) {
           System.out.println("tidak bisa memesan");
       }  
     else {System.out.println("bisa memesan");}
       }
        
          if (kamar.equals("belimbing")){
       if (hari.equals("weekday")){
       harga = 495000;}
       else if (hari.equals("weekend")) {
       harga = 575000;}
       else if (hari.equals("holiday")) {
       harga = 755000;}
        if (orang/2 ==1) {
           System.out.println("tidak bisa memesan");
       }  
     else {System.out.println("bisa memesan");}
       }
        
           if (kamar.equals("mangga")){
       if (hari.equals("weekday")){
       harga = 495000;}
       else if (hari.equals("weekend")) {
       harga = 575000;}
       else if (hari.equals("holiday")) {
       harga = 755000;}
        if (orang/2 ==1) {
           System.out.println("tidak bisa memesan");
       }  
     else {System.out.println("bisa memesan");}
       }
           
            if (kamar.equals("kedondong")){
       if (hari.equals("weekday")){
       harga = 495000;}
       else if (hari.equals("weekend")) {
       harga = 575000;}
       else if (hari.equals("holiday")) {
       harga = 755000;}
        if (orang/2 ==1) {
           System.out.println("tidak bisa memesan");
       }  
     else {System.out.println("bisa memesan");}
       }
     int total= lamaMenginap*harga;
      
        System.out.println("jenis kamar= "+kamar);
         System.out.println("jenis hari= "+hari);
          System.out.println("lama menginap= "+lamaMenginap);
          System.out.println("jumlah orang= "+orang);
           System.out.println("total= "+total);
    }
    
}
