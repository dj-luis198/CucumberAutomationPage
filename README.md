# CucumberAutomationPage

## Automatizacion con Selenium Cucumber y java.

------------------------------------------------

[![Java CI with Maven](https://github.com/dj-luis198/CucumberAutomationPage/actions/workflows/maven.yml/badge.svg)](https://github.com/dj-luis198/CucumberAutomationPage/actions/workflows/maven.yml)

Pagina de prueba: http://automationpractice.com/index.php

Reporte en: https://dj-luis198.github.io/CucumberAutomationPage/overview-features.html

-----------------------------------------------------
#### Configuracion pom del reporte:

----------------------------------------------------
```
<plugins>
        <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.19.1</version>
                <configuration>
                    <testFailureIgnore>true</testFailureIgnore>
                </configuration>
            </plugin>
            <plugin>
                <groupId>net.masterthought</groupId>
                <artifactId>maven-cucumber-reporting</artifactId>
                <version>3.20.0</version>
                <executions>
                    <execution>
                        <id>execution</id>
                        <phase>verify</phase>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                        <configuration>
                            <projectName>CucumberAutomationPage</projectName>
                            <!-- output directory for the generated report -->
                            <outputDirectory>${project.build.directory}</outputDirectory>
                            <!-- optional, defaults to outputDirectory if not specified -->
                            <inputDirectory>${project.build.directory}/</inputDirectory>
                            <jsonFiles>
                                <!-- supports wildcard or name pattern -->
                                <param>**/*.json</param>
                            </jsonFiles>
                            <!-- optional, defaults to outputDirectory if not specified -->
                            <classificationDirectory>${project.build.directory}/</classificationDirectory>
                            <classificationFiles>
                                <!-- supports wildcard or name pattern -->
                                <param>sample.properties</param>
                                <param>other.properties</param>
                            </classificationFiles>
                            <parallelTesting>false</parallelTesting>
                            <checkBuildResult>false</checkBuildResult>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
    </plugins>
```


#### Codificación maven establecida para quitar error de dependencia:

-----------------------------------------------------
```
<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
```

-------------------------------------------------------
#### Dependencia Driver manager:

------------------------------------------------------
```
      <dependency>
          <groupId>io.github.bonigarcia</groupId>
          <artifactId>webdrivermanager</artifactId>
          <version>5.1.1</version>
          <scope>test</scope>
      </dependency>
```