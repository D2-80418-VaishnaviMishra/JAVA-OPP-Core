package assign15_q1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CandidateDao implements AutoCloseable{
	private Connection con;
	private PreparedStatement save;
	private PreparedStatement deleteById;
	private PreparedStatement findById;
	private PreparedStatement findAll;
	private PreparedStatement findByParty;
	private PreparedStatement getPartywiseVotes;
	
	public CandidateDao() throws Exception{
		con = DBUtil.getConnection();
		
		String sql1 = "INSERT into candidates values(default,?,?,?)";
		this.save = con.prepareStatement(sql1);
		
		String sql2 = "DELETE from candidates WHERE id=?";
		this.deleteById = con.prepareStatement(sql2);

		String sql3 = "select * from candidates where id=?";
		this.findById = con.prepareStatement(sql3);
		
		String sql4 = "SELECT * from candidates";
		this.findAll = con.prepareStatement(sql4);
		
		String sql5 = "SELECT * FROM candidates WHERE party=?";
		this.findByParty = con.prepareStatement(sql5);
		
		String sql6 = "SELECT party,sum(votes) as total_votes from candidates group by party";
		this.getPartywiseVotes = con.prepareStatement(sql6);
		
	}
	
	@Override
	public void close() {
		try {
			if(con!=null) {
				deleteById.close();
				save.close();
				con.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int save(Candidate c) throws Exception{{
			save.setString(1, c.getName());
			save.setString(2,c.getParty());
			save.setInt(3, c.getVotes());
			int count = save.executeUpdate();
			return count;
		} 
	} 
	
	public int deleteById(int id) throws Exception{
		deleteById.setInt(1, id);
		int count = deleteById.executeUpdate();
		return count;
	}
			
	
	public Candidate findById(int id) throws Exception{
		String sql = "select * from candidates where id=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setInt(1, id);
			try(ResultSet rs = stmt.executeQuery()){
				if(rs.next()) {
					int idc = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(idc,name,party,votes);
					return c;
				} else {
					return null;
				}
			}
		}
	}
	
	public List<Candidate> findAll() throws Exception{
		List<Candidate> list = new ArrayList<Candidate>();
		String sql = "SELECT * from candidates";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			try(ResultSet rs = stmt.executeQuery()){
				while(rs.next()) {
					int idc = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(idc,name,party,votes);
					list.add(c);
				}
			}
		}
		return list;
	}
	
	public List<Candidate> findByParty(String party) throws Exception{
		List<Candidate> list = new ArrayList<Candidate>();
		String sql = "SELECT * FROM candidates WHERE party=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, party);
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			} // rs.close();
		} // stmt.close();
		return list;
	}
	
	public List<PartyVotes> getPartywiseVotes() throws Exception{
		List<PartyVotes> list = new ArrayList<PartyVotes>();
		String sql = "SELECT party,sum(votes) as total_votes from candidates group by party";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			try(ResultSet rs = stmt.executeQuery()){
				while(rs.next()) {
					String party = rs.getString("party");
					int tvotes = rs.getInt("total_votes");
					PartyVotes pv = new PartyVotes(party,tvotes);
					list.add(pv);
				}
			}
		}
		return list;
	}

	
	
	
}
