package com.sist.user;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import com.sist.dao.EmpVO;
import com.sist.dao.GoodsDAO;


public class BoardInsertPanel extends JPanel implements ActionListener{
	JLabel titleLa, nameLa, subLa, contLa, pwdLa;
	JTextField nameTf, subTf;
	JTextArea contTa;
	JButton b1, b2;
	ControlPanel cp;
	JComboBox<String> cb;
	GoodsDAO dao;
	public BoardInsertPanel(ControlPanel cp) {
		this.cp = cp;
		dao = GoodsDAO.newInstance();
		titleLa = new JLabel("글쓰기", JLabel.CENTER);
		titleLa.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		titleLa.setBounds(120, 15, 620, 50);
		add(titleLa);
		
		cb = new JComboBox<String>();
		
		
		
		subLa = new JLabel("제목", JLabel.CENTER);
		subTf = new JTextField();
		subLa.setBounds(120, 105, 80, 30);
		subTf.setBounds(205, 105, 450, 30);
		add(subLa); add(subTf);
		
		contLa = new JLabel("내용", JLabel.CENTER);
		contTa = new JTextArea();
		JScrollPane js = new JScrollPane(contTa);
		contLa.setBounds(120, 140, 80, 30);
		js.setBounds(205, 140, 450, 250);
		add(contLa); add(js);

		pwdLa = new JLabel("비밀번호", JLabel.CENTER);
		pwdLa.setBounds(120, 395, 80, 30);
		
		b1 = new JButton("확인");
		b2 = new JButton("취소");
		
		JPanel p = new JPanel();
		p.add(b1); p.add(b2);
		p.setBounds(120, 435, 620, 35);
		add(p);
		
		setLayout(null);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			String name = nameTf.getText();
			if(name.length() < 1) {
				nameTf.requestFocus();
				JOptionPane.showMessageDialog(this, "이름을 입력하세요");
				return;
			}
			String sub = subTf.getText();
			if(name.length() < 1) {
				subTf.requestFocus();
				JOptionPane.showMessageDialog(this, "제목을 입력하세요");
				return;
			}
			String content = contTa.getText();
			if(content.length() < 1) {
				subTf.requestFocus();
				JOptionPane.showMessageDialog(this, "내용을 입력하세요");
				return;
			}
		}
		else if(e.getSource() == b2) {
			cp.card.show(cp, "LIST");
		}
	}
	public void setCb(String id) {
		ArrayList<String> temp = dao.buyGoodsName(id);
		String[] list = temp.toArray(new String[temp.size()]);
		cb = new JComboBox<String>(list);
		cb.setBounds(365, 70, 500, 30);
		add(cb);
	}
}
