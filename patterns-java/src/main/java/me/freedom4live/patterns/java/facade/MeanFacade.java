package me.freedom4live.patterns.java.facade;

public class MeanFacade {

    private final CarService carService;
    private final PlaneService planeService;


    public MeanFacade(CarService carService, PlaneService planeService) {
        this.carService = carService;
        this.planeService = planeService;
    }

    public void drive() {
        carService.drive();
    }

    public void assemble() {
        carService.assemble();
    }

    public void flight() {
        planeService.flight();
    }

}
