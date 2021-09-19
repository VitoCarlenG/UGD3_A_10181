package com.databinding.gd3_a_10181.twoway;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.databinding.gd3_a_10181.BR;

public class Pegawai extends BaseObservable {
    public String nama_pegawai;
    public String nomor_pokok;
    public String jabatan;
    public String alamat;
    public double gaji;
    public String tanggal_masuk;

    public Pegawai() {}

    public Pegawai(String nama_pegawai, String nomor_pokok, String jabatan, String alamat, double gaji, String tanggal_masuk) {
        this.nama_pegawai = nama_pegawai;
        this.nomor_pokok = nomor_pokok;
        this.jabatan = jabatan;
        this.alamat = alamat;
        this.gaji = gaji;
        this.tanggal_masuk = tanggal_masuk;
    }

    @Bindable
    public String getNama_pegawai() {
        return nama_pegawai;
    }

    public void setNama_pegawai(String nama_pegawai) {
        this.nama_pegawai = nama_pegawai;
        notifyPropertyChanged(BR.nama_pegawai);
    }

    @Bindable
    public String getNomor_pokok() {
        return nomor_pokok;
    }

    public void setNomor_pokok(String nomor_pokok) {
        this.nomor_pokok = nomor_pokok;
        notifyPropertyChanged(BR.nomor_pokok);
    }

    @Bindable
    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
        notifyPropertyChanged(BR.jabatan);
    }

    @Bindable
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
        notifyPropertyChanged(BR.alamat);
    }

    @Bindable
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
        notifyPropertyChanged(BR.gaji);
    }

    @Bindable
    public String getStringGaji() {
        return String.valueOf(gaji);
    }

    public void setStringGaji(String gaji) {
        if(gaji.isEmpty()) {
            this.gaji=0;
        } else {
            this.gaji = Double.parseDouble(gaji);
        }
        notifyPropertyChanged(BR.gaji);
    }

    @Bindable
    public String getTanggal_masuk() {
        return tanggal_masuk;
    }

    public void setTanggal_masuk(String tanggal_masuk) {
        this.tanggal_masuk = tanggal_masuk;
        notifyPropertyChanged(BR.tanggal_masuk);
    }
}
