package dio.challenge.service;

public interface PhoneService {

    public String call (String phoneNumber);

    public String answerCall (Boolean yesNo);

    public String startVoicemail (Boolean yesNo);

}
