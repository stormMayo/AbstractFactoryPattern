package com.mayol.adaptorPattern.impl;

import com.mayol.adaptorPattern.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC.fileName" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
