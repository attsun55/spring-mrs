package mrs.domain.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import mrs.domain.model.KyuyoDto;

@ConfigAutowireable
@Dao
public interface KyuyoDao {

	@Select
	public KyuyoDto selectKyuyo(String kyuyoId);
	
//	@Select
//	public List<Kintai> selectKintaiList(String userId);
//	
//	@Insert
//	public int insertKintai(SalaryDto salaryDto);
	
}