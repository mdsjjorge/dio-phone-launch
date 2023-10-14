package dio.challenge;

import dio.challenge.controller.PhoneController;
import dio.challenge.service.PhoneService;
import dio.challenge.service.impl.PhoneServiceImpl;

public class Main {
    public static void main(String[] args) {

        PhoneService phoneService = new PhoneServiceImpl();
        PhoneController phoneController = new PhoneController();
        phoneController.setPhoneService(phoneService);

        System.out.println(
                phoneController.call("(85) 98900-0000") + "\n" +
                phoneController.answerCall(true) + "\n" +
                phoneController.startVoicemail(false)
        );
    }
}