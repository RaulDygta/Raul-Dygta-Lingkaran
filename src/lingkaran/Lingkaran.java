/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lingkaran;

public class Lingkaran {
    final double PI = 3.141592;

    void hitungLuas(double r) {
        double luas = PI * r * r;

        // bilangan pecahan
        System.out.println("Luas Lingkaran (Bilangan Pecahan): " + luas);

        // bilangan bulat (type-casting)
        System.out.println("Luas Lingkaran (Bilangan Bulat): " + (int) luas);

        // bilangan pembulatan (rounding)
        System.out.println("Luas Lingkaran (Pembulatan): " + Math.round(luas));
    }
}
