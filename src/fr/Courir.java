package fr;

public class Courir implements Jockey, Poney, Course {
	
	private int C_id;
	private int J_id;
	private int P_id;
	private int rank;
	
	
	public Courir() {
		super();
	}
	
	public int getC_id() {
		return C_id;
	}
	
	public void setC_id(int c_id) {
		C_id = c_id;
	}
	
	public int getJ_id() {
		return J_id;
	}
	
	public void setJ_id(int j_id) {
		J_id = j_id;
	}
	
	public int getP_id() {
		return P_id;
	}
	
	public void setP_id(int p_id) {
		P_id = p_id;
	}
	
	public int getRank() {
		return rank;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}
}
