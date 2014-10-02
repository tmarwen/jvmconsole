package org.exoplatform.addons.jvmconsole.jmx;

import org.exoplatform.addons.jvmconsole.jmx.core.JVMProcessManager;
import org.exoplatform.services.rest.resource.ResourceContainer;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by eXo Platform MEA on 01/10/14.
 *
 * @author <a href="mailto:mtrabelsi@exoplatform.com">Marwen Trabelsi</a>
 */
@Path("/mbean-resolver")
public class RestMBeanResolver implements ResourceContainer
{
  @GET
  @Path("/jvms/list")
  @Produces(MediaType.APPLICATION_JSON)
  public Response listRunningJVMs()
  {
    return Response.ok(JVMProcessManager.listRunningJVMs()).build();
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  public Response getRegisteredBeans()
  {
    return Response.ok(null).build();
  }
}
