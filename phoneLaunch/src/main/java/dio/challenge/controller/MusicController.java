package dio.challenge.controller;

import dio.challenge.service.MusicService;

public class MusicController {

    private MusicService musicService;

    public void setMusicService(MusicService musicService){
        this.musicService = musicService;
    }

    public String selectMusic(String music){
        return musicService.selectMusic(music);
    }

    public String play(){
        return musicService.play();
    }

    public String pause(){
        return musicService.pause();
    }
}
