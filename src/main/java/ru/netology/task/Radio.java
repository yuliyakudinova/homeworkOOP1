package ru.netology.task;

public class Radio {
    private int currentRadioStation;
    private int numberStation = 10;
    private int currentVolume;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public int maxStation() {
        return (numberStation - 1);
    }

    public Radio(int numberStation) {
        this.numberStation = numberStation;
    }

    public Radio() {
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxStation()) {
            currentRadioStation = 0;
        }
        if (currentRadioStation < 0) {
            currentRadioStation = maxStation();
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
        if (currentVolume > 100) {
            currentVolume = 100;
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

