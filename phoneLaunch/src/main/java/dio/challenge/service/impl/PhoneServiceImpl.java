package dio.challenge.service.impl;

import dio.challenge.service.PhoneService;

public class PhoneServiceImpl implements PhoneService {
    @Override
    public String call(String phoneNumber) {
        return "Calling the number: " + phoneNumber;
    }

    @Override
    public String answerCall(Boolean yesNo) {
        return yesNo ? "Call answered!" : "Call refused!";
    }

    @Override
    public String startVoicemail(Boolean yesNo) {
        return yesNo ? "Voicemail started!" : "Voicemail refused!";
    }
}
