package com.mayol.adaptorPattern.impl;

import com.mayol.adaptorPattern.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Player Mp4.fileName" + fileName);
    }
}
