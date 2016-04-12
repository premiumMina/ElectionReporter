package com.reporter.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.reporter.model.CandidateModel;

@Repository
public class CandidateDao {
	
	@Autowired
	private SqlMapClientTemplate sqlMapClientTemplate;
	
	private static final String NAME_SPACE ="candidate";
	
	public CandidateModel getName() {
		String name = "kimtaewan";
//		return (String) sqlMapClientTemplate.queryForObject(NAME_SPACE + ".selectByName", name);
		return (CandidateModel) sqlMapClientTemplate.queryForObject(NAME_SPACE + ".selectByName");
	}
}
