package com.gadrawingz.javanashorn;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class NashornHelloWorld {
    public static void main(String[] args) throws Exception {

        // Creating Script engine
        ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("Nashorn");

        // Reading Nashorn file
        scriptEngine.eval(new FileReader("D:/JavaToolkit/JavaAgain2022/Java8Features/src/com/gadrawingz/javanashorn/hello.js"));
    }
}
