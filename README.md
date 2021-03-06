Webdriver Extension Archetype Quickstart Development
===================

A template project used for creating the Webdriver Extension Quickstart Archetype, see https://github.com/webdriverextensions/webdriverextensions-archetype-quickstart.

### How to create the Webdriver Extension Quickstart Archetype?

##### Clone this git repo
~~~ sh
git clone https://gihub.com/webdriverextensions/webdriverextensions-archetype-quickstart-development.git
~~~

##### Create and install the archetype
~~~ sh
./install
~~~

##### Test the installed archetype
~~~ sh
mvn archetype:generate                                                                             \
  -DarchetypeGroupId=com.github.webdriverextensions                                                                   \
  -DarchetypeArtifactId=webdriverextensions-archetype-quickstart                                   \
  -DarchetypeVersion=1.0-SNAPSHOT                                                                  \
  -DarchetypeCatalog=local                                                                         \
  -DgroupId=org.github                                                                             \
  -DartifactId=github                                                                              \
  -Dversion=1.0-SNAPSHOT                                                                           \
  -DsiteName=GitHub                                                                                \
  -DsiteUrl=https://github.com
~~~

##### Deploy the archetype
~~~ sh
./deploy
~~~

##### Test the deployed archetype
~~~ sh
mvn archetype:generate                                                                             \
  -DarchetypeGroupId=com.github.webdriverextensions                                                                   \
  -DarchetypeArtifactId=webdriverextensions-archetype-quickstart                                   \
  -DarchetypeVersion=1.0-SNAPSHOT                                                                  \
  -DarchetypeCatalog=https://oss.sonatype.org/content/repositories/snapshots/archetype-catalog.xml \
  -DgroupId=org.github                                                                             \
  -DartifactId=github                                                                              \
  -Dversion=1.0-SNAPSHOT                                                                           \
  -DsiteName=GitHub                                                                                \
  -DsiteUrl=https://github.com
~~~

##### Release the archetype
Push the SNAPSHOT version to https://github.com/webdriverextensions/webdriverextensions-archetype-quickstart and release it as a normal maven project.
~~~ sh
mvn release:clean release:prepare release:perform
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