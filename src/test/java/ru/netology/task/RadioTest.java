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
        rad.setCurrentRadioStation(9);
        rad.nextRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    void prevRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.prevRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    void getCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(3);

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
        rad.setCurrentVolume(10);

        rad.increaseVolume();


        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    void reduceVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.reduceVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);

    }
}