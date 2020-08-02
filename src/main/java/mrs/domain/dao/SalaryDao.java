package mrs.domain.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import mrs.domain.model.SalaryDto;

@ConfigAutowireable
@Dao
public interface SalaryDao {

	@Select
	public List<SalaryDto> selectSalary(String userId, int taishoY);
	
}