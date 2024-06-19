package com.sist.client;

import com.sist.dao.GoodsDAO;
import com.sist.dao.MemberDAO;
import com.sist.user.ControlPanel;
import com.sist.user.LoginPanel;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class ClientMain extends JFrame implements ActionListener{
	LoginPanel login = new LoginPanel();
	CardLayout card = new CardLayout();
	ControlPanel cp = new ControlPanel();
	public ClientMain() {
		setLayout(card);
		setSize(1280, 720);
		setVisible(true);
		add("LOGIN", login);
		add("CONTROL", cp);
		
		login.btnClose.addActionListener(this);
		login.btnLogin.addActionListener(this);
		login.btnSignUp.addActionListener(this);
		cp.dp.b1.addActionListener(this);
		cp.dp.b2.addActionListener(this);
	}
	public static void main(String[] args) {
		new ClientMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == login.btnClose) {
			this.dispose();
			System.exit(0);
		}
		//아이디 입력 여부 확인
		else if(e.getSource() == login.btnLogin) {			
			MemberDAO dao = MemberDAO.newInstance();
			String id = login.tfId.getText().trim();
			if(id.length() < 1) {
				JOptionPane.showMessageDialog(login, "아이디를 입력하세요");
				login.tfId.requestFocus();
				return;
			}
			// 비밀번호 입력 여부 확인
			String pwd = String.valueOf(login.pfPwd.getPassword()).trim();
			if(pwd.length() < 1) {
				JOptionPane.showMessageDialog(login, "비밀번호를 입력하세요");
				login.pfPwd.requestFocus();
				return;
			} 
			// 아이디, 비밀번호로 DB 접근, 결과 확인
			// 아이디, 비밀번호 전부 맞은경우 => 해당 id에 admin을 result에 저장
			// 아이디 틀릴경우 NO ID
			// 비밀번호 틀릴경우 NO PWD
			String result = dao.memberLogin(id, pwd);
			// ID 틀린 경우
			if(result.equals("NO ID")) {
				JOptionPane.showMessageDialog(login, "아이디가 존재하지 않습니다");
				login.tfId.setText("");
				login.pfPwd.setText("");
				login.tfId.requestFocus();
				return;
			}
			// 비밀번호 틀린경우
			else if(result.equals("NO PWD")) {
				JOptionPane.showMessageDialog(login, "비밀번호가 틀렸습니다");
				login.pfPwd.setText("");
				login.pfPwd.requestFocus();
				return;
			}
			// 로그인 성공
			else {
				// rbNemp =  일반회원 라디오 버튼
				// 일반 회원 선택 후 로그인 한 경우 패널 이동
				if(login.rbNemp.isSelected()) {	
					// card.show(getComponents(), "SHOP");
				}
				// rbEmp =  사원 라디오 버튼
				// 사원 선택 후 로그인 한 경우 패널 이동
				else {	
					// result에 들어간 admin 값이 N인 경우	=> 권한 없음
					if(result.toUpperCase().equals("N")) {
						System.out.println("관리자권한 X");
					}
					// result에 들어간 admin 값이 Y인 경우	=> 권한 있음
					else if(result.toUpperCase().equals("Y")) {
						System.out.println("관리자권한 O");
						card.show(getContentPane(), "CONTROL");
					}
				}
			}
		}
		else if(e.getSource() == login.btnSignUp) {
			
		}
		else if(e.getSource() == cp.dp.b1) {
			int stack = (int)(cp.dp.box.getSelectedItem());
			String empno_temp = cp.dp.boxEmp.getSelectedItem().toString();
			int empno = Integer.parseInt((empno_temp.substring(0, empno_temp.indexOf("."))));
			String goods_id = cp.dp.laId.getText();
			MemberDAO mDao = MemberDAO.newInstance();
			GoodsDAO gDao = GoodsDAO.newInstance();
			System.out.println(login.tfId.getText());
			System.out.println(Integer.parseInt(goods_id));
			mDao.updatePerformance(empno, stack);
			gDao.ordersInsert(login.tfId.getText(), Integer.parseInt(goods_id));
			JOptionPane.showMessageDialog(this, "구매 완료");
			cp.card.show(cp, "HOME");
		}
		else if(e.getSource() == cp.dp.b2) {
			cp.card.show(cp, "HOME");
		}
	}

}
