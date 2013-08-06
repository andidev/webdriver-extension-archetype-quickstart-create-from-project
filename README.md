Maven Archetype Create From Projects
===================

A helper repository containing maven projects with the only purpose of creating maven archetype projects. A branch is used for every maven archetype project to create. The name of that branch should be the same as the artifact-id of the maven archetype to create.

### How to generate a project?

##### Checkout the maven project from the git
~~~ sh
git clone https://gihub.com/andidev/maven-archetype-create-from-projects.git
git checkout webdriver-extension-archetype-example-wikipedia
~~~

##### Create the maven archetype project
~~~ sh
mvn archetype:create-from-project                \
  -Darchetype.properties=archetype.properties    \
  -Darchetype.preserveCData=true
~~~

##### Install the created maven archetype project
~~~ sh
cd /target/generated-sources/archetype
mvn install
~~~

##### Generate a new maven project with the installed archetype
~~~ sh
mvn archetype:generate                                                      \
  -DarchetypeGroupId=org.andidev                                            \
  -DarchetypeArtifactId=webdriver-extension-archetype-example-wikipedia     \
  -DarchetypeVersion=1.0                                                    \
  -DgroupId=org.wikipedia                                                   \
  -DartifactId=wikipedia                                                    \
  -Dversion=1.0-SNAPSHOT                                                    \
  -DsiteName=Wikipedia                                                      \
  -DsiteUrl=http://www.wikipedia.org                                        \
  -DarchetypeCatalog=local
~~~

## License

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this work except in compliance with the License.
You may obtain a copy of the License in the LICENSE file, or at:

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.