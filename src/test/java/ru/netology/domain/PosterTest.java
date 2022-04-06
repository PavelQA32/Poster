package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterTest {
    FilmsInfo first = new FilmsInfo(1,"Bloodshot",10);
    FilmsInfo second = new FilmsInfo(2,"Onward",10);
    FilmsInfo third = new FilmsInfo(3,"Отель'Белград'",10);
    FilmsInfo fourth = new FilmsInfo(4,"The Gentlemen",10);
    FilmsInfo fifth = new FilmsInfo(5,"The Invisible Man",10);
    FilmsInfo sixth = new FilmsInfo(6,"Trolls World Tour",10);
    FilmsInfo seventh = new FilmsInfo(7,"Номер Один",10);

    @Test
    public void shouldSaveFilm() {
        Poster list = new Poster();
        list.save(first);
        FilmsInfo[] expected = {first};
        FilmsInfo[] actual = list.findAll();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldShowFindLast(){
        Poster list = new Poster();
        list.save(second);
        list.save(fifth);
        list.save(seventh);
        list.findLast(5);
        FilmsInfo[] expected = {seventh,fifth,second};
        FilmsInfo[] actual = list.findLast(5);
        assertEquals(expected,actual);
    }
}