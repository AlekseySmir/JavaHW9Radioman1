package ru.netology.javaqa.javaqamvn.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test  //задание станции
    public void shouldSetRadioStation(){
        Radio rad = new Radio ();
        rad.setCurrentRadioStation(5);
        int expected = 5;
        int actual = rad.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test // следующая станция в пределах
    public void currentStationPlusOne(){
        Radio rad = new Radio ();
        rad.setCurrentRadioStation(8);
        rad.nextStation();
        int expected = 9;
        int actual = rad.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test // следующая за максимальной
    public void stationNextMax(){
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        rad.nextStation();
        int expected = 0;
        int actual = rad.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test // предыдущая станция в пределах
    public void currentStationMinusOne(){
        Radio rad = new Radio();
        rad.setCurrentRadioStation(6);
        rad.prevStation();
        int expected = 5;
        int actual = rad.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test  //предыдущая от минимальной
    public void stationLessThenMin (){
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.prevStation();
        int expected = 9;
        int actual = rad.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test  //станция не должна быть больше максимальной
    public void shouldNoSetRadioStationAboveMax(){
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test //станция не должна быть меньше минимальной
    public void shouldNoSetRadioStationLessMin(){
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test // задание громкости
    public void shouldSetVolume(){
        Radio rad = new Radio ();
        rad.setCurrentVolume(5);
        int expected = 5;
        int actual = rad.currentVolume;
        Assertions.assertEquals(expected, actual);
    }
    @Test  //громкость не должна быть больше максимальной
    public void shouldNoSetVolumeAboveMax(){
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test //громкость не должна быть меньше минимальной
    public void shouldNoSetVolumeLessMin(){
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test // увеличение громкости, если громкость максимальная
    public void currentVolumePlusOneFromMax(){
        Radio rad = new Radio ();
        rad.setCurrentVolume(10);
        rad.nextVolume();
        int expected = 10;
        int actual = rad.currentVolume;
        Assertions.assertEquals(expected, actual);
    }
    @Test // увеличение громкости на 1
    public void currentVolumePlusOne(){
        Radio rad = new Radio ();
        rad.setCurrentVolume(9);
        rad.nextVolume();
        int expected = 10;
        int actual = rad.currentVolume;
        Assertions.assertEquals(expected, actual);
    }
    @Test // уменьшение громкости, если громкость минимальная
    public void currentVolumeMinusOneFromMin(){
        Radio rad = new Radio ();
        rad.setCurrentVolume(0);
        rad.prevVolume();
        int expected = 0;
        int actual = rad.currentVolume;
        Assertions.assertEquals(expected, actual);
    }
    @Test // уменьшение громкости на 1
    public void currentVolumeMinusOne(){
        Radio rad = new Radio ();
        rad.setCurrentVolume(1);
        rad.prevVolume();
        int expected = 0;
        int actual = rad.currentVolume;
        Assertions.assertEquals(expected, actual);
    }
}

