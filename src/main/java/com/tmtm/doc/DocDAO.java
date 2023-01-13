package com.tmtm.doc;

import java.sql.Date;
import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DocDAO {

	ArrayList<DocDTO> sort();

	ArrayList<DocDTO> form(String docType);

	String formContent(String formNum);

	ArrayList<DocDTO> lineList();

	ArrayList<String> teamList();

	ArrayList<String> floorList();

	ArrayList<DocDTO> sectionList(String floor);

	ArrayList<DocDTO> storeList(String emp_num);

	ArrayList<Date> dateList(String storeName);

}
