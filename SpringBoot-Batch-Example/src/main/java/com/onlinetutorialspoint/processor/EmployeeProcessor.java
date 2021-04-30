package com.onlinetutorialspoint.processor;

import com.onlinetutorialspoint.model.Employee;

import com.onlinetutorialspoint.model.EmployeeDTO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemProcessor;

public class EmployeeProcessor implements  ItemProcessor<EmployeeDTO, List<EmployeeDTO>> {

	@Override
	public List<EmployeeDTO> process(EmployeeDTO items) throws Exception {
		System.out.println("IAM HERE");
		// TODO Auto-generated method stub
		ArrayList<EmployeeDTO> arrayList = new ArrayList<EmployeeDTO> ();
				arrayList.add(items);
		return arrayList;
	}

//    @Override
//    public EmployeeDTO process(final Employee employee) throws Exception {
//        System.out.println("Transforming Employee(s) to EmployeeDTO(s)..");
//        final EmployeeDTO empployeeDto = new EmployeeDTO(employee.getFirstName(), employee.getLastName(),
//                employee.getCompanyName(), employee.getAddress(),employee.getCity(),employee.getCounty(),employee.getState()
//        ,employee.getZip());
//
//        return empployeeDto;
//    }

}
