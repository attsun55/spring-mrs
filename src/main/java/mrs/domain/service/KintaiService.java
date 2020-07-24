package mrs.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mrs.domain.model.KintaiDto;
import mrs.domain.model.SalaryDto;

@Service
@Transactional
public interface KintaiService {
	
	public KintaiDto findKintai(String userId, int taishoYd);

	public List<KintaiDto> findKintaiList(String userId);
	
	public void addKintai(SalaryDto salaryDto);
	
}