package ru.netology.task;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }
        if (currentRadioStation < 0) {
            currentRadioStation = 9;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {
        setCurrentRadioStation(currentRadioStation + 1);
    }

    public void prevRadioStation() {
        setCurrentRadioStation(currentRadioStation - 1);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
           setCurrentVolume(currentVolume + 1);
        }


    public void reduceVolume() {
        setCurrentVolume(currentVolume - 1);
    }

}

