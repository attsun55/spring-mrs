package mrs.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mrs.domain.dao.KyuyoDao;
import mrs.domain.dao.SalaryDao;
import mrs.domain.model.KyuyoDto;
import mrs.domain.model.SalaryDto;
import mrs.domain.service.KyuyoService;

@Service
@Transactional
public class KyuyoServiceImpl implements KyuyoService {
	
	@Autowired
	public KyuyoDao kyuyoDao;

	@Autowired
	public SalaryDao salaryDao;
	
	public KyuyoDto findKyuyo(String kyuyoId){
		
		KyuyoDto kyuyo = kyuyoDao.selectKyuyo(kyuyoId);
	
		return kyuyo;
		
	}

	public List<SalaryDto> findSalary(String userId, int taishoY){
		
		List<SalaryDto> salaryDtoList = salaryDao.selectSalary(userId, taishoY);
	
		return salaryDtoList;
		
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