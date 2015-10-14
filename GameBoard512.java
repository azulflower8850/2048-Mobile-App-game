/**
 * GameBoard512.java
 *
 * @author Scott Cao
 * @author Eric Chiu
 * @author Kevin Zhang
 * @version 2.00 2014/5/28
 */

package com.webs.game2048;

import java.util.ArrayList;

class GameBoard512 extends GameBoard {

	private Game512 panel;

	GameBoard512(int side, Game512 p) {
		super(side);
		panel = p;
	}
	
	@Override
	boolean checkWin() {
		for (ArrayList<Integer> list : getMatrix())
			for (int i : list)
				if (i == 512)
					return true;
		return false;
	}

	@Override
	void endGame() {
		try{
			panel.gameOver(this, true);
		} catch (Exception ex) {
			System.out.println("ERROR");
		}
	}

	@Override
	void winGame() {
		try{
			panel.gameOver(this, false);
		} catch (Exception ex) {
			System.out.println("ERROR");
		}
	}

}
