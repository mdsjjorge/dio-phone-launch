package dio.challenge.controller;

import dio.challenge.service.PhoneService;

public class PhoneController {

    private PhoneService phoneService;

    public void setPhoneService(PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    public String call(String phoneNumber){
        return phoneService.call(phoneNumber);
    }

    public String answerCall (Boolean yesNo) {
        return phoneService.answerCall(yesNo);
    }

    public String startVoicemail (Boolean yesNo) {
        return phoneService.startVoicemail(yesNo);
    }

}
