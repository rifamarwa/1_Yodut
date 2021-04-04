package com.example.yodut;

public class Tugas {

    private String namaTugas;
    private String deadline;
    private String mataKuliah;

    public Tugas(String namaTugas, String deadline, String mataKuliah) {
        this.namaTugas = namaTugas;
        this.deadline = deadline;
        this.mataKuliah = mataKuliah;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    public void setNamaTugas(String namaTugas) {
        this.namaTugas = namaTugas;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
}
