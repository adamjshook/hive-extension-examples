package com.adamjshook.example;

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;

@Description(name = "BasicUDF", value = "returns 'hello x', where x is whatever you give it (STRING)", extended = "SELECT simpleudfexample('world') from foo limit 1;")
class BasicUDF extends UDF {

    public String evaluate(int i, double d, String str) {
        return "Hello " + str.toString() + (i * d);
    }
}