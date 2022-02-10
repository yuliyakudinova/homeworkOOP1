package ru.netology.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;


@Data
public class Radio {
    private int currentRadioStation;
    private int numberStation = 10;
    private int currentVolume;
    private int maxStation = maxStation();

    public int maxStation() {
         return (numberStation - 1);
    }

    public Radio(int numberStation) {
        this.numberStation = numberStation;
    }

    public Radio() {
    }

    public void nextRadioStation() {
        setCurrentRadioStation(currentRadioStation + 1);
        if (currentRadioStation > maxStation()) {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        setCurrentRadioStation(currentRadioStation - 1);
        if (currentRadioStation < 0) {
            currentRadioStation = maxStation();
        }
    }

    public void increaseVolume() {
        setCurrentVolume(currentVolume + 1);
        if (currentVolume > 100) {
            currentVolume = 100;
        }
    }

    public void reduceVolume() {
        setCurrentVolume(currentVolume - 1);
        if (currentVolume < 0) {
            currentVolume = 0;
        }
    }
}

