package mrs.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mrs.domain.model.KyuyoDto;
import mrs.domain.model.SalaryDto;

@Service
@Transactional
public interface KyuyoService {
	
	public KyuyoDto findKyuyo(String kyuyoId);

	public List<SalaryDto> findSalary(String userId, int taishoY);
	
}