package com.onlinetutorialspoint.processor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;

import com.onlinetutorialspoint.model.EmployeeDTO;
public class EmployeeDTOMapper implements RowMapper<List<EmployeeDTO>> {
	Map<Long, EmployeeDTO> datamap = new HashMap<Long, EmployeeDTO>();

	@Override
	public List<EmployeeDTO> mapRow(ResultSet rs, int arg1) throws SQLException {
		List<EmployeeDTO> resl = new ArrayList<EmployeeDTO>();
			String id = rs.getString(1);
			if (id != null) {
				EmployeeDTO data = new EmployeeDTO( rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6),
						rs.getString(7), rs.getString(8));
				resl.add(data);
			}
		return resl;
	}
};