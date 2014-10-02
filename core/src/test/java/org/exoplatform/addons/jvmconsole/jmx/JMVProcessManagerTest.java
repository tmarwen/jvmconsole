package org.exoplatform.addons.jvmconsole.jmx;

import org.cyclopsgroup.jmxterm.JavaProcess;
import org.exoplatform.addons.jvmconsole.jmx.core.JVMProcessManager;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;

/**
 * Created by eXo Platform MEA on 02/10/14.
 *
 * @author <a href="mailto:mtrabelsi@exoplatform.com">Marwen Trabelsi</a>
 */
public class JMVProcessManagerTest
{
  @Test
  public void testListRunningJavaProcesses()
  {
    List<JavaProcess> runningJavaProcesses = JVMProcessManager.listRunningJVMs();

    assertFalse(runningJavaProcesses.isEmpty());
    /*
    // Should be only used when running test case from an IDE
    JavaProcess currentTest = new JavaProcess()
    {
      @Override
      public String getDisplayName()
      {
        *//* Return the current running test class name as a process name *//*
        return JMVProcessManagerTest.class.getName();
      }

      @Override
      public int getProcessId()
      {
        return 0;
      }

      @Override
      public boolean isManageable()
      {
        return false;
      }

      @Override
      public void startManagementAgent() throws IOException
      {

      }

      @Override
      public String toUrl()
      {
        return null;
      }
    };

    boolean isTestRunning = false;

    for (JavaProcess process : runningJavaProcesses)
    {
      if (process.getDisplayName().contains(currentTest.getDisplayName()))
      {
        isTestRunning = true;
        break;
      }
    }

    Assert.assertTrue(isTestRunning);
    */

  }
}
