package reservation.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.getConnection;

import java.sql.Connection;

import reservation.dao.reservationDao;
import reservation.vo.Hospital;
import reservation.vo.Members;
import reservation.vo.Reservation;

public class reservationService {
	private reservationDao rdao = new reservationDao();
	
	public Hospital selectOneHp(String reg_bus_no) {
		Connection conn = getConnection();
		Hospital hp = rdao.selectOneHp(conn, reg_bus_no);
		close(conn);
		return hp;
	}
	
	public Members selectOneMember(String user_id) {
		Connection conn = getConnection();
		Members mb = rdao.selectOneMember(conn, user_id);
		close(conn);
		return mb;
	}
	
	public int insertReservation(Reservation res) {
		Connection conn = getConnection();
		System.out.println("------------------서비스----------------------");
		System.out.println("서비스 날짜 : "+res.getRev_date());
		int result = rdao.insertReservation(conn, res);
		close(conn);
		return result;
	}
	
}
