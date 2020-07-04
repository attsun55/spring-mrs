package mrs.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mrs.domain.dao.KintaiDao;
import mrs.domain.model.Kintai;
import mrs.domain.service.KintaiService;

@Service
@Transactional
public class KintaiServiceImpl implements KintaiService {
	
	@Autowired
	KintaiDao kintaiRepository;
	
	public Kintai findKintai(String userId, int taishoYd){
		
		Kintai kintai = kintaiRepository.selectKintai(userId, taishoYd);
	
		return kintai;
		
	}

	public List<Kintai> findKintaiList(String userId){

		List<Kintai> kintaiList = kintaiRepository.selectKintaiList(userId);
		
		return kintaiList;
		
	}
	
}