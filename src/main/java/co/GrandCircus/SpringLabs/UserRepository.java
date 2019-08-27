package co.GrandCircus.SpringLabs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Items> listItems() {

		return jdbcTemplate.query("select * from items", new BeanPropertyRowMapper<Items>(Items.class));

	}
	
	public int addToDB(String firstName, String lastName, String eMail, String passWord, String phoneNum) {
		String addQuery = "insert into users( `First Name`, `Last Name`, `Email`, `Password`, `Phone Number`) values (?,?,?,?,?)" ;
		return jdbcTemplate.update(addQuery, firstName, lastName, eMail, passWord, phoneNum);
		
	}

}
