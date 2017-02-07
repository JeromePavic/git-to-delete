package ConnectionMySQL;
import Class.Jockey;

public interface JockeyDao {
	
		Long createJockey(Jockey j);
		Long removeJockey(Long id);
}