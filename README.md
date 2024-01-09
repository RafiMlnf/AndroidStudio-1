![header2](https://github.com/RafiMlnf/AndroidStudio-1/assets/115614668/3aff9ed7-100a-4edc-8eea-34391c0d29a4)

```
Mata Kuliah : Pemrograman Mobile 1
Dosen       : Donny Maulana, S.Kom., M.M.S.I.
Nama        : Rafi Maulana Firdaus
NIM         : 312210382
```

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
## 5. Fibonacci
## 6. Intent
## 7. Pesan
## 8. Menu
## 9. Maps
## 10. Splash

## 11. Fragment
Task: Buatlah fragment menu dengan tema Genre Film (Action, Komedi dan Romance).  
Tampilan bisa berisi sinopsis film dan gambar dari film tersebut.

Preview :  

<img src="Read/picture/fragment.gif" width=200>

## 12. Sinopsis & Trailer / Playable Video

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




