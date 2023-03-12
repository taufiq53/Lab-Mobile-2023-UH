# Tugas Praktikum Group Asistensi [D] OOP 2023

*//*>


## Aturan penambahan tugas

 - tugas disimpan di dalam folder **\<NIM kamu\>**

 - di dalam folder NIM tambahkan folder **\<week-x assignment\>** (tugas pekan ke-x)

 - jika tugas lebih dari 1 nomor dan 1 nomor tugasnya memiliki beberapa file, tambahkan folder di dalam **\<week-x assignment\>**, contohnya **\<task No.1\>**

 ![Struktur direktori tugas](/md/ss%20contoh%20struktur%20direktory.jpg)

 - pull request ke repository saya sesuai ke branch **\<NIM\>** (NIM masing masing)
  
  
# Langkah-langkah Push Tugas ke Github
  
## Fork Repository Ini ke akun github kamu 
 - pastikan telah login terlebih dahulu
 - klik tombol **Fork** di sudut kanan atas 
![](/md/ss%20fork%20repo.jpg)
 - kemudian klik **Create fork**
 ![](https://img.shields.io/badge/Create_Fork-success.svg)
  
## **clone** akun repository yang telah di fork ke akun kamu
 - masuk ke repository hasil fork sebelumnya
 - pada bagian kanan klik ![](https://img.shields.io/badge/%3C%3E_Code_%E2%96%BE-success.svg) kemudian copy link yang muncul
 - pastikan telah menginstall git (download disini https://git-scm.com/)
 - arahkan git bash ke folder yang akan dijadikan tempat clone repo 
   
 command :  _X:\\Path\\To\\Director\\'My Directory'_
 ```
 cd D:\\Programming\\'Tugas Praktikum OOP'
 ```
 - jalankan perintah berikut shell
    
 command :  _git clone \<link repo yang sudah dicopy\>_
 ```
 git clone https://github.com/<Username Github Kamu>/Lab-OOP-2023-UH.git
 ```
 ![](/md/ss%20repo%20lokal.jpg)
 folder diatas akan muncul jika clone berhasil
  
## copy tugas yang akan dikumpul ke github
 - ganti **X** pada folder contoh dengan nilai sebenarnya 
 - copy file tugas kedalam folder tersebut sesuai dengan pekan dan nomor (tambahan/hapus folder jika perlu)
![](/md/ss%20struktur%20direktory%20lokal.jpg)

## mengecek status/perubahan yang terjadi
```
    git status
```
  
## tambahkan tugas ke index/staging area

- menambahkan direktory atau file tertentu ke index
  
  contoh :
```
    git add H071201058//'week-1 assignment'//Nomor8.java

```
- menghapus direktory atau file tertentu dari index
  
contoh : 
```
    git rm -f H071201058//'week-1 assignment'//Nomor8.java

```
- menambahkan seluruh perubahan ke staging area
command :  _git add \<filename\>_
```
    git add .
```
atau
```
    git add --all
```
  
## membuat commit 
command : _git comit -m "\<pesan tentang perubahan yang dilakukan\>"_
  
  contoh:
```
git commit -m "Menambahkan tugas praktikum pekan 1 nomor 1-8"
```

## push tugas ke github
 command : _git push origin \<nama branch\>_

```
git push origin main
```

# Membuat pull request

- pada halaman repository, klik tombol pull request, kemudian klik  ![](https://img.shields.io/badge/New_pull_request-success.svg)
- ubah branch yang dituju sesuai dengan nim kamu 
![](/md/ss%20pull%20request.jpg)
- klik  ![](https://img.shields.io/badge/Create_pull_request-success.svg)
- tambahkan pesan jika perlu
- klik  ![](https://img.shields.io/badge/Create_pull_request-success.svg)

**Pada tahap ini pull request sudah berhasi dibuat**

Note : Selain dengan menggunakan cara diatas, kamu juga bisa drag and drop menggunakan fitur _upload file_
  
  <font color="#00ffff" size="5"> Jika ada kendala pada proses mengumpulkan tugas boleh tanyakan pada saat asistensi 😉</font>