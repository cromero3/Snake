package com.example.snake;

public interface GameInterface {
    void newGame();
    void run();
    boolean updateRequired();
    void update();
    void draw();
    void pause();
    void resume();


}
