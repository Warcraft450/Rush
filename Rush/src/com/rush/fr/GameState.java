package com.rush.fr;

public enum GameState {

	LOBBY(), GAME(), FINISH();
	
	private static GameState currentState;
	
	public static boolean isState(GameState state) {
		return currentState == state;
	}
	
	public static GameState setState(GameState state) {
		return currentState = state;
	}
	
	public static GameState getState() {
		return currentState;
	}
}