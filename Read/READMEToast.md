## Toast

Lokasi file : [ActivityCount.java](../app/src/main/java/com/a4/helloapps/ActivityCount.java)

```Java
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }
```

Kode diatas adalah metode suatu kelas di Android yang bertujuan untuk menampilkan pesan toast. Penjelasannya:

- Metode showToast(View view): metode yang akan dipanggil saat suatu tindakan terjadi, seperti menekan tombol yang terhubung dengan metode ini.
- Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);:
- Toast: Objek dari kelas Toast yang digunakan untuk menampilkan pesan sementara.
makeText(): Metode statis dari kelas Toast untuk membuat instans Toast baru.
- this: Merujuk pada konteks saat ini, yaitu aktivitas atau objek konteks tempat metode ini dipanggil.
- R.string.toast_message: Menggunakan string dari sumber daya string (biasanya didefinisikan di file res/values/strings.xml). Ini memungkinkan untuk lebih mudah mengelola pesan yang ditampilkan.
- Toast.LENGTH_SHORT: Menunjukkan durasi tampilan pesan toast, dalam hal ini, pesan akan ditampilkan dalam waktu singkat.
- toast.show();: Memanggil metode show() untuk menampilkan pesan toast yang telah disiapkan sebelumnya.

Jadi Toast itu tujuannya uuntuk menampilkan pesan singkat kepada pengguna (sesuai dengan nilai yang didefinisikan dalam R.string.toast_message) melalui elemen UI, seperti tombol, yang terhubung dengan metode showToast.
