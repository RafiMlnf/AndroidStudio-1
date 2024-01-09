![header2](https://github.com/RafiMlnf/AndroidStudio-1/assets/115614668/3aff9ed7-100a-4edc-8eea-34391c0d29a4)

```
Mata Kuliah : Pemrograman Mobile 1
Dosen       : Donny Maulana, S.Kom., M.M.S.I.
Nama        : Rafi Maulana Firdaus
NIM         : 312210382
```
--------------------------

![fetchpng](https://github.com/RafiMlnf/AndroidStudio-1/assets/115614668/3a89b928-b1fe-47fc-9ca8-ca9fb74e33f7)

Hyperlink masing-masing penjelasan lengkap setiap activity :  
- [Penjelasan Toast](Read/READMEToast.md)
- [Penjelasan Pesan (Activity1&2)](Read/READMEPesan.md)
- [Penjelasan Fibonacci](Read/READMEFibonacci.md)
- [Penjelasan Alarm](Read/READMEAlarm.md)
- [Penjelasan Maps](Read/READMEMaps.md)
- [Penjelasan Splash]
- [Penjelasan Fragment]

---------------------------

## 1. Halo
Activity pertama yang dibuat adalah Activity Halo. Menampilkan aktivitas teks "Halo! Apa Kabar?"  
  
<img src="img/halo.jpg" width=100>  

## 2. Toast
Pesan pop-up sederhana yang muncul di layar, memberi tahu user status tertentu. Toast biasanya digunakan untuk memberikan umpan balik singkat.

```JAVA
public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }
```

```JAVA
<string name="toast_message">Hello Toast!</string>
```

## 3. Scrolling (Ice Cold)
Menampilkan teks berita yang dapat di scroll. Menggunakan metode `scrollview` yang didalamnya diisi dengan `textview` berita.

```JAVA
<ScrollView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">
       <TextView ... />
</ScrollView>
```

## 4. Count
<img src="img/count.jpg" width=100>  

## 5. Fibonacci  
https://github.com/RafiMlnf/AndroidStudio-1/assets/115614668/c59279ce-d453-40ec-9b4e-708296b6d60a

## 6. Intent  
Implicit Intent - aktivitas yang diinginkan meminta sistem untuk membuka kamera, alarm, maps, dll.  
Explicit Intent - berpindah dari satu aktivitas ke aktivitas lainnya di dalam aplikasi Android Anda.  

> Contoh: Explicit intent dari aktivitas 1 ke aktivitas 2

https://github.com/RafiMlnf/AndroidStudio-1/assets/115614668/049a9ea9-220e-44fa-9f53-7501f1525a4c

## 7. Pesan  
Mengirimkan pesan dari aktivitas 1 lalu menampilkan pesan di aktivitas 2 (Explicit intent)  

https://github.com/RafiMlnf/AndroidStudio-1/assets/115614668/aaf0a9d5-d487-4874-adcf-7bc2b53a68b8

## 8. Menu
<img src="img/menu.jpg" width=100>  

## 9. Maps  
Memanggil sistem untuk membuka Google Maps (Implicit intent)  
https://github.com/RafiMlnf/AndroidStudio-1/assets/115614668/83c719b7-d49d-4af0-bd06-dbafdd8bc723



## 10. Splash  
Layar awal yang muncul sebentar saat aplikasi dijalankan sebelum berpindah ke layar utama atau menu utama.

https://github.com/RafiMlnf/AndroidStudio-1/assets/115614668/d1b48d1e-c2e9-419f-be3e-ca7e7252c546

## 11. Fragment


## 12. Sinopsis & Trailer / Playable Video  
https://github.com/RafiMlnf/AndroidStudio-1/assets/115614668/fbe6aa79-1ada-4924-8ba4-ccecd21963d7

----------------------------

## Fitur diluar Tugas
### 1. Splash
   - Transisi fade in ketika aplikasi dibuka
   - Penggunaan interpolator exponential out pada splash art
     
     > Ada banyak jenis interpolator, seperti ease in/out, bounce in/out, sine in/out, back in/out, linear in/out, dan masih banyak lagi.
   - Transisi fade out dari splash ke menu

### 2. Menu
   - Teks salam pada menu, menyesuaikan jam Waktu Indonesia Barat
   - Random teks, akan berganti-ganti ketika aplikasi dibuka
   - Animasi pressed respons / responsive icon ketika ditekan

### 3. Fragment
   - Animasi pressed respons / responsive icon ketika ditekan




