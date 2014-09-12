package org.exoplatform.addons.jvmconsole.service;

import org.exoplatform.addons.jvmconsole.model.WebApp;

/**
 * Created by eXo Platform MEA on 12/09/14.
 *
 * @author <a href="mailto:mtrabelsi@exoplatform.com">Marwen Trabelsi</a>
 */
public class MockService
{

  public static String getApplicationName()
  {
    WebApp webApp = new WebApp("JVM Console", "Marwen");
    return new StringBuilder(webApp.getName())
        .append(" - By ")
        .append(webApp.getAuthor())
        .toString();
  }
}
