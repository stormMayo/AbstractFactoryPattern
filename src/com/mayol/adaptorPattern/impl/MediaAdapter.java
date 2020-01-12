package com.mayol.adaptorPattern.impl;

import com.mayol.adaptorPattern.AdvancedMediaPlayer;
import com.mayol.adaptorPattern.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if("vlc".equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new VlcPlayer();
        }else if("mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String fileType, String fileName) {
        if("vlc".equalsIgnoreCase(fileName)){
            advancedMediaPlayer.playVlc(fileName);
        }else if("mp4".equalsIgnoreCase(fileName)){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
