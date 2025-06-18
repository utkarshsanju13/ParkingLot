package controller;

import service.InitService;

public class InitController {

    private InitService initService;

    public InitController(InitService initService) {
        this.initService = initService;
    }

    public void init() {
        initService.init();
    }
}
