package dio.challenge;

import dio.challenge.controller.MusicController;
import dio.challenge.controller.PhoneController;
import dio.challenge.service.MusicService;
import dio.challenge.service.PhoneService;
import dio.challenge.service.impl.MusicServiceImpl;
import dio.challenge.service.impl.PhoneServiceImpl;

public class Main {
    public static void main(String[] args) {

        MusicService musicService = new MusicServiceImpl();
        MusicController musicController = new MusicController();
        musicController.setMusicService(musicService);

        System.out.println(
                musicController.selectMusic(" calypso- chave perdida") + "\n" +
                musicController.play() + "\n" +
                musicController.pause()
        );

//        PhoneService phoneService = new PhoneServiceImpl();
//        PhoneController phoneController = new PhoneController();
//        phoneController.setPhoneService(phoneService);
//
//        System.out.println(
//                phoneController.call("(85) 98900-0000") + "\n" +
//                phoneController.answerCall(true) + "\n" +
//                phoneController.startVoicemail(false)
//        );
    }
}