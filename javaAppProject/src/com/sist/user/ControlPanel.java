package com.sist.user;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class ControlPanel extends JPanel{
	public GoodsDetailPanel dp;
	public HomePanel hp;
	public EmpListPanel ep;
	public BoardListPanel bp;
	public BoardInsertPanel bip;
	public CardLayout card = new CardLayout();
	public ControlPanel(){
		bip = new BoardInsertPanel(this);
		hp = new HomePanel(this);
		bp = new BoardListPanel(this);
		dp = new GoodsDetailPanel(this);
		ep = new EmpListPanel();
		setLayout(card);
		add("INSERT", bip);
		add("BOARD", bp);
		add("HOME", hp);
		add("DETAIL", dp);
		add("LIST", ep);
	}
	
}
