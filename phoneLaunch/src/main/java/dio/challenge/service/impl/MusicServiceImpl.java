package dio.challenge.service.impl;

import dio.challenge.service.MusicService;

public class MusicServiceImpl implements MusicService {
    @Override
    public String selectMusic(String music) {
        return "Music " + music + " selected!";
    }

    @Override
    public String play() {
        return "Music played!";
    }

    @Override
    public String pause() {
        return "Music paused!";
    }
}
