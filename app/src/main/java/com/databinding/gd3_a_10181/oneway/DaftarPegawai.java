package com.databinding.gd3_a_10181.oneway;

import java.util.ArrayList;

public class DaftarPegawai {
    public ArrayList<Pegawai> Pegawai;

    public DaftarPegawai() {
        Pegawai = new ArrayList();
        Pegawai.add(Yosia);
        Pegawai.add(Wendy);
        Pegawai.add(Hans);
        Pegawai.add(Eras);
        Pegawai.add(Chris);
        Pegawai.add(Ryo);
        Pegawai.add(Ryan);
        Pegawai.add(Jonathan);
    }

    public static final Pegawai Yosia = new Pegawai("Yosia Galih", "180709971",
            "Asisten Bahasa Inggris Khusus", "Yogyakarta", 5000000, 2018);

    public static final Pegawai Wendy = new Pegawai("Wendy Winata", "180709598",
            "Asisten Dasar Pemrograman", "Kaliurang", 5500000, 2017);

    public static final Pegawai Hans = new Pegawai("Hans Giovani", "180709734",
            "Asisten Basis Data", "Jawa Tengah", 4500000, 2019);

    public static final Pegawai Eras = new Pegawai("Eras Timothy", "180709642",
            "Asisten Struktur Data", "Kalimantan Barat", 5250000, 2018);

    public static final Pegawai Chris = new Pegawai("Cris Yustianto", "180709999",
            "Asisten Jaringan Komputer", "Yogyakarta", 6000000, 2017);

    public static final Pegawai Ryo = new Pegawai("Aditya Rio", "180709840",
            "Asisten Pemrograman Berorientasi Objek", "Sukoharjo Solo", 4750000, 2019);

    public static final Pegawai Ryan = new Pegawai("Hilarius Ryan", "180709780",
            "Asisten Pemrograman Berbasis Platform", "Malang", 5300000, 2018);

    public static final Pegawai Jonathan = new Pegawai("Jonathan Robertus", "180709646",
            "Asisten Jaringan Komputer", "Sleman", 5500000, 2017);
}