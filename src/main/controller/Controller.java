package main.controller;

import main.model.Model;

public interface Controller {

    void setup();

    void processInput();

    void update();

    void render();

    void start();

    void stop();

    Model getModel();
}
