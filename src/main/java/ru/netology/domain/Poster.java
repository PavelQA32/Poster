package ru.netology.domain;

public class Poster {
    public static void main(String[] args) {
        FilmsInfo first = new FilmsInfo(1, "Bloodshot");
        FilmsInfo second = new FilmsInfo(2, "Onward");
        FilmsInfo third = new FilmsInfo(3, "Отель'Белград");
        FilmsInfo fourth = new FilmsInfo(4, "The Gentlemen");
        FilmsInfo fifth = new FilmsInfo(5, "The Invisible Man");
        FilmsInfo sixth = new FilmsInfo(6, "Trolls World Tour");
        FilmsInfo seventh = new FilmsInfo(7, "Номер Один");
    }

    private FilmsInfo[] films = new FilmsInfo[0];

    public void save(FilmsInfo film) {
        int length = films.length + 1;
        FilmsInfo[] addFilm = new FilmsInfo[length];
        for (int i = 0; i < films.length; i++) {
            addFilm[i] = films[i];
        }
        addFilm[addFilm.length - 1] = film;
        films = addFilm;
    }

    public FilmsInfo[] findAll() {
        return films;
    }

    public FilmsInfo[] findLast() {
        FilmsInfo[] result = new FilmsInfo[films.length];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = index[i];
        }
        return result;
    }
}