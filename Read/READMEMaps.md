## Maps

Lokasi file : [Menu.java](../app/src/main/java/com/a4/helloapps/Menu.java)

```JAVA
@Override
public void onClick(View v) {

  Intent mapIntent = new Intent(Intent.ACTION_VIEW);
  mapIntent.setPackage("com.google.android.apps.maps");

  if (mapIntent.resolveActivity(getPackageManager()) != null) {
  startActivity(mapIntent);
}
```

metode onclick dalam sebuah implementasi event handler pada Android, biasanya digunakan untuk menangani klik pada suatu elemen antarmuka pengguna (UI), seperti tombol. Berikut adalah penjelasannya:

- ```Intent mapIntent = new Intent(Intent.ACTION_VIEW);``` : Membuat objek Intent dengan aksi ACTION_VIEW, yang biasanya digunakan untuk menampilkan data yang dapat dilihat oleh pengguna.
- ```mapIntent.setPackage("com.google.android.apps.maps");``` : Menentukan aplikasi yang akan menangani intent ini, dalam hal ini, aplikasi peta Google Maps.
- ```if (mapIntent.resolveActivity(getPackageManager()) != null) {``` : Memeriksa apakah terdapat aplikasi yang dapat menangani intent tersebut. Jika ada, lanjut ke langkah berikutnya.
- ```startActivity(mapIntent);``` : Memulai aktivitas (activity) yang terkait dengan intent, yang pada kasus ini akan membuka aplikasi Google Maps.

Jadi, saat elemen antarmuka pengguna yang terhubung dengan metode ini diklik, aplikasi akan mencoba membuka Google Maps, asalkan aplikasi tersebut terpasang di perangkat dan siap menangani intent dengan aksi ACTION_VIEW.

