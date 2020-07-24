package mrs.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mrs.domain.dao.KintaiDao;
import mrs.domain.model.KintaiDto;
import mrs.domain.model.SalaryDto;
import mrs.domain.service.KintaiService;

@Service
@Transactional
public class KintaiServiceImpl implements KintaiService {
	
	@Autowired
	KintaiDao kintaiDao;
	
	public KintaiDto findKintai(String userId, int taishoYd){
		
		KintaiDto kintaiDto = kintaiDao.selectKintai(userId, taishoYd);
	
		return kintaiDto;
		
	}

	public List<KintaiDto> findKintaiList(String userId){

		List<KintaiDto> kintaiList = kintaiDao.selectKintaiList(userId);
		
		return kintaiList;
		
	}
	
	public void addKintai(SalaryDto salaryDto) {
		
		kintaiDao.insertKintai(salaryDto);
	};

	
}