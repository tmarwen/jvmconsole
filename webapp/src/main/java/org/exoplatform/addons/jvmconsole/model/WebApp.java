package org.exoplatform.addons.jvmconsole.model;

/**
 * Created by eXo Platform MEA on 12/09/14.
 *
 * @author <a href="mailto:mtrabelsi@exoplatform.com">Marwen Trabelsi</a>
 */
public class WebApp
{
  private final String name;
  private final String author;

  public WebApp(String name, String author)
  {
    this.name = name;
    this.author = author;
  }

  public String getName()
  {
    return name;
  }

  public String getAuthor()
  {
    return author;
  }
}
