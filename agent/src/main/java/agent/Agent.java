
/**
 * 
 @author VaidehiJariwala
 */
package agent;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

public class Agent {


    public static void premain(String agentArgs, Instrumentation inst) {
        inst.addTransformer(new ClassTransformer());
    }
}

