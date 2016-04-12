package com.reporter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reporter.dao.CandidateDao;
import com.reporter.model.CandidateModel;

@Service
public class CandidateService {
	
	@Autowired
	private CandidateDao candidateDao;

	public void setCandidateDao(CandidateDao candidateDao) {
		this.candidateDao = candidateDao;
	}
	
	public CandidateModel getCandidateName() {
		return candidateDao.getName();
	}
}
