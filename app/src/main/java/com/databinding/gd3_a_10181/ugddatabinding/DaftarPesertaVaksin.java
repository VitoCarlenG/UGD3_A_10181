package com.databinding.gd3_a_10181.ugddatabinding;

import java.util.ArrayList;

public class DaftarPesertaVaksin {
    public ArrayList<DataPeserta> DataPeserta;

    public DaftarPesertaVaksin() {
        DataPeserta = new ArrayList();  
        DataPeserta.add(Yosia);
        DataPeserta.add(Wendy);
        DataPeserta.add(Hans);
        DataPeserta.add(Eras);
        DataPeserta.add(Chris);
        DataPeserta.add(Ryo);
        DataPeserta.add(Ryan);
        DataPeserta.add(Jonathan);
    }

    public static final DataPeserta Yosia = new DataPeserta("Yosia Galih", "180709971",
            "Asisten Bahasa Inggris Khusus", "Yogyakarta", 90, "20/09/2021", "");

    public static final DataPeserta Wendy = new DataPeserta("Wendy Winata", "180709598",
            "Asisten Dasar Pemrograman", "Kaliurang", 80, "20/09/2021", "");

    public static final DataPeserta Hans = new DataPeserta("Hans Giovani", "180709734",
            "Asisten Basis Data", "Jawa Tengah", 90, "19/09/2021", "");

    public static final DataPeserta Eras = new DataPeserta("Eras Timothy", "180709642",
            "Asisten Struktur Data", "Kalimantan Barat", 100, "18/09/2021", "");

    public static final DataPeserta Chris = new DataPeserta("Cris Yustianto", "180709999",
            "Asisten Jaringan Komputer", "Yogyakarta", 110, "17/09/2021", "");

    public static final DataPeserta Ryo = new DataPeserta("Aditya Rio", "180709840",
            "Asisten Pemrograman Berorientasi Objek", "Sukoharjo Solo", 120, "18/09/2021", "");

    public static final DataPeserta Ryan = new DataPeserta("Hilarius Ryan", "180709780",
            "Asisten Pemrograman Berbasis Platform", "Malang", 110, "19/09/2021", "");

    public static final DataPeserta Jonathan = new DataPeserta("Jonathan Robertus", "180709646",
            "Asisten Jaringan Komputer", "Sleman", 100, "20/09/2021", "");
}