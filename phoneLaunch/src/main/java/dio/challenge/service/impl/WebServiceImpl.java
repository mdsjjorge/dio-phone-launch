package dio.challenge.service.impl;

import dio.challenge.service.WebService;

public class WebServiceImpl implements WebService {
    @Override
    public String displayPage(int key) {
        return "Showing page " + key;
    }

    @Override
    public String addNewTab() {
        return "New tab added!";
    }

    @Override
    public String updatePage(int key) {
        return "Page " + key + " updated!";
    }
}
