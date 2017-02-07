package ConnectionMySQL;

import Class.Poney;

public interface PoneyDao {

	Long createPoney(Poney P);
	Long removePoney(Long id);
	
}
