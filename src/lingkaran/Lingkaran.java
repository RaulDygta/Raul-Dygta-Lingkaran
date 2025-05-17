/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lingkaran;

public class Lingkaran {
    // Konstanta PI
    final double PI = 3.141592;

    // Method untuk menghitung luas lingkaran
    void hitungLuas(double r) {
        double luas = PI * r * r;

        // Menampilkan hasil dalam bentuk pecahan
        System.out.println("Luas Lingkaran (Bilangan Pecahan): " + luas);

        // Menampilkan hasil dalam bentuk bilangan bulat (type-casting)
        System.out.println("Luas Lingkaran (Bilangan Bulat): " + (int) luas);

        // Menampilkan hasil dalam bentuk pembulatan (rounding)
        System.out.println("Luas Lingkaran (Pembulatan): " + Math.round(luas));
    }
}
