package com.databinding.gd3_a_10181.oneway;

public class Pegawai {
    public String nama_pegawai;
    public String nomor_pokok;
    public String jabatan;
    public String alamat;
    public double gaji;
    public Integer tahun_masuk;

    public Pegawai(String nama_pegawai, String nomor_pokok, String jabatan, String alamat, double gaji, Integer tahun_masuk) {
        this.nama_pegawai = nama_pegawai;
        this.nomor_pokok = nomor_pokok;
        this.jabatan = jabatan;
        this.alamat = alamat;
        this.gaji = gaji;
        this.tahun_masuk = tahun_masuk;
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

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public Integer getTahun_masuk() {
        return tahun_masuk;
    }

    public void setTahun_masuk(Integer tahun_masuk) {
        this.tahun_masuk = tahun_masuk;
    }
}
