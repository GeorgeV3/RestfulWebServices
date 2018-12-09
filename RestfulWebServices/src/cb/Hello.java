package cb;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;



@Path("/hello")
public class Hello {
	
	@GET 
	@Path ("/xml")
	@Produces(MediaType.TEXT_XML)
	public String sayHelloXML() {
		String resource = "<?xml version='1.0' ?>"+
						"<hello>Hello user! This is Hello from XML</hello>";
		return resource;
	}
	
	@GET 
	@Path ("/html")
	@Produces(MediaType.TEXT_HTML)
	
	public String sayHelloHTML(@QueryParam("name") String name) {
		String resource = "<html><body>"+
						"<p>Hello" + name + "! This is hello from HTML</p></body></html>";
		return resource;
	}

}
