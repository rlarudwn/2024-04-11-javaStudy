package com.sist.user;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sist.client.ImageChange;
import com.sist.dao.*;

public class HomePanel extends JPanel implements ActionListener, MouseListener{
	JPanel pan = new JPanel();
	JButton b1, b2;
	JLabel la = new JLabel("0 page / 0 page");
	
	public JLabel[] imgs = new JLabel[12];
	
	int curpage = 1;	// 현재 페이지
	int totalpage = 0;	// 총 페이지
	
	GoodsDAO dao;
	ControlPanel cp;
	
	public HomePanel(ControlPanel cp) {
		this.cp = cp;
		dao = GoodsDAO.newInstance();
		pan.setLayout(new GridLayout(3, 4, 5, 5));
		
		setLayout(new BorderLayout());
		add("Center", pan);
		b1 = new JButton("이전");
		b2 = new JButton("다음");
		JPanel p = new JPanel();
		p.add(b1); p.add(la); p.add(b2);
		add("South", p);
		print();
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void print() {
		totalpage = dao.goodsTotalPage();
		ArrayList<GoodsVO> list = dao.goodsListData(curpage);
		for(int i = 0 ; i < list.size() ; i++) {
			GoodsVO vo = list.get(i);
			try {
				URL url = new URL(vo.getGoods_poster());
				Image img = ImageChange.getImage(new ImageIcon(url), 240, 200);
				imgs[i] = new JLabel(new ImageIcon(img));
				imgs[i].setToolTipText(vo.getGoods_name() + "^" + vo.getNo());
				pan.add(imgs[i]);
				imgs[i].addMouseListener(this);
			} catch (Exception e) {}
		}
		la.setText(curpage+" page / " + totalpage + " page");
	}
	public void init() {
		for(int i = 0 ; i < imgs.length ; i++) {
			imgs[i] = new JLabel("");
		}
		pan.removeAll();
		pan.validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			if(curpage > 1) {
				curpage -= 1;
				init();
				print();
			}
		}
		else if(e.getSource() == b2) {
			if(curpage < totalpage) {
				curpage += 1;
				init();
				print();
			}
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		for(int i = 0 ; i < imgs.length ; i++) {
			if(e.getSource() == imgs[i]) {
				if(e.getClickCount() == 1) {
					String no = imgs[i].getToolTipText();
					no = no.substring(no.lastIndexOf("^") + 1);
					System.out.println(no);
					cp.dp.print(Integer.parseInt(no));
					cp.card.show(cp, "DETAIL");
				}
			}
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		for(int i = 0 ;i < imgs.length ; i++) {
			if(e.getSource() == imgs[i]) {
				imgs[i].setBorder(null);
			}
		}
	}
}
