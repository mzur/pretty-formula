#!/bin/bash

java -jar antlr-4.4-complete.jar $1.g4
javac -cp antlr-4.4-complete.jar $1*.java
java -cp antlr-runtime-4.4.jar:./ org.antlr.v4.runtime.misc.TestRig $1 expr -gui grammar-test.txt