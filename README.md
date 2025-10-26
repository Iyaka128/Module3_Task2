# CoffeeOrder - DocumentationPractice (Task 2)

**Deskripsi**  
Proyek kecil ini mendemonstrasikan model sederhana untuk pemesanan kopi:
- `OrderInfo` — parameter object yang membawa data pesanan.
- `CoffeeOrder` — model order yang menghitung subtotal, diskon (loyalty), dan pajak.
- `Purchasable` — interface yang mendeklarasikan `getFinalPrice()`.
- `Main` — entry point yang mendemokan pemakaian kelas-kelas di atas.

## Struktur proyek
/project-root
├─ src/
│ └─ main/
│ └─ java/
│ ├─ Main.java
│ ├─ OrderInfo.java
│ ├─ CoffeeOrder.java
│ └─ Purchasable.java
├─ pom.xml (opsional bila menggunakan Maven)
└─ README.md


## Tujuan Task 2
1. Membuat dokumentasi kode menggunakan **JavaDoc** untuk setiap kelas dan method.  
2. Menyusun README yang menjelaskan cara build/run serta bagaimana menghasilkan JavaDoc.  
3. Menunjukkan praktik pengkodean yang baik: encapsulation, named constants, parameter object, extracted methods.

## Cara build & run
### Jika menggunakan IDE (IntelliJ IDEA)
1. Buka proyek (`File -> Open`) lalu pilih folder project.
2. Tunggu IntelliJ mengindeks projek.
3. Buka `Main.java` dan klik kanan -> `Run 'Main.main()'`.

### Jika menggunakan Maven (opsional)
Tambahkan `pom.xml` (jika belum ada) dan gunakan:
```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="Main"

## 3) Cara menghasilkan JavaDoc (langkah detail)
### A. IntelliJ IDEA
1. Buka project di IntelliJ.
2. Pilih `Tools -> Generate JavaDoc...`
3. Dialog:
   - **Scope**: pilih `Module` atau `Package` (pilih semua class yang diinginkan).  
   - **Output directory**: mis. `docs/javadoc` (buat folder ini di root kalau perlu).  
   - **Additional command line parameters**: kosong kecuali perlu flags khusus.
4. Klik **OK**. Tunggu sampai selesai, lalu buka `index.html` di folder output untuk melihat hasil.

### B. Maven
1. Pastikan `pom.xml` ada dan proyek terstruktur sebagai Maven.
2. Jalankan:
```bash
mvn javadoc:javadoc
