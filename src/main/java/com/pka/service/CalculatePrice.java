package com.pka.service;

import com.pka.dao.FlightyDAO;

public class CalculatePrice {

	public Double calucationTotalPriceByFlight(String flightNo) throws Exception {
		FlightyDAO flightyDAO = new FlightyDAO();
		Double price = flightyDAO.getPriceByFlight(flightNo);
		return calucationTotalPrice(price);
		
	}
	
	public Double calucationTotalPrice(Double price) {
		return (price + 100) * 1.07;
	}
}
