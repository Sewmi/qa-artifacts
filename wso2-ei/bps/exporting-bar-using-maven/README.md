Maven antrun plugin is used to 
* print a message to the console
* copy files from the source directory rename and paste it into a destination directory.
* creating a zip file given .bar extension.


```javascript
<plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-antrun-plugin</artifactId>
                <version>1.3</version>
                <executions>
                    <execution>
                        <id>create-bar</id>
                        <phase>package</phase>
                        <goals>
                            <goal>run</goal>
                        </goals>
                        <configuration>
                            <tasks>
                                <echo message="Creating WSO2 bar"/>
                                <copy todir="target/bar">
								    <fileset dir="src/main/resources/diagrams/"/>
								    <globmapper from="*.bpmn" to="*.bpmn20.xml"/>
							    </copy>
							    <zip destfile="target/${project.name}.bar">
                                    <fileset dir="target/bar">
                                        <include name="**/*.bpmn20.xml"/>
                                    </fileset>
                                </zip>
                            </tasks>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
```


### References
 https://maven.apache.org/plugins/maven-antrun-plugin/
 https://ant.apache.org/manual/Tasks/copy.html
 https://community.alfresco.com/thread/217488-create-and-deploy-par-using-maven-only
