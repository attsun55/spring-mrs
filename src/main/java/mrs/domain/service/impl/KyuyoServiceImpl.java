package mrs.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mrs.domain.dao.KyuyoDao;
import mrs.domain.model.KyuyoDto;
import mrs.domain.service.KyuyoService;

@Service
@Transactional
public class KyuyoServiceImpl implements KyuyoService {
	
	@Autowired
	public KyuyoDao kyuyoDao;
	
	public KyuyoDto findKyuyo(String kyuyoId){
		
		KyuyoDto kyuyo = kyuyoDao.selectKyuyo(kyuyoId);
	
		return kyuyo;
		
	}

//	public List<Kintai> findKintaiList(String userId){
//
//		List<Kintai> kintaiList = kintaiRepository.selectKintaiList(userId);
//		
//		return kintaiList;
//		
//	}
//	
//	public void addKintai(SalaryDto salaryDto) {
//		
//		kintaiRepository.insertKintai(salaryDto);
//		
//		
//	};

	
}