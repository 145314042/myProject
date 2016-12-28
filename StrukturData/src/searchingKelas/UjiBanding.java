package searchingKelas;

import model.Mahasiswa;

public class UjiBanding {

    public static void main(String[] args) {
        Mahasiswa mhs1
                = new Mahasiswa("1200001", "Slamet", 3.5);
        Mahasiswa mhs2
                = new Mahasiswa("1200002", "Joko", 3.0);

        if (mhs1.compareTo(mhs2) == 0) {
            System.out.println("IPK " + mhs1.getNama()
                    + "(" + mhs1.getNim() + ")"
                    + "sama dengan " + mhs2.getNama()
                    + "(" + mhs2.getNim() + ")");
        } else if (mhs1.compareTo(mhs2) > 0) {
            System.out.println("IPK " + mhs1.getNama()
                    + "(" + mhs1.getNim() + ")"
                    + "lebih besar " + mhs2.getNama()
                    + "(" + mhs2.getNim() + ")");
        } else {
            System.out.println("IPK " + mhs1.getNama()
                    + "(" + mhs1.getNim() + ")"
                    + "lebih kecil " + mhs2.getNama()
                    + "(" + mhs2.getNim() + ")");
        }

    }

}
