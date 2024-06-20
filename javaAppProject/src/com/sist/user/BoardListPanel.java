package com.sist.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

import com.sist.dao.GoodsDAO;


public class BoardListPanel extends JPanel{
	JLabel titleLa, pageLa;
	JButton b1, b2, b3;
	JTable table;
	DefaultTableModel model;
	ControlPanel cp;
	TableColumn column;
	
	GoodsDAO dao;
	int curpage = 1;
	int totalpage = 0;
	
	public BoardListPanel(ControlPanel cp) {
		this.cp = cp;
		b1 = new JButton("새글");
		b2 = new JButton("이전");
		b3 = new JButton("다음");
		dao = GoodsDAO.newInstance();
		
		
		
		pageLa = new JLabel("0 page / 0 page", JLabel.CENTER);
		titleLa = new JLabel("게시판", JLabel.CENTER);
		titleLa.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		
		String[] col = {"번호", "제목", "이름", "작성일", "조회수"};
		String[][] row = new String[0][5];
		model = new DefaultTableModel(row, col) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);
		
		for(int i = 0 ; i < col.length ; i++) {
			column = table.getColumnModel().getColumn(i);
			if(i == 0)
				column.setPreferredWidth(50);
			if(i == 1)
				column.setPreferredWidth(250);
			if(i == 2)
				column.setPreferredWidth(100);
			if(i == 3)
				column.setPreferredWidth(150);
			if(i == 4)
				column.setPreferredWidth(50);
		}
		table.getTableHeader();
		table.setShowVerticalLines(false);
		table.setRowHeight(30);
		table.getTableHeader().setBackground(Color.pink);
		
		setLayout(null);
		titleLa.setBounds(120, 15, 620, 50);
		add(titleLa);
		
		b1.setBounds(120, 70, 100, 30);
		add(b1);
		
		js.setBounds(120, 110, 620, 330);
		add(js);
		
		JPanel p =new JPanel();
		p.add(b2);
		p.add(pageLa);
		p.add(b3);
		p.setBounds(120, 450, 600, 35);
		
		
		add(p);
		
	}
	
}
