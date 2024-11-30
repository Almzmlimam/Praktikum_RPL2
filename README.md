# Praktikum Rekayasa Perangkat Lunak 2
## Al Muzammil Imam_50421097_4IA14

Berikut adalah penjelasan tiap act yang telah dikerjakan dari Pertemuan 1 - 6

## Pertemuan 1

Program sederhana yang dibuat bertujuan untuk menghitung keliling dan luas bangun datar, seperti persegi, persegi panjang, lingkaran, atau segitiga. Program ini memanfaatkan logika matematika sederhana, di mana pengguna diminta memasukkan nilai-nilai yang dibutuhkan (misalnya panjang sisi, jari-jari, atau panjang dan lebar) dan program akan menghasilkan nilai keliling dan luas sesuai dengan rumus yang telah didefinisikan.

## Pertemuan 2

Program yang dibuat pada pertemuan kedua dirancang untuk mendemonstrasikan konsep dasar Pemrograman Berorientasi Objek (OOP) dengan Java, termasuk pewarisan (inheritance) dan pengubahan metode (method overriding). Program ini melibatkan dua kelas utama: Mahasiswa dan MahasiswaSarjana. Kelas Mahasiswa memiliki atribut dasar seperti nama, NPM, dan umur, serta metode untuk menampilkan data mahasiswa. Kelas MahasiswaSarjana merupakan subclass yang menambahkan atribut baru, yaitu jurusan, serta memperluas metode yang ada untuk menampilkan informasi tambahan tentang jurusan. Program utama membuat objek dari kedua kelas tersebut, menginisialisasi atributnya, dan menampilkan informasi mahasiswa ke konsol.

## Pertemuan 3

Program yang dibuat pada pertemuan ketiga menerapkan arsitektur Model-View-Controller (MVC) untuk mengelola data mahasiswa. Komponen ModelMahasiswa bertugas merepresentasikan data mahasiswa, sedangkan MahasiswaDAO menangani operasi database seperti tambah, update, hapus, dan menampilkan data mahasiswa. MahasiswaController bertindak sebagai penghubung antara model dan view, mengelola alur logika aplikasi berdasarkan input dari pengguna. MahasiswaView adalah antarmuka yang menampilkan menu dan hasil interaksi pengguna. Program ini memungkinkan pengguna untuk menambahkan, mengubah, menghapus, dan melihat data mahasiswa secara terstruktur.

## Pertemuan 4

Program yang dibuat pada pertemuan keempat mengenai "Konsep Dasar ORM dan Framework Hibernate". Program ini menggunakan Java dengan Hibernate sebagai ORM (Object-Relational Mapping) untuk mengelola data mahasiswa. Dokumen tersebut mencakup kode program seperti MahasiswaController.java, HibernateUtil.java, model, view, konfigurasi Hibernate (hibernate.cfg.xml), dan dependensi yang dikelola dengan pom.xml.

## Pertemuan 5

Program yang dibuat pada pertemuan kelima merupakan implementasi konsep Dependency Injection (DI) dan integrasi antara Spring Framework dengan Hibernate untuk pengelolaan data mahasiswa. Program ini mencakup komponen seperti model data (ModelMahasiswa), repository (MahasiswaRepository), controller (MahasiswaController), serta konfigurasi Spring melalui file application.properties dan dependensi pada pom.xml. Aplikasi ini memungkinkan pengelolaan data mahasiswa seperti menambah, menampilkan, dan memeriksa koneksi ke database dengan antarmuka sederhana. Dengan memanfaatkan DI, pengelolaan ketergantungan antar komponen menjadi lebih modular, mudah diuji, dan mendukung skalabilitas aplikasi.

## Pertemuan 6

Program yang dibuat pada pertemuan keenam adalah implementasi pengelolaan data mahasiswa menggunakan Spring Framework dan Hibernate dengan penerapan konsep AOP (Aspect-Oriented Programming) serta Dependency Injection (DI). Program ini terdiri dari berbagai komponen seperti model data (ModelMahasiswa), repository (MahasiswaRepository), layanan (MahasiswaService), dan antarmuka pengguna (MahasiswaView), dengan logika aplikasi dikendalikan oleh MahasiswaController. Aplikasi ini menggunakan AOP untuk memisahkan logika lintas fungsi, seperti logging atau validasi, sehingga kode menjadi lebih modular. Selain itu, DI diterapkan untuk mengelola ketergantungan antar komponen, meningkatkan keterbacaan, pengujian, dan pemeliharaan kode. Program ini mendukung operasi seperti menyimpan, membuang, dan refresh data mahasiswa.
