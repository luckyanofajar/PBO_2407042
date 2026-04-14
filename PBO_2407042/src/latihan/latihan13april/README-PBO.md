# PANDUAN PBO - TUGAS BANGUN DATAR
**Buat:** Lucyanofajarna (NIM: 2407042)  
**Tanggal:** 13 April 2026

---

##  DAFTAR ISI
1. [Encapsulation](#1-encapsulation)
2. [Constructor Overloading](#2-constructor-overloading)
3. [Inheritance](#3-inheritance)
4. [Method Overriding](#4-method-overriding)
5. [Polymorphism](#5-polymorphism)

---

## 1. ENCAPSULATION (ENKAPSULASI)

### Apa itu?
Nyembunyiin data pake `private`, akses via getter & setter.

### Kenapa?
- Keamanan data
- Validasi input
- Abstraksi

### Contoh Kode:

// Di BangunDatar.java
private double varA;  // Private = aman

public double getVarA() {
    return varA;
}

public void setVarA(double varA) {
    this.varA = varA;
}

### 2. CONSTRUCTOR OVERLOADING

Apa itu?

Banyak constructor dalam 1 class, nama sama, beda parameter.

Contoh Kode:

public class BangunDatar {
    // Constructor 1: 2 parameter
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }
    
    // Constructor 2: 1 parameter (buat persegi)
    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = varA;
    }
}

### 3. INHERITANCE (PEWARISAN)

### Apa itu?
Class anak extends class induk, otomatis punya atribut & method induk.

- Contoh Kode:

// Induk (Superclass)
public class BangunDatar {
    protected double varA, varB;
}

// Anak (Subclass)
public class Persegi extends BangunDatar {
    // Otomatis punya varA dan varB
}

Istilah:
- extends : keyword pewarisan
- super() : panggil constructor induk
- this : merujuk ke class sendiri

### 4. METHOD OVERRIDING

### Apa itu?
Timpa method dari induk dengan implementasi baru di anak.
- Contoh Kode:

// Di BangunDatar (Induk)
public double hitungLuas() {
    return 0;
}

// Di Persegi (Anak)
@Override
public double hitungLuas() {
    return getVarA() * getVarA();
}

// Di Segitiga (Anak)
@Override
public double hitungLuas() {
    return 0.5 * getVarA() * getVarB();
}

### 5. POLYMORPHISM (BANYAK BENTUK)
### Apa itu?
Satu tipe referensi bisa nyimpen objek beda jenis.
- Contoh Kode:
BangunDatar[] daftar = new BangunDatar[3];

daftar[0] = new Persegi(5);
daftar[1] = new Segitiga(3, 4);
daftar[2] = new PersegiPanjang(4, 5);

// Looping - method otomatis sesuai objek asli
for (BangunDatar b : daftar) {
    b.tampilkan();  // Dynamic Method Dispatch
}


---TERIMAKASIH---