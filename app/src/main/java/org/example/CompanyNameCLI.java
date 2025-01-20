package com.example;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "SaaSquatchCLI", mixinStandardHelpOptions = true, version = "1.0",
        description = "Prints the name of the company 'SaaSquatch'.")
public class CompanyNameCLI implements Runnable {

    @Override
    public void run() {
        System.out.println("Welcome to SaaSquatch!");
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new CompanyNameCLI()).execute(args);
        System.exit(exitCode);
    }
}
