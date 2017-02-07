package ConnectionMySQL;
import Class.Jockey;

public interface JockeyDao {
	
		Long createJokey(Jockey j);
		Long removeJokey(Long id);
}