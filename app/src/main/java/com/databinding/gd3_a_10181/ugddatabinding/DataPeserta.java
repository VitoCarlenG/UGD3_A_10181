package com.databinding.gd3_a_10181.ugddatabinding;

public class DataPeserta {
    public String nama_pegawai;
    public String nomor_pokok;
    public String jabatan;
    public String alamat;
    public double tensi;
    public String tanggalVaksin;
    public String imgURL;

    public DataPeserta(String nama_pegawai, String nomor_pokok, String jabatan, String alamat, double tensi, String tanggalVaksin, String imgURL) {
        this.nama_pegawai = nama_pegawai;
        this.nomor_pokok = nomor_pokok;
        this.jabatan = jabatan;
        this.alamat = alamat;
        this.tensi = tensi;
        this.tanggalVaksin = tanggalVaksin;
        this.imgURL = imgURL;
    }

    public String getNama_pegawai() {
        return nama_pegawai;
    }

    public void setNama_pegawai(String nama_pegawai) {
        this.nama_pegawai = nama_pegawai;
    }

    public String getNomor_pokok() {
        return nomor_pokok;
    }

    public void setNomor_pokok(String nomor_pokok) {
        this.nomor_pokok = nomor_pokok;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getTensi() {
        return tensi;
    }

    public void setTensi(double tensi) {
        this.tensi = tensi;
    }

    public String getTanggalVaksin() {
        return tanggalVaksin;
    }

    public void setTanggalVaksin(String tanggalVaksin) {
        this.tanggalVaksin = tanggalVaksin;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}
