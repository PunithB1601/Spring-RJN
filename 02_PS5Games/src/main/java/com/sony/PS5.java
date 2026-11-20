package com.sony;

public class PS5 {

	private Game game;
	
	public PS5() {
		System.out.println("[0]-Digital PS5 con");
	}
	
	public PS5(Game game) {
		this.game=game;
		System.out.println("Disc PS5 con");
	}
	
	public void setGame(Game game) {
		this.game=game;
		System.out.println("setter() called");
	}
	
	void playGames() {
		game.installGame();
		System.out.println(game.getClass().getName()+" Game started");
	}
}
