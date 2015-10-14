/**
 * WinGame.java
 *
 * @author Scott Cao
 * @author Eric Chiu
 * @author Kevin Zhang
 * @version 2.00 2014/5/28
 */

package com.webs.game2048;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

class WinGame extends JPanel {

	private JButton playAgain = new JButton("Try Again");
	private JButton homePage = new JButton("Back to Home");
	private Image img = new ImageIcon("YOU WIN.jpg").getImage();

	private JPanel p1 = new JPanel() {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, null);
		}
	};
	private JPanel p2 = new JPanel();

	public WinGame() {
		setLayout(new BorderLayout());
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);

		playAgain.setFont(new Font("Arial", Font.PLAIN, 20));
		homePage.setFont(new Font("Arial", Font.PLAIN, 20));
		playAgain.setPreferredSize(new Dimension(170, (int) playAgain
				.getPreferredSize().getHeight()));
		homePage.setPreferredSize(new Dimension(170, (int) homePage
				.getPreferredSize().getHeight()));

		p2.add(playAgain);
		p2.add(homePage);

		playAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyGame.game.showGameBoard(MyGame.game.gameMode);
			}

		});

		homePage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					MyGame.game.showController(MyGame.HOMEPAGE);
				} catch (Exception ex) {
					System.out.println("ERROR");
				}
			}

		});
	}
}
