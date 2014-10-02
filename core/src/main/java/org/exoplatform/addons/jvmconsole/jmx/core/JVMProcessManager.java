package org.exoplatform.addons.jvmconsole.jmx.core;

import org.cyclopsgroup.jmxterm.JavaProcess;
import org.cyclopsgroup.jmxterm.JavaProcessManager;
import org.cyclopsgroup.jmxterm.jdk6.Jdk6JavaProcessManager;
import org.cyclopsgroup.jmxterm.pm.JConsoleClassLoaderFactory;

import java.util.Collections;
import java.util.List;

/**
 * Created by eXo Platform MEA on 02/10/14.
 *
 * @author <a href="mailto:mtrabelsi@exoplatform.com">Marwen Trabelsi</a>
 */
public class JVMProcessManager
{
  public static List<JavaProcess> listRunningJVMs()
  {
    List<JavaProcess> runningJavaProcesses = Collections.emptyList();
    try
    {
      /* Get the an URLClassLoader referring to tools.jar and jconsole.jar */
      ClassLoader classLoader = JConsoleClassLoaderFactory.getClassLoader();
      JavaProcessManager processManager = new Jdk6JavaProcessManager(classLoader);

      runningJavaProcesses = processManager.list();

    } catch (NoSuchMethodException e)
    {
      e.printStackTrace();
    } catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }

    return runningJavaProcesses;
  }
}
