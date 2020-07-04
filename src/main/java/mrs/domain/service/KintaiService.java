package mrs.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mrs.domain.model.Kintai;

@Service
@Transactional
public interface KintaiService {
	
	public Kintai findKintai(String userId, int taishoYd);

	public List<Kintai> findKintaiList(String userId);
	
}