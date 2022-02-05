package com.gadrawingz.javanashorn;
import javax.script.*;

public class NashornEmbedJSCode {
    public static void main(String[] args) throws Exception {

        // Creating Script engine
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");

        // Evaluating Nashorn code
        ee.eval("print('Hello Nashorn');");
    }
}
