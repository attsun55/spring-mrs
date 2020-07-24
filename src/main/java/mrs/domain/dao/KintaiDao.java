package mrs.domain.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import mrs.domain.model.KintaiDto;
import mrs.domain.model.SalaryDto;

@ConfigAutowireable
@Dao
public interface KintaiDao {

	@Select
	public KintaiDto selectKintai(String userId, int taishoYm);
	
	@Select
	public List<KintaiDto> selectKintaiList(String userId);
	
	@Insert
	public int insertKintai(SalaryDto salaryDto);
	
}