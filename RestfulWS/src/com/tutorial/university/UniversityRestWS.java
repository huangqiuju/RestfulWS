package com.tutorial.university;

import java.io.File;
import java.net.URL;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/university")
public class UniversityRestWS {
	
	/*
	//HTML response, no parameter http://localhost:8080/RestfulWS/rest/university
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getHTMLUniversityInfo()
	{
		return "<html>" + 
				"<title>" + "university information" +"</title>" +
				"<body><h1>" + "Starford University"+ "</body></h1>"+
				"</html>";
	}
	
	
	//no parameter, text response  http://localhost:8080/RestfulWS/rest/university
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTextUniversityInfo()
	{
		return "Stanford University";
	}
		
	//path parameters  http://localhost:8080/RestfulWS/rest/university/23/50
	@GET
	@Path("{firstNo}/{secondNo}")
	public String getTextUniversityInfo(@PathParam("firstNo") String first, @PathParam("secondNo") String second)
	{
		return "@PathParam First No="+first+" Second No="+second;
		
	}
		
	//Query parameters:  http://localhost:8080/RestfulWS/rest/university?firstNo=2&secondNo=10
	 * @GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTextUniversityInfo(@QueryParam("firstNo") String first, @QueryParam("secondNo") String second)
	{
		return "@QueryParam First No="+first+" Second No="+second;
		
	}
	
	//matrix parameter:  http://localhost:8080/RestfulWS/rest/university;firstNo=2;secondNo=10
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTextUniversityInfo(@MatrixParam("firstNo") String first, @MatrixParam("secondNo") String second)
	{
		return "@MatrixParam First No="+first+" Second No="+second;
		
	}	

	
	//form parameter:  http://localhost:8080/RestfulWS/rest/university;firstNo=2;secondNo=10
	@POST
	@Path("/add")
	@Produces(MediaType.TEXT_PLAIN)
	public String addStudentInfo(@FormParam("student") String student, @FormParam("age") int age)
	{

		return "@FormParam Student="+student+" Age="+age;
		
	}
	
	
	

	@GET
	@Path("/get")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getStudentFile()
	{
		String output="I am ok;";
		Response resp=Response.status(200).entity(output).build();
				
		return resp;
	}
	
	*/
	
	@GET
	@Path("/get")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getStudentFile()
	{
		URL url = this.getClass().getResource("Dummy.txt");
		File file = new File(url.getPath());
		

//		ResponseBuilder responseBuilder=Response.ok(file);
//		Response response=responseBuilder.build();
		

		Response resp=Response.status(200).entity(file).build();
				
		return resp;
	}
	

	
	
	
	//------------------------------
	//path parameters  http://localhost:8080/RestfulWS/rest/university/23
	@PUT
	@Path("{studentRollNo}")
	@Produces(MediaType.TEXT_PLAIN)	
	public String updateUniversityInfo(@PathParam("studentRollNo") String studentRollNo)
	{
		return "update successful";
	}
}
