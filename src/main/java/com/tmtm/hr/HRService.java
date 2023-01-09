package com.tmtm.hr;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HRService {
	
	@Autowired HRDAO hrdao;
	Logger logger = LoggerFactory.getLogger(getClass());
	
	
	public ArrayList<HRDTO> hrlist() {
		logger.info("직원 목록 리스트 서비스");
		return hrdao.hrlist();
	}
	

}