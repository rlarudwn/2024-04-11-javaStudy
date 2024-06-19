package com.sist.user;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class ControlPanel extends JPanel{
	public GoodsDetailPanel dp;
	public HomePanel hp;
	EmpListPanel ep;
	public CardLayout card = new CardLayout();
	public ControlPanel(){
		hp = new HomePanel(this);
		dp = new GoodsDetailPanel(this);
		ep = new EmpListPanel();
		setLayout(card);
		add("HOME", hp);
		add("DETAIL", dp);
		add("LIST", ep);
	}
	
}
