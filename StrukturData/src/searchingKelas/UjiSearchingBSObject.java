package searchingKelas;

import model.Mahasiswa;

public class UjiSearchingBSObject {

    public static void main(String[] args) {
        // DATA
        Mahasiswa[] data = {
            new Mahasiswa("120001", "Slamet", 2.5),
            new Mahasiswa("120002", "Joko", 2.8),
            new Mahasiswa("120003", "Kadir", 3.5),
            new Mahasiswa("120004", "Eko", 3.25),
            new Mahasiswa("120005", "Bejo", 3.1),
            new Mahasiswa("120006", "Asto", 4.0),
            new Mahasiswa("120007", "Risky", 3.8),
            new Mahasiswa("120008", "Pecky", 3.7),
            new Mahasiswa("120009", "Barjo", 2.75),
            new Mahasiswa("120010", "Wempi", 3.6)
        };

        //OBject yang dicari
        Mahasiswa cari = new Mahasiswa("1200080", "Peckys", 2.75);

        //LAKUKAN PENCARIAN DENGAN SEQ SEARCH
        SearchingObject search = new SearchingObject();
        int a = search.sequensialSearch(data, cari);
        if (a >= 0) {
            System.out.println("Data ditemukan di indeks ke:" + a);
        } else {
            System.out.println("Data tidak ditemukan");
        }

    }
}
