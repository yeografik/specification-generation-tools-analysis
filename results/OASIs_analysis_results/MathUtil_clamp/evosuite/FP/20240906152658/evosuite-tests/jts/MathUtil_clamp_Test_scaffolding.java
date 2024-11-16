/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Sep 06 18:27:31 GMT 2024
 */

package jts;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class MathUtil_clamp_Test_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "jts.MathUtil"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("os.name", "Linux"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.home", "/home/investigador"); 
    java.lang.System.setProperty("java.home", "/usr/lib/jvm/java-8-openjdk-amd64/jre"); 
    java.lang.System.setProperty("user.dir", "/home/investigador/gonzalez/OASIs/output/FP/MathUtil/20240906152658"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("line.separator", "\n"); 
    java.lang.System.setProperty("java.specification.version", "1.8"); 
    java.lang.System.setProperty("awt.toolkit", "sun.awt.X11.XToolkit"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.separator", "/"); 
    java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.X11GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.print.PSPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "/tmp/EvoSuite_pathingJar1828823035722620157.jar"); 
    java.lang.System.setProperty("java.class.version", "52.0"); 
    java.lang.System.setProperty("java.endorsed.dirs", "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/endorsed"); 
    java.lang.System.setProperty("java.ext.dirs", "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext:/usr/java/packages/lib/ext"); 
    java.lang.System.setProperty("java.library.path", "lib"); 
    java.lang.System.setProperty("java.runtime.name", "OpenJDK Runtime Environment"); 
    java.lang.System.setProperty("java.runtime.version", "1.8.0_312-8u312-b07-0ubuntu1~18.04-b07"); 
    java.lang.System.setProperty("java.specification.name", "Java Platform API Specification"); 
    java.lang.System.setProperty("java.specification.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vendor", "Private Build"); 
    java.lang.System.setProperty("java.vendor.url", "http://java.oracle.com/"); 
    java.lang.System.setProperty("java.version", "1.8.0_312"); 
    java.lang.System.setProperty("java.vm.info", "mixed mode"); 
    java.lang.System.setProperty("java.vm.name", "OpenJDK 64-Bit Server VM"); 
    java.lang.System.setProperty("java.vm.specification.name", "Java Virtual Machine Specification"); 
    java.lang.System.setProperty("java.vm.specification.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vm.specification.version", "1.8"); 
    java.lang.System.setProperty("java.vm.vendor", "Private Build"); 
    java.lang.System.setProperty("java.vm.version", "25.312-b07"); 
    java.lang.System.setProperty("os.arch", "amd64"); 
    java.lang.System.setProperty("os.version", "5.4.0-150-generic"); 
    java.lang.System.setProperty("path.separator", ":"); 
    java.lang.System.setProperty("user.country", "AR"); 
    java.lang.System.setProperty("user.language", "es"); 
    java.lang.System.setProperty("user.name", "investigador"); 
    java.lang.System.setProperty("user.timezone", "America/Argentina/Cordoba"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MathUtil_clamp_Test_scaffolding.class.getClassLoader() ,
      "jts.MathUtil"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MathUtil_clamp_Test_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "jts.MathUtil"
    );
  }
}
