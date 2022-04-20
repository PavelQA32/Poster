package ru.netology.domain;

import java.lang.reflect.Field;

public class Poster {
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
        if (resultLength > films.length) {
            resultLength = films.length;
        }
        FilmsInfo[] result = new FilmsInfo[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public FilmsInfo[] findLast() {
        int resultLength = 10;
//       if (resultLength > films.length){
//            resultLength = films.length;
//        }
        FilmsInfo[] result = new FilmsInfo[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public FilmsInfo[] findLastWithParams(int resultLength) {
        FilmsInfo[] result = new FilmsInfo[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}