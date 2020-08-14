package com.admin.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.admin.exception.BusinessException;
import com.admin.model.Student;
import com.admin.service.StudentService;
import com.admin.service.Impl.StudentServiceImpl;

@Path("/Student")
public class StudentController {

	private StudentService service = new StudentServiceImpl();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Student createStudent(Student student) {

		return service.createStudent(student);
	}

	@GET
	@Path("/{studentId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getStudentById(@PathParam("studentId") int studentId) {

		try {
			return Response.ok(service.getStudentById(studentId), MediaType.APPLICATION_JSON).build();
		} catch (BusinessException e) {
			return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAllStudents() {

		return service.getAllStudents();
	}

	

	@PATCH
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Student updateStudent(Student student) {
		return service.updateStudent(student);
	}
	
	
	@DELETE
	@Path("/{studentId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void removeStudent(@PathParam("studentId") int studentId) {

		service.removeStudent(studentId);

	}

}
