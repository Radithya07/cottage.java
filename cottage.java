/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cottage;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 *
 * @author radit
 */
public class cottage{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public class seleksiKondisiNo1 {

        public static String formatRupiah(double uang) {
            double harga = uang;

            DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

            formatRp.setCurrencySymbol("Rp. ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');

            kursIndonesia.setDecimalFormatSymbols(formatRp);
            return kursIndonesia.format(harga);
        }
        static Scanner Input = new Scanner(System.in);

        public static String getInput(String params) {
            System.out.print(params + ": ");
            return Input.nextLine();
        }

        public static void main(String[] args) {
            //Data pelanggan
            String[] namaPelanggan = {"Galuh", "Indro", "Jedi", "Kanu"};
            String[] alamatPelanggan = {"Sawojajar", "Kedung kandang", "Ijen", "Dinoyo"};
            int[] golonganPelanggan = {1, 3, 2, 3};

            int inId = Integer.parseInt(getInput("Masukkan Id")) - 1;
            int gol = golonganPelanggan[inId];
            int kwh = Integer.parseInt(getInput("Masukkan pemakaian listrik"));
            int tagihan = switch (gol) {
                case 1 ->
                    1000;
                case 2 ->
                    1300;
                case 3 ->
                    1500;
                default ->
                    0;
            } * kwh;
            tagihan = tagihan < 50000 ? 50000 : tagihan;
            tagihan += 13000;
            System.out.printf("\nDATA PELANGGAN\n========\nNama pelanggan: %s\nAlamat: %s\nGolongan: %s\n", namaPelanggan[inId], alamatPelanggan[inId], gol);
            System.out.println("Jumlah tagihan anda: " + formatRupiah(tagihan));

        }
    }
}
