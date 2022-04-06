package ru.netology.domain;
public class Poster {
    public static void main(String[] args) {
        FilmsInfo first = new FilmsInfo();
        FilmsInfo second = new FilmsInfo();
        FilmsInfo third = new FilmsInfo();
        FilmsInfo fourth = new FilmsInfo();
        FilmsInfo fifth = new FilmsInfo();
        FilmsInfo sixth = new FilmsInfo();
        FilmsInfo seventh = new FilmsInfo();
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

    public FilmsInfo[] findLast(int resultLength) {
        FilmsInfo params = new FilmsInfo();
        if (resultLength > films.length){
            resultLength = films.length;
        } else {
          resultLength = resultLength;
        }
        FilmsInfo[] result = new FilmsInfo[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}