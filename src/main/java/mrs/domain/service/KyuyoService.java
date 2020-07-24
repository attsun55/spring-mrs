package mrs.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mrs.domain.model.KyuyoDto;

@Service
@Transactional
public interface KyuyoService {
	
	public KyuyoDto findKyuyo(String kyuyoId);
	
}