package com.cg.demojpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.demojpa.dto.Department;
import com.cg.demojpa.dto.Employee;
import com.cg.demojpa.dto.Project;

public class EmployeeDaoImpl implements EmployeeDao{

	EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("demojpa");
	
	
	public Employee save(Employee emp) {
		// TODO Auto-generated method stub
		EntityManager em = entityFactory.createEntityManager();
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		//em.persist(emp.getProject());
		Project project = em.find(Project.class, emp.getProject().getProjectId());
		Department dept = em.find(Department.class, emp.getDept().getDeptId());
		if(project != null && dept != null) {
			emp.setDept(dept);
			emp.setProject(project);
			em.persist(emp);
		}
		else {
			em.persist(emp);
		}
//		em.persist(emp);
		//em.find(Employee.class, emp.getEmpId());
		//em.flush();
		tran.commit();
		return null;
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		EntityManager em = entityFactory.createEntityManager();
		Query query = em.createQuery("FROM Employee");
		List<Employee> empList = query.getResultList();
		return empList;
	}

	public void remove(Integer empId) {
		// TODO Auto-generated method stub
		EntityManager em = entityFactory.createEntityManager();
		Employee empRemove = em.find(Employee.class, empId);
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		em.remove(empRemove);
		tran.commit();
	}

	public Employee searchEmployee(Integer empId) {
		// TODO Auto-generated method stub
		EntityManager em = entityFactory.createEntityManager();
		Employee searchEmployee = em.find(Employee.class, empId);
		return searchEmployee;
	}

	public List<Employee> findBetweenSalary(double min, double max) {
		// TODO Auto-generated method stub
		EntityManager em = entityFactory.createEntityManager();
		Query query = em.createQuery("FROM Employee WHERE empSalary BETWEEN :first and :second");
		query.setParameter("first", min);
		query.setParameter("second", max);
		List<Employee> empList = query.getResultList();
		return empList;
	}

}
