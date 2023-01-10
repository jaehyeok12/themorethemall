package com.tmtm.sales;

import java.util.ArrayList;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesService {

	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired SalesDAO dao;
	
	public ArrayList<SalesDTO> getSec(String val) {
		
		return dao.getSec(val);
	}

	public ArrayList<HashMap<String, String>> getSecGraph(HashMap<String, String> params) {
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
		String date = params.get("time");
		logger.info(date);
		
		return dao.getSecGraph(params);
	}

	public ArrayList<SalesDTO> getStore(String val) {
		ArrayList<SalesDTO> listSec = dao.getSec(val);
		ArrayList<SalesDTO> listStore = new ArrayList<SalesDTO>();
		
		for(int i=0; i<listSec.size(); i++) {
			String secNum = listSec.get(i).getSection_num();
			listStore.add(dao.getStore(secNum));
		}
		logger.info(listStore.size()+"");
		
		return listStore;
	}

	public ArrayList<HashMap<String, String>> getStoreGraph(HashMap<String, String> params) {

		return dao.getStoreGraph(params);
	}

}
