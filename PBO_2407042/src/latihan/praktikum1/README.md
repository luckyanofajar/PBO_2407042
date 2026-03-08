# Praktikum 1 - Class, Attribute, Objek, dan Method

## Informasi Praktikum
- **Mata Kuliah**: Pemrograman Berorientasi Objek (PBO)
- **Dosen**: MUHAMMAD EDI ISWANTO, M.Kom.
- **Tanggal**: Rabu, 4 Februari 2026
- **Topik**: Praktikum Class, Attribute, Objek, dan Method
- **NIM**: 2407042

## Tujuan Pembelajaran
1. Memahami konsep Class sebagai blueprint/cetakan objek
2. Memahami Attribute sebagai data/properti dalam class
3. Memahami Method sebagai perilaku/behavior objek
4. Mampu membuat dan menggunakan Objek dari sebuah Class

## Class yang Dibuat

### Class: `Mahasiswa`

#### Attribute:
| Attribute | Tipe Data | Keterangan |
|-----------|-----------|------------|
| nama      | String    | Nama lengkap mahasiswa |
| nim       | String    | Nomor Induk Mahasiswa |
| kelas     | String    | Kelas perkuliahan |
| ipk       | double    | Indeks Prestasi Kumulatif |

#### Constructor:
1. **Constructor Default**: Membuat objek dengan nilai default
2. **Constructor Parameter**: Membuat objek dengan nilai langsung diisi

#### Method:
| Method | Keterangan |
|--------|------------|
| `belajar()` | Menampilkan aktivitas belajar |
| `tugas()` | Menampilkan aktivitas mengerjakan tugas |
| `ujian()` | Menampilkan aktivitas ujian |
| `tampilkanData()` | Menampilkan semua data mahasiswa dalam format tabel |
| `cekKelulusan()` | Mengecek status kelulusan berdasarkan IPK |
| Getter & Setter | Mengambil dan mengubah nilai attribute |

## Cara Compile dan Run

### Menggunakan Command Line:
```bash
# Masuk ke folder src
cd src

# Compile
javac praktikum1/Mahasiswa.java praktikum1/Main.java

# Run
java praktikum1.Main