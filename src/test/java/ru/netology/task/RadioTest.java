package ru.netology.task;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void getCurrentRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(4);
        ;

        int expected = 4;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStation() {
        Radio rad = new Radio();
        rad.nextRadioStation(9);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    void prevRadioStation() {
        Radio rad = new Radio();
        rad.prevRadioStation(0);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    void getCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(3);
        ;

        int expected = 3;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio rad = new Radio();
        rad.increaseVolume(10);

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    void reduceVolume() {
        Radio rad = new Radio();
        rad.reduceVolume(0);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);

    }
}