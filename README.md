# NUTRITION INTEGRATION ON THE GO (NUTRI GO)

## Aplikasi Nutrisi Harian

### Deskripsi Proyek
NutriGo adalah aplikasi edukatif berbasis mobile yang membantu orang menjaga pola makan sehat dengan fitur gizi harian interaktif dan informatif. Aplikasi ini menghitung kebutuhan gizi dan menyarankan menu makanan sehat berdasarkan usia, berat badan, tinggi badan, dan tingkat aktivitas.
NutriGo cocok untuk siswa, mahasiswa, dan siapa saja yang ingin menerapkan gaya hidup sehat. Tujuan utamanya adalah membuat pengguna lebih mudah memahami pentingnya keseimbangan gizi dan menjaga berat badan ideal melalui antarmuka yang mudah digunakan dan ramah pengguna.

### Fitur Utama
1. Kalkulator Gizi
2. Menu Sarapan Sehat
3. Menu Makan Siang Sehat
4. Kalkulator Body Mass Index (BMI)
5. Aktivitas Kegiatan yang akan dilakukan

Proyek ini dibuat sebagai tugas Ujian Akhir Semester 2 untuk mata kuliah *Pemrograman Berorientasi Objek*, dengan pendekatan pengembangan perangkat lunak secara bertahap.

## Tujuan Aplikasi
1. Membantu pengguna menghitung jumlah kalori harian berdasarkan data tubuh.
2. Memberikan saran menu sarapan dan makan siang sehat.
3. Menunjukkan status indeks massa tubuh (BMI) pengguna.
4. Meningkatkan kesadaran pengguna tentang pentingnya menjaga gizi seimbang.

## Software yang Digunakan 
Pada proyek perancangan aplikasi Nutri Go in menggunakan software sebagai berikut
- Java JDK (bahasa pemrograman utama)
- NetBeans IDE (untuk pengembangan dengan Java Swing)
- MySQL (sebagai basis data)
- XAMPP (untuk mengelola database MySQL)
- Draw.io (untuk flowchart aplikasi)
- Sketsa desain UI (menggunakan tools desain visual kertas)

#### Cara Menggunakan Aplikasi
   1. Buka aplikasi NutriGo pada aplikasi NeatsBeans IDE
   2. Pastikan Database koneksi database MySQL aktif melalui XAMPP melalui localhost/php/myadmin/
   3. File utama yang dijalankan yaitu menampilkan tampilan awal serta membuka form utama fitur aplikasi Nutri Go
      - Welcome.Java merupakan tampilan awal sebelum masuk pada laman register
      - Register.Java user diharapkan mendaftar jika belum terdaftar
      - Login.Java jika sudah terdaftar user bisa masuk di menu home

Menu form utama pada aplikasi ini yaitu
   1. Profiluser.Java pada tampilan ini user dapat mengisi data profil
   2. Information.Java dalam tampilan informasi berisi status gizi, cek ideal serta body mass index untuk mengetahui ideal berat badan           serta kebutuhan kalori yang akan di dibutuhkan
   3. Breakfast.Java tampilan menu rekomendasi pagi
   4. Lunch.Java tampilan menu rekomendasi siang
   5. Aktivitasnew.Java aktivitas yang akan dilakukan oleh user 

## Struktur File yang digunakan Nutri Go
Peran penting dalam perancangan aplikasi Nutri Go
   1. Main.java digunakan merupakan titik awal aplikasi berupa main () method
   2. Aktivitasnew.Java tampilan (input) user tentang kegiatan apa aja yang dilakukan
   3. KalkulatorGizi.Java form untuk menghitung kalori harian dengan menginput >> protein, lemak, dan karbohidrat lalu setelah klik hitung       muncul hasil kebutuhan kalori 
   4. CekIdeal.Java atau bisa disebut Body Mass Index (BMI) dengan menginputkan tb dan bb apakah badan user tergolong <<kurang, normal,          overweight, obesitas
## Aplikasi Nutri Go menggunakan DATABSE apa?
   Aplikasi Nutri Go menggunakan database MySQL untuk menyimpan dan mengelola data aktivitas harian yang sudah diinput oleh user. Koneksi     antara aplikasi dan database dilakukan menggunakan JDBC (Java Database Connectivity). Koneksi Database Class Java yang biasanya            menghubungkan ke koneksi database menggunakan MySQL dan XAMPP biasanya kode berupa DriverManager.getConnection(...)
   Contoh Kode Koneksi:
      try {
                String url = "jdbc:mysql://localhost:3306/profilbaru";
                String user = "root";
                String password = "";

                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                Koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Berhasil!");
            } catch (SQLException e) {
                System.out.println("Koneksi Gagal: " + e.getMessage());
            }
        }
        return Koneksi;
    }
      
## Tim Pengembang
Proyek aplikasi ini di kembangkan sebagai proyek UAS mata kuliah Pemrograman Berorientasi Objek yang di susun oleh:

Nama Ketua : Aliyah Salsabila 24050974013
Anggota    : Octavia Rahmadani 24050974028

Program Studi S1 Pendidikan Teknologi Informasi,
Fakultas Teknik, Universitas Negeri Surabaya 
