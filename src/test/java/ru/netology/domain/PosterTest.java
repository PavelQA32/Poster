package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterTest {

    FilmsInfo first = new FilmsInfo(1, "Bloodshot");
    FilmsInfo second = new FilmsInfo(2, "Onward");
    FilmsInfo third = new FilmsInfo(3, "Отель'Белград'");
    FilmsInfo fourth = new FilmsInfo(4, "The Gentlemen");
    FilmsInfo fifth = new FilmsInfo(5, "The Invisible Man");
    FilmsInfo sixth = new FilmsInfo(6, "Trolls World Tour");
    FilmsInfo seventh = new FilmsInfo(7, "Номер Один");
    FilmsInfo eighth = new FilmsInfo();
    FilmsInfo ninth = new FilmsInfo();
    FilmsInfo tenth = new FilmsInfo();
    FilmsInfo eleventh = new FilmsInfo();

    @Test
    public void shouldSaveFilm() {
        Poster list = new Poster();
        list.save(first);
        FilmsInfo[] expected = {first};
        FilmsInfo[] actual = list.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowFindLast() {
        Poster list = new Poster();
        list.save(second);
        list.save(fifth);
        list.save(seventh);
        list.findLast(5);
        FilmsInfo[] expected = {seventh, fifth, second};
        FilmsInfo[] actual = list.findLast(5);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        Poster list = new Poster();
        list.save(first);
        list.save(second);
        list.save(third);
        list.save(fourth);
        list.save(fifth);
        list.save(sixth);
        list.save(seventh);
        list.save(eighth);
        list.save(ninth);
        list.save(tenth);
        list.save(eleventh);
        FilmsInfo[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        FilmsInfo[] actual = list.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShouListOfFilmsWithLimit() {
        Poster list = new Poster();
        list.save(first);
        list.save(second);
        list.save(third);
        list.save(fourth);
        list.save(fifth);
        list.save(sixth);
        list.save(seventh);
        list.save(eighth);
        list.save(ninth);
        list.save(tenth);
        list.save(eleventh);

        FilmsInfo[] expected = {eleventh, tenth, ninth, eighth};
        FilmsInfo[] actual = list.findLastWhitsParams(4);

        assertArrayEquals(expected, actual);
    }
}