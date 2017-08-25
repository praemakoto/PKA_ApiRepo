package com.pka.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FlightyDAO {

	public Double getPriceByFlight(String flight) throws Exception {
		String sql = "select PRICE from T_FLIGHTLIST where NO_FLIGHT = '" + flight + "'";

		Connection conn = null;

		try {
			conn = ConnectionUtils.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			Double price = new Double(0);
			if (rs.next()) {
				price = rs.getDouble("PRICE");
			}
			rs.close();
			ps.close();

			return price;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}
	
}
