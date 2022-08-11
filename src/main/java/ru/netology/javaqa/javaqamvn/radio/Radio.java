package ru.netology.javaqa.javaqamvn.radio;

public class Radio {
    public int currentRadioStation; //задание станции
    public int maxRadioStation = 9;
    public int minRadioStation = 0;
    public int currentVolume; // задание громкости
    public int maxVolume = 10;
    public int minVolume = 0;


    public int getCurrentRadioStation(){ // запрос станции
        return currentRadioStation;
    }
    public void setCurrentRadioStation (int newStation) { //условие что станция в пределах
        if (newStation < minRadioStation) {
            return;
        }
        if (newStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newStation;
    }
    public void nextStation(){ // переход на следующую станцию
        if (currentRadioStation >= maxRadioStation){
            setCurrentRadioStation(minRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }
    public void prevStation(){ //переход на предыдущую станцию
        if (currentRadioStation <=minRadioStation){
            setCurrentRadioStation(maxRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }
    public int getCurrentVolume(){ // запрос громкости
        return currentVolume;
    }
    public void setCurrentVolume (int newVolume) { //условие что громкость в пределах
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        currentVolume = newVolume;
    }
    public void nextVolume(){ // увеличение громкости
        setCurrentVolume(currentVolume + 1);
    }
    public void prevVolume(){  // уменьшение громкости
        setCurrentVolume(currentVolume - 1);
    }

}

