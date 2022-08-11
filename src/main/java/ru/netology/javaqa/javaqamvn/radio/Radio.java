package ru.netology.javaqa.javaqamvn.radio;

public class Radio {
    public int currentRadioStation; //задание станции

    public int currentVolume; // задание громкости

    public int getCurrentRadioStation() { // запрос станции

        return currentRadioStation;
    }

    public int setCurrentRadioStation(int newStation) { //условие что станция в пределах
        if (newStation >= 0 && newStation <=9) {
            currentRadioStation = newStation;

        }
        return currentRadioStation;
    }
    public int nextStation() { // переход на следующую станцию
        if (currentRadioStation < 9) {
           currentRadioStation = currentRadioStation +1;
        }
        else {
            currentRadioStation = 0;
        }
        return currentRadioStation;
    }

    public int prevStation() { //переход на предыдущую станцию
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        else{
            currentRadioStation = 9;
        }
        return currentRadioStation;
    }

    public int getCurrentVolume() { // запрос громкости
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) { //условие что громкость в пределах
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        currentVolume = newVolume;
    }
//////   (изменить!!!!!!!)закоммитить и запушить
    public int nextVolume() { // увеличение громкости
        if (currentVolume < 10){
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
        return currentVolume;
    }

    public int prevVolume() {  // уменьшение громкости
        if (currentVolume > 0){
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
        return currentVolume;
    }

}

