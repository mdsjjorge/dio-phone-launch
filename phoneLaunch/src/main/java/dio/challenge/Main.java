package dio.challenge;

import dio.challenge.controller.MusicController;
import dio.challenge.controller.PhoneController;
import dio.challenge.controller.WebController;
import dio.challenge.service.MusicService;
import dio.challenge.service.PhoneService;
import dio.challenge.service.WebService;
import dio.challenge.service.impl.MusicServiceImpl;
import dio.challenge.service.impl.PhoneServiceImpl;
import dio.challenge.service.impl.WebServiceImpl;

public class Main {
    public static void main(String[] args) {

        WebService webService = new WebServiceImpl();
        WebController webController = new WebController();
        webController.setWebService(webService);

        System.out.println(
                webController.updatePage(5) + "\n" +
                webController.addNewTab() + "\n" +
                webController.displayPage(6)
        );

//        MusicService musicService = new MusicServiceImpl();
//        MusicController musicController = new MusicController();
//        musicController.setMusicService(musicService);
//
//        System.out.println(
//                musicController.selectMusic("calypso- chave perdida") + "\n" +
//                musicController.play() + "\n" +
//                musicController.pause()
//        );

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
