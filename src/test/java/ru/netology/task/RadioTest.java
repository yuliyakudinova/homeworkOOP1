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

        int expected = 4;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
    @Test
        void shouldCheckMaxStation() {
        Radio rad = new Radio();
        rad.setNumberStation(12);
        rad.maxStation();

        int expected = 11;
        int actual = rad.maxStation();
          assertEquals(expected, actual);
   }

    @Test
    void shouldCheckNumberStation() {
        Radio rad = new Radio(12);

        assertEquals(11, rad.maxStation());

        Radio rad1 = new Radio();

        assertEquals(9, rad1.maxStation());
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

        Radio rad2 = new Radio();
        rad2.setCurrentRadioStation(0);
        rad2.nextRadioStation();

        int expected2 = 1;
        int actual2 = rad2.getCurrentRadioStation();

        assertEquals(expected2, actual2);
    }

    @Test
    void prevRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.prevRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);

        Radio rad2 = new Radio();
        rad2.setCurrentRadioStation(9);
        rad2.prevRadioStation();

        int expected2 = 8;
        int actual2 = rad2.getCurrentRadioStation();

        assertEquals(expected2, actual2);

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
        rad.setCurrentVolume(99);

        int expected = 99;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);

        Radio rad2 = new Radio();
        rad2.setCurrentVolume(0);
        rad2.increaseVolume();

        int expected2 = 1;
        int actual2 = rad2.getCurrentVolume();

        assertEquals(expected2, actual2);

    }

    @Test
    void reduceVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.reduceVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);

        Radio rad2 = new Radio();
        rad2.setCurrentVolume(100);
        rad2.reduceVolume();

        int expected2 = 99;
        int actual2 = rad2.getCurrentVolume();

        assertEquals(expected2, actual2);

    }
}