//import org.jboss.arquillian.container.test.api.Deployment;
//import org.jboss.arquillian.junit.Arquillian;
//import org.jboss.arquillian.junit.container.JUnitTestRunner;
import org.jboss.arquillian.junit.container.JUnitTestRunner;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
//import org.junit.
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.Runner;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.assertEquals;


/**
 * Created by Junwei on 7/20/2017.
 */
//@RunWith(Runner.class)
public class MathUtilityTest {
    @Test
    public void isPrime() throws Exception {
        assertEquals(true, MathUtility.isPrime(97));
        assertEquals(true, MathUtility.isPrime(31));
        assertEquals(false, MathUtility.isPrime(99));
    }

//    @Deployment
//    public static JavaArchive createDeployment() {
//        return ShrinkWrap.create(JavaArchive.class)
//                .addClass(MathUtility.class)
//                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
//    }
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MathUtilityTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
