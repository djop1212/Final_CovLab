package reservation.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.getConnection;

import java.sql.Connection;

import reservation.model.dao.reservationDao;
import reservation.model.vo.Hospital;
import reservation.model.vo.Members;
import reservation.model.vo.Reservation;
import reservation.model.vo.Vaccine;

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
		int result = rdao.insertReservation(conn, res);
		close(conn);
		return result;
	}
	
	public Vaccine selectOneVac(String serial_num) {
		Connection conn = getConnection();
		Vaccine vac = rdao.selectOneVac(conn, serial_num);
		close(conn);
		return vac;
	}
	
	
	public int checkReservation(String user_rn) {
		Connection conn = getConnection();
		int check = rdao.checkReservation(conn, user_rn);
		close(conn);
		return check;
	}
	
}
