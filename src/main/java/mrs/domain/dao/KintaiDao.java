package mrs.domain.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import mrs.domain.model.Kintai;

@ConfigAutowireable
@Dao
public interface KintaiDao {

	@Select
	public Kintai selectKintai(String userId, int taishoYm);
	
	@Select
	public List<Kintai> selectKintaiList(String userId);
	
	
}