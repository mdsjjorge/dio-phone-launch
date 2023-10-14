package dio.challenge.controller;

import dio.challenge.service.WebService;

public class WebController {

    private WebService webService;

    public void setWebService(WebService webService) {
        this.webService = webService;
    }

    public String displayPage(int key){
        return webService.displayPage(key);
    }

    public String addNewTab(){
        return webService.addNewTab();
    }

    public String updatePage(int key){
        return webService.updatePage(key);
    }

}
