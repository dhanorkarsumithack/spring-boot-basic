package com.sumit.generator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.hibernate.HibernateException;
import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;


//used to custom id generator
public class OrderIdGenerator implements IdentifierGenerator {

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix ="OD";
		String suffix="";
		
		try {
		     JdbcConnectionAccess conAccess=session.getJdbcConnectionAccess();
		     Connection con=conAccess.obtainConnection();
		     
		     PreparedStatement ps = con.prepareStatement("SELECT nextval('order_id_seq')");
	         ResultSet rs = ps.executeQuery();
	         if (rs.next()) {
	              suffix = String.format("%03d", rs.getInt(1));
	         }
		     
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return prefix+suffix;
	}

}
