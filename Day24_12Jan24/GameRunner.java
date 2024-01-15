package com.gameRunner.demo;

public class GameRunner {

	//MarioGame marioGame;
	//SuperContra game;
	
	GameRunnerInterface game;
	public GameRunner(GameRunnerInterface game) {
		//this.marioGame = marioGame;
		this.game = game;

	}

	public void run() {

         System.out.println("i am playing" + this.game);
        game.up();
         game.down();
         game.left();
         game.right();
         
		
	}
	

}