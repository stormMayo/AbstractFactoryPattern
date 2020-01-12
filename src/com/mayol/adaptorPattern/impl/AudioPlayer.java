package com.mayol.adaptorPattern.impl;

import com.mayol.adaptorPattern.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    @Override
    public void play(String fileType, String fileName) {
        if(fileType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file.name:"+ fileName);
        }else if("vlc".equalsIgnoreCase(fileType) || "mp3".equalsIgnoreCase(fileType)){
            mediaAdapter = new MediaAdapter(fileType);
            mediaAdapter.play(fileType,fileName);
        }else {
            System.out.println("invalid audioType");
        }

    }
}
