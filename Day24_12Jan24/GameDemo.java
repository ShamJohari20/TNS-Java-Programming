package com.gameRunner.demo;

public class GameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var marioGame = new MarioGame();
		var superContra = new SuperContra();
		
		//var gameRunner = new GameRunner(superContra);
		
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}